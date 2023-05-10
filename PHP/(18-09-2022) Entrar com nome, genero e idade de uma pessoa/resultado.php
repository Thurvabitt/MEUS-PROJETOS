<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<div>
    <?php 
        $nome = $_POST["nome"];
        $idade = $_POST["idade"];

        if($idade > 25){
            echo "<h2>Você pode se cadastrar</h2> <br>";

            echo "Nome inserido: ", $nome;
            echo "<br> Idade Inserida: ", $idade;

        }

        if($idade < 25){
            echo "<h2>Você não pode se cadastrar </h2> <br>";

            echo "Nome inserido: ", $nome;
            echo "<br> Idade Inserida: ", $idade;

        }

        if (isset($_POST['genero'])) {
            $selectedOption = $_POST['genero'];
            echo "<br>Gênero selecionado: " . $selectedOption;
        }
    ?>  
</div>  


</body>
</html>