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
               $num1 = $_POST["num1"];
               $num2 = $_POST["num2"];
               $resultado = $num1 + $num2;     
    ?>  
</div>


<div>
    <?php
        if($resultado >= 10){
            echo "Nosso sistema adicionou 8 ao resultado de sua adição: ";
        echo $resultado + 8;
        }
        

        if($resultado < 10){
            echo "Nosso sistema subtraiu 5 ao resultado de sua adição: ";
            echo $resultado - 5;
        }
    ?>
</div>

</body>
</html>