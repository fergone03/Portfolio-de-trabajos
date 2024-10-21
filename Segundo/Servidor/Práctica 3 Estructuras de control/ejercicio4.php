<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio4Arrays</title>
</head>
<body>
    <?php
    // Se define un array llamado $datos, donde cada clave ("User1", "User2", etc.)  está asociada a otro array con información del usuario (nombre, contraseña, y perfil).
    $datos = array (
        "User1" => array('Condoriano','Qu3N0S07P1R4tª','admin'), // User1 tiene estos 3 elementos.
        "User2" =>  array('BigMom','M3F4Lt4nG1G4nt35','user'),   // User2 tiene estos 3 elementos.
        "User3" =>  array('RoronoaZoro','$4ML0ST','admin'),       // User3 tiene estos 3 elementos.
    );

    // Se imprimen los perfiles de cada usuario accediendo a la posición 2 (perfil) de cada array de usuario.
    echo "El usuario 1 tiene perfil: ".$datos["User1"][2]."</br>"; 
    echo "El usuario 2 tiene perfil: ".$datos["User2"][2]."</br>"; 
    echo "El usuario 3 tiene perfil: ".$datos["User3"][2]."</br>"; 

    // Se hace un bucle foreach que recorre el array $datos. 
    // $item es la clave ("User1", "User2", etc.), y $valor es el array asociado a cada usuario.
    foreach ($datos as $item => $valor) {
        echo $item; // Imprime el nombre del usuario.
        
        // Este segundo foreach recorre el array de valores asociado a cada usuario ($valor).
        foreach($valor as $item2 => $valor2){
            echo  ': '. $valor2; // Imprime los detalles de cada usuario separados por ":".
        };
        echo '<br/>'; // Salto de línea después de imprimir los datos de cada usuario.
    }

    // Se elimina el array asociado a "User3" utilizando unset().
    unset($datos['User3']);
    echo '<br/>';

    // Esta línea generará un error, porque ya hemos eliminado los datos de "User3" intentando acceder a "User3" que ya no existe..
    echo "El usuario 3 tiene perfil: ".$datos["User3"]."</br>";
    ?>
</body>
</html>
