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
    <?php
        $mes = $_POST ["mes"]; 
    ?>          
</div>

<div>
    <?php
        if($mes == 1){
            echo "o mês corresponde ao valor inserido é JANEIRO";
        }

        if($mes == 2){
            echo "o mês corresponde ao valor inserido é FEVEREIRO";
        }

        if($mes == 3){
            echo "o mês corresponde ao valor inserido é MARÇO";
        }

        if($mes == 4){
            echo "o mês corresponde ao valor inserido é ABRIL";
        }

        if($mes == 5){
            echo "o mês corresponde ao valor inserido é MAIO";
        }

        if($mes == 6){
            echo "o mês corresponde ao valor inserido é JUNHO";
        }

        if($mes == 7){
            echo "o mês corresponde ao valor inserido é JULHO";
        }

        if($mes == 8){
            echo "o mês corresponde ao valor inserido é AGOSTO";
        }

        if($mes == 9){
            echo "o mês corresponde ao valor inserido é SETEMBRO";
        }

        if($mes == 10){
            echo "o mês corresponde ao valor inserido é OUTUBRO";
        }

        if($mes == 11){
            echo "o mês corresponde ao valor inserido é NOVEMBRO";
        }

        if($mes ==12){
            echo "o mês corresponde ao valor inserido é DEZEMBRO";
        }

        if($mes > 12){
            echo "O valor digitado não é válido, redigite um valor de 1 a 12";
        }
    ?>    
</div>

    
</body>
</html>