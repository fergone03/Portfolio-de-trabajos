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


$numeros = [
  "valor1" => 1, 
  "valor2" => 2, 
  "valor3" => 3,
];

echo "Saludo: " . $saludoCompleto . "<br>";
echo "Es verdadero: " . ($esVerdadero) . "<br>";
echo "Valor de Pi: " . $pi . "<br>";
echo "Valores del array: <br>";
print_r($numeros); 

?>

</body>
</html>