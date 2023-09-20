import { View, FlatList, Alert } from "react-native";
import {Avatar, ListItem} from '@rneui/themed';
import { useContext } from 'react';
import UserContext from '../context/UserContext';

export default props => {
   const {state,dispatch} = UserContext(UserContext)
   //console.warn(Object.keys(cont.state.users))

    function deleteConfirm(user){
        Alert.alert('Excluir usuário!', 'Tem certeza que deseja excluir o usuário?',
        [
            {
                text: "Sim",
                onPress(){
                    //console.warn("Excluido o id: " + user.id)
                    dispatch({
                        type: 'deleteUser',
                        payload: user
                    })
                }
            },
            {
                text: "Não"
            }
        ]
        )
    }

    function getUserItem({item: user}){
        return(
            <ListItem

            >
                <Avatar 
                    rounded
                    source={{uri: user.avatarURL}}
                />
                <ListItem.Content>
                    <ListItem.Title>{user.name}</ListItem.Title>
                    <ListItem.Subtitle>{user.email}</ListItem.Subtitle>
                </ListItem.Content>
                <ListItem.Chevron 
                    name="edit"
                    color="orange"
                    size={25}
                    onPress={()=>props.navigation.navigate("UserForm", user)}
                />
                <ListItem.Chevron 
                    name="delete"
                    color="red"
                    size={25}
                    onPress={()=> {deleteConfirm(user)}}
                />
            </ListItem>
        )
    }

    return(
        <View>
            <FlatList 
                data={state.users}
                keyExtractor={ user => user.id}
                renderItem={getUserItem}
            />
        </View>
    )
}

