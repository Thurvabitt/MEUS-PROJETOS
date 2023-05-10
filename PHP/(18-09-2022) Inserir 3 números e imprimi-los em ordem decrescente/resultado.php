<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP</title>
</head>
<body> 

    <?php 
    $num1 = $_POST["num1"];
    $num2 = $_POST["num2"];
    $num3 = $_POST["num3"];

    if($num2 < $num1){
        $d=$num1;
        $num1=$num2;
        $num2=$d;
    }


    if($num3 < $num1){
        $d=$num1;
        $num1=$num3;
        $num3=$d; 
    }


    if($num3 < $num2){;
        $d=$num2;
        $num2=$num3;
        $num3=$d;
    }

    echo "<h2> $num3 - $num2 - $num1 </h2>";
 ?>
 
 </body>
 </html>
