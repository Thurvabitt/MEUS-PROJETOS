<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

</head>
<body> 
<div class= "echo">
<center>

<?php
    echo "<h1>minha primeira página php</h1>";
    //o "echo" tem a função de exibir algo na tela;
    
    $idade= 18;
    $nome= "Arthur";
    //usar "$" para variáveis de seu código;

    echo "1ra maneira: Meu nome é $nome e tenho $idade anos. <br>";
    //maneira mais fácil, pode usar sempre;

    echo '2nda maneira: . Meu nome é '.$nome.' e tenho '.$idade.' anos.';
    //outro método para chegar á mesma exibição;
    


    echo "<h2>-Operadores Matemáticos</h2> ";
    $valorA = 3;
    $valorB = 2;
    //variaveis para o operador de SOMA

    $soma = $valorA + $valorB;
    //operador de SOMA "+"
    echo "RESULTADO DA SOMA: = $soma <br>";


    $sub = $valorA - $valorB;
    //operador de SUBTRAÇÃO "-"
    echo "RESULTADO DA SUBTRAÇÃO = $sub <br>";

    $mult = $valorA * $valorB;
    //operador de MULTIPLICAÇÃO "*"
    echo "RESULTADO DA MULTIPLICAÇÃO = $mult <br>";

 
    $divi = $valorA / $valorB;
    //operador de DIVISÃO "/"
    echo "RESULTADO DA DIVISÃO = $divi <br>";


    $rest = $valorA % $valorB;
    //operador de RESTO DA DIVISÃO  "%"
    echo "RESULTADO DO RESTO DA DIVISÃO = $rest <br>";


    $pot = $valorA ** $valorB;
    //operador de POTÊNCIAÇÃO "**"
    echo "RESULTADO DA POTÊNCIAÇÃO = $pot <br>";

    
    echo gettype($pot)
    //utilizado para identificar o tipo de variável. String, n° inteiro etc.
?>

</center>
</body>
</html>