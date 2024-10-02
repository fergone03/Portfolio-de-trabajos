<!DOCTYPE html>
<html>

<head>
</head>

<body>

<?php

$valor1 = $_GET["valor"] ?? null;

if ($valor1 == "" ) {
    $valor1 = "¡Escribe algo!";
}
//EJ8 pero se pone aquí porque si no no se muestra 
if (is_int($valor1)) {
    echo "El valor es un entero: " . $valor1;
} elseif (is_string($valor1)) {
    echo "El valor es una cadena de texto: " . $valor1;
} elseif (is_bool($valor1)) {
    echo "El valor es un booleano: " . ($valor1 ? 'true' : 'false');
} else {
    echo "El tipo de dato no es reconocido.";
}
//
//URLhttp://localhost:3000/Pr%C3%A1ctica2/Practica2.php?numero1=casa


?>

</body>
</html>
