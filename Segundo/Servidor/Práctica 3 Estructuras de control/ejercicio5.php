<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio5Arrays</title>
</head>
<body>
    <?php
    // Se define un array llamado $datos, donde cada clave ("User1", "User2", etc.)  está asociada a otro array con información del usuario (nombre, contraseña, y perfil).
    $datos = array(
        "User1" => array('Condoriano', 'Qu3N0S07P1R4tª', 'admin'), // Datos del User1
        "User2" => array('BigMom', 'M3F4Lt4nG1G4nt35', 'user'),    // Datos del User2
        "User3" => array('RoronoaZoro', '$4ML0ST', 'admin')        // Datos del User3
    );

    // Captura el valor del parámetro 'pass' enviado a través de la URL usando el método GET.
    $newPass = $_GET['pass'];

    // Si $newPass no está vacío, es decir, si se ha proporcionado un valor de contraseña en la URL...
    if (!empty($newPass)) {
        // Se actualiza la contraseña de 'User2' el segundo elemento del array con el nuevo valor de $newPass.
        $datos['User2'][1] = $newPass; 
    }

    // Bucle foreach para recorrer todo el array $datos.
    foreach ($datos as $usuario => $info) {
        // Imprime el nombre del usuario.
        echo "$usuario: ";
        
        // Segundo foreach para recorrer la información de cada usuario.
        foreach ($info as $solucion) {
            // Imprime cada dato del usuario seguido de un espacio. 
            echo "$solucion ";
        }
        echo "<br>"; // Añade un salto de línea después de mostrar la información de cada usuario.
    }
    ?>
</body>
</html>
