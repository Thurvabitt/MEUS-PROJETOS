<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP</title>
</head>
<body>
    
<div>
    <h1>Entrar com nome, genero e idade de uma pessoa</h1>

    <p>exigências do professor:<br>
"-SE idade for maior que 25, exiba ao usuário "pode se cadastrar"; <br>
-SE idade for menos que 25, exiba ao usuário "NÃO pode se cadastrar";"
</p>
        <form action="resultado.php" method="post">   
            Seu nome: <input type="text" name="nome"> 
                <p></p>


            <label for="genero">Seu gênero</label>
                <select id="genero" name="genero">
                    <option value="Feminino">Feminino</option>
                    <option value="Masculino">Masculino</option>
                    <option value="Outro">Outro</option>
                </select>

                <p></p>
            Sua idade: <input type="number" name="idade">
                <p></p>
            <input type="submit" value="Enviar">
        </form>





</div>
</body>
</html>