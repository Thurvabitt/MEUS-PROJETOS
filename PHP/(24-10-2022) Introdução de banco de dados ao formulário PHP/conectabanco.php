<?php
     $banco = new mysqli("localhost", "root", "", "faculdade", 3310);
     if($banco->connect_errno){
         echo "Erro ao conectar-se!";
     }else{
         echo "Conectado com sucesso!";
     }
?>