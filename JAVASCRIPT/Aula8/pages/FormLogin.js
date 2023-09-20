import { TouchableOpacity, Image, Text, TextInput, View, KeyboardAvoidingView } from "react-native"
import Estilo from "../components/Estilo"
import { useState } from "react"

export default props => {
    [valorLogin, setValorLogin] = useState("");
    [valorSenha, setValorSenha] = useState("");

    return(
        <KeyboardAvoidingView  style={Estilo.loginContainer}>
            <View style={Estilo.loginContainer}>
                <Image source={require('../assets/logo.png')} style={Estilo.loginImageLogo} />
                <TextInput 
                    style={Estilo.loginTextInputs}
                    placeholder="Digite o login"
                    value={valorLogin}
                    onChangeText={ (valorLogin) => setValorLogin(valorLogin)}
                />
                <TextInput
                    style={Estilo.loginTextInputs}
                    placeholder="Digite a senha"
                    value={valorSenha}
                    onChangeText={ (valorSenha) => setValorSenha(valorSenha) }
                    secureTextEntry={true}
                />
                <Text style={Estilo.loginForgotPassword}>Esqueceu a senha?</Text>
                <TouchableOpacity 
                    style={Estilo.loginButton}
                    onPress={ ()=>{
                        if(valorLogin === "Arthur"){
                            props.navigation.navigate("UserList")
                        }
                    }} 
                >
                    <Text style={Estilo.loginButtonText}>LOGIN</Text>    
                </TouchableOpacity>
                <Text style={Estilo.loginForgotPassword}>Criar conta</Text>
            </View>
        </KeyboardAvoidingView>
   
    )
}