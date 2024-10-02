<!DOCTYPE html>
<html>

<head>
</head>

<body>

<?php

$saludo1 = "Hola";
$saludo2 = "Mundo";
$saludoCompleto = $saludo1 . " " . $saludo2;

$esVerdadero = false;

$pi = 3.14;

$numeros = array("valor1" => 1,  "valor2" => 2, "valor3" => 3, );

echo "Saludo: " . str_replace(" ", "", $saludoCompleto) . "<br>";
echo "Es verdadero: " . ($esVerdadero ? "true" : "false") . "<br>";
echo "Valor de Pi: " . $pi . "<br>";
echo "Valores del array: <br>";
print_r($numeros);
echo "<br>";

$longvar = "El operador “+” sirve para sumar el valor de variables. 
Con la “/” podemos dividir valores entre variables. El símbolo del dólar 
$ indica que estamos utilizando variables pero no lo usaremos en 
las constantes o globales. (1 punto)<br>";
echo "Tiene " . strlen($longvar) . " carácteres.<br>";

$numeros2 = array(1.5, 2.6, 3.7, 4.8);
echo "La posición 0 es " . $numeros2[0] . "<br>";

$valor1 = (isset($_GET["numero1"]) ? $_GET["numero1"] : '');
$valor2 = (isset($_GET["numero2"]) ? $_GET["numero2"] : '');

if ($valor1 == "") {
    $valor1 = "Escribe algo";
}

echo 'Número 1= ' . $valor1 . "<br>";
echo 'Número 2= ' . $valor2 . "<br>";

$suma = $valor1 + $valor2;
echo "La suma de ambos números es " . $suma . "<br>";

?>

</body>
</html>
