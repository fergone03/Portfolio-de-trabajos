<?php
    echo "Introduce el nombre del compañero:";
    fscanf(STDIN,"%s\n",$compae);

    saluda($compae);
    

    function saluda($compañero){
        echo "Hola $compañero";
    }
?>