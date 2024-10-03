<!DOCTYPE html>
<html>

<head>
</head>

<body>

<?php
// Recibe un valor a través del método GET desde la URL
$valor1 = $_GET["valor"] ?? null; // Si no se pasa ningún valor, la variable será null

// Verifica si el valor recibido es una cadena vacía y muestra un mensaje en ese caso
if ($valor1 == "") {
    $valor1 = "¡Escribe algo!"; // Si la variable está vacía, asigna un mensaje como aviso
}

// Ejercicio 8: 
echo "EJ8.Crear un programa en el servidor que recoja los valores que le vienen desde un coche de la fórmula 1 con el método GET y muestre por pantalla que tipo de variable es utilizando la respectiva función (es posible que necesitéis utilizar el condicional “If”) y su valor en un “echo”. <br>"; 

// Verifica el tipo de variable de $valor1 y muestra el tipo y el valor utilizando diferentes funciones PHP

// Si el valor es de tipo entero
if (is_int($valor1)) {
    echo "El valor es un entero: " . $valor1; // Muestra que es un entero y su valor

// Si el valor es una cadena de texto
} elseif (is_string($valor1)) {
    echo "El valor es una cadena de texto: " . $valor1; // Muestra que es una cadena y su valor

// Si el valor es un booleano
} elseif (is_bool($valor1)) {
    echo "El valor es un booleano: " . ($valor1 ? 'true' : 'false'); // Si es true muestra 'true', si es false muestra 'false'

// Si el tipo de dato no es reconocido (ni entero, ni cadena, ni booleano)
} else {
    echo "El tipo de dato no es reconocido."; // Muestra un mensaje indicando que el tipo de dato no es reconocido
}

// Ejemplo de uso:
// Si el coche envía, por ejemplo, los litros de combustible gastados, se usaría una URL como:
// http://localhost:3000/ejercicio8.php?valor=1 
// Como el valor es un entero, se ejecutará la condición (is_int($valor1)) y mostrará: "El valor es un entero: 1"

// Si el coche envía la posición actual (ej. "1º"), se usaría una URL como:
// http://localhost:3000/ejercicio8.php?valor=1º 
// Como el valor es una cadena de texto, se ejecutará la condición (is_string($valor1)) y mostrará: "El valor es una cadena de texto: 1º"
    
// Si el coche envía un valor booleano (ej. el motor está encendido), se usaría una URL como:
// http://localhost:3000/ejercicio8.php?valor=true 
// Como el valor es booleano, se ejecutará la condición (is_bool($valor1)) y mostrará: "El valor es un booleano: true"

?>

</body>
</html>
