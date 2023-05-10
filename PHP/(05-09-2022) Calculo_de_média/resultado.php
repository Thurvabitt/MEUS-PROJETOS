<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body> 
    <h1>CALCULO DE MÉDIA</h1>
    <div>
        <?php
        $nota1 = $_POST["nota1"];
        $nota2 = $_POST["nota2"];
        $media = ($nota1 + $nota2)/2;
        ?>    
    </div>

<p> sua média é: <?php echo $media ?> </p> 

<p>Situação: </p>
<?php
if($media >= 6.0){
    echo "Aprovado!";
}
else if($media >= 2.0){
echo "Necessário a realização da prova substitutiva(recuperação)";

}
else{
    echo "Reprovado!";
}
?>

</body>    
</html>