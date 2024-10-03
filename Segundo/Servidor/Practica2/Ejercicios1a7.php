<!DOCTYPE html>
<html>

<head>
</head>

<body>

<?php
// Ejercicio 1: Muestra el propósito del archivo PHP y define variables para ser usadas en los siguientes pasos
echo "EJ 1. Crea un archivo PHP para ejecutar en nuestro servidor XAMPP que muestre por pantalla lo siguiente:<br>";
$saludo1 = "Hola"; // Define la variable $saludo1 con el valor "Hola"
$saludo2 = "Mundo"; // Define la variable $saludo2 con el valor "Mundo"
$saludoCompleto = $saludo1 . " " . $saludo2; // Concatena $saludo1 y $saludo2 para crear el saludo completo

$esVerdadero = true; // Define una variable booleana con el valor verdadero

$pi = 3.14; // Define la constante de Pi

$numeros = array("valor1" => 1,  "valor2" => 2, "valor3" => 3); // Crea un array asociativo con tres elementos

 // Aquí se muestra el saludo completo// Muestra el saludo concatenado sin espacios
echo "Saludo: " . $saludoCompleto . "<br>";

// Muestra el valor de la variable booleana
echo "Es verdadero: " . $esVerdadero  . "<br>";

// Muestra el valor de Pi
echo "Valor de Pi: " . $pi . "<br>";

// Muestra los valores del array
echo "Valores del array: <br>";
print_r($numeros); // Usa la función print_r para imprimir el contenido del array
echo "<br>";

// Ejercicio 2: Cambia el valor de la variable booleana a falso y muestra el nuevo valor
echo "EJ 2. Cambia la variable de tipo boolean a valor “false”. Muestra el resultado obtenido al ejecutarlo con el servidor. ¿Qué ocurre y por qué? <br>";
echo "Es verdadero: " . $esVerdadero = false . "<br>"; // La variable ahora es falsa

// Ejercicio 3: Elimina los espacios del saludo concatenado
echo "EJ 3.Elimina los espacios de la variable concatenada utilizando la función correspondiente.<br>";
 echo "Saludo: " . str_replace(" ", "", $saludoCompleto) . "<br>"; // Muestra el saludo concatenado sin espacios

// Ejercicio 4: Muestra un mensaje explicando el uso de algunos operadores
echo "EJ 4.Muestra por pantalla el siguiente mensaje: <br>";
$longvar = "El operador “+” sirve para sumar el valor de variables. 
Con la “/” podemos dividir valores entre variables. El símbolo del dólar 
$ indica que estamos utilizando variables pero no lo usaremos en 
las constantes o globales. (1 punto)<br>";

// Ejercicio 5: Almacena la cadena anterior en una variable y muestra su longitud
echo "EJ 5.Almacena la cadena anterior en una variable y usa la función correspondiente para indicar la longitud de la cadena.<br>";
echo "Tiene " . strlen($longvar) . " carácteres.<br>"; // Usa strlen() para obtener la longitud de la cadena

// Ejercicio 6: Crea un array con 4 números float y muestra el valor de la primera posición (índice 0)
echo "EJ 6.Crea una variable de tipo Array que contenga 4 números de tipo float y muestra por pantalla la posición 0.<br>";
$numeros2 = array(1.5, 2.6, 3.7, 4.8); // Define un array con números flotantes
echo "La posición 0 es " . $numeros2[0] . "<br>"; // Muestra el valor en la posición 0

// Ejercicio 7: Recoge un valor enviado desde un cliente con el método GET y realiza operaciones con él
echo "EJ 7.Crear un programa en el servidor que recoja los valores enteros que le vienen de un programa cliente con el método GET y muestra el resultado por pantalla y realiza las siguientes operaciones.<br>";
$valor1 = $_GET["valor"] ?? null; // Recoge el valor de la URL con el método GET, si no existe, asigna null

// Comprueba si $valor1 está vacío y asigna un mensaje por defecto
if ($valor1 == "" ) {
    $valor1 = "¡Escribe algo!";
}

echo 'Número 1= ' . $valor1 . "<br>"; // Muestra el valor recibido

// Calcula la potencia (valor al cuadrado)
$potencia = $valor1 * $valor1;
echo "La potencia es " . $potencia . "<br>";

// Calcula la décima parte del valor
$decima = $valor1 / 10;
echo "La décima parte de " . $valor1 . " es " . $decima . ".<br>";

// Convierte el valor a cadena y lo concatena con un texto
$intToString = strval($valor1) . " Hola Mundo!<br>";
echo $intToString;

?>

</body>
</html>
