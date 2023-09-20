import React, { createContext, useReducer } from "react";
import users from "../data/users";

const initialState = {users}
const UserContext = createContext({})


export const UserProvider = props => {
    function reducer(state, action){
        //console.warn(action)
        if(action.type === 'deleteUser'){
            const UserReceive = action.payload
            return{
                ...state,
                users: state.users.filter(u => u.id !== userReceive.id)
            }
        }
    }

    const [state, dispatch] = useReducer(reducer, initialState)
    
    return(
        <UserContext.Provider
            value={{
                state,
                dispatch
            }}
        >
            {props.children}
        </UserContext.Provider>
    )
}

export default UserContext