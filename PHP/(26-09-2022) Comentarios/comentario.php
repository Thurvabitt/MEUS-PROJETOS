<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comentário</title>
</head>
<body>
    <h1>Bem-Vindo</h1>

    <div>
        <?php
            $nome = $_GET ["nome"];
            $comentario = $_GET ["comentario"];
            $email = $_GET ["email"];
        ?>
    </div>

    <div>
        <?php
            echo "Usuário: ", $nome;
        ?>
    </div>

    <div>
        <?php
            echo "<br>Texto digitado: ", $comentario;
        ?>
    </div>

    <div>
        <?php
        if(str_ends_with($email, "gmail.com")){
            echo "Você é cliente Google";

        }elseif(str_ends_with($email, "outlook.com")){
            echo "você é cliente Microsoft";
        } 
        
        ?>
        
    </div>

</body>
</html>