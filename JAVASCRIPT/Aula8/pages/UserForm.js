import { useState } from "react";
import { Text, TextInput, View } from "react-native";
import Estilo from "../components/Estilo";


export default ({route}) => {
    //console.warn(Object.keys(props.route.params));
    const [userParam, setUserParam] = useState(route.params ? route.params: {})
    return(
        <>
            <View>
                <Text style={Estilo.formInputDescription}>Nome: </Text>
                <TextInput 
                    style={Estilo.formInputDescription}
                    value={userParam.name}
                    onChangeText={ name => setUserParam({...userParam, name}) }
                />

                <Text style={Estilo.formInputDescription}>E-mail: </Text>
                <TextInput 
                    style={Estilo.formInputDescription}
                    value={userParam.email}
                    onChangeText={ email => setUserParam({...userParam, email}) }
                />

                <Text style={Estilo.formInputDescription}>Senha: </Text>
                <TextInput 
                    style={Estilo.formInputDescription}
                    value={userParam.senha}
                    onChangeText={ senha => setUserParam({...userParam, senha}) }
                />

                <Button
                style={Estilo.formButtonSubmit}
                    title="salvar"
                    onPress={() => navigation.goBack()}
                />
            </View>
        </>
    )
}

