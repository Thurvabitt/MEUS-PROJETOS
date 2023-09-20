import { StyleSheet } from "react-native";

export default StyleSheet.create({
    containerCentralized:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
    },
    textMedium:{
        fontSize: 35,
        fontWeight: "bold"
    },
    loginContainer:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#003f5c",
    },
    loginTextInputs:{
        backgroundColor: "#465881",
        width: 300,
        height: 55,
        marginTop: 30,
        fontSize: 15,
        borderRadius: 30,
        padding: 10,
        color: "#084160",
    },
    loginForgotPassword:{
        color: 'white',
        marginTop: 25,
        marginBottom: 45,
    },
    loginButton:{
        width: 300,
        height: 55,
        backgroundColor: "#3cb371",
        borderRadius: 30,
        justifyContent: "center",
        alignItems: "center"
    },
    loginButtonText:{
        color: 'white',
    },
    loginImageLogo:{
        width: 256,
        height: 256,
    },
    formInputDescription:{
        fontSize: 22,
        backgroundColor: 'gray',
    },
    formContainer:{
        marginLeft: 20,
        marginTop: 5,
        marginRight: 22,
    },
    formButtonSubmit:{
        marginTop: 20,
    }
})