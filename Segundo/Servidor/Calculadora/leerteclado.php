<?php
echo "Introduce un valor: ";
fscanf(STDIN, "%d\n", $numero);

echo 'El valor es: ' . $numero . "\n";

if (!empty($numero)) {
    switch ($numero) {
        case $numero < 5:
            echo $numero . " es menor que 5";
            break;
        case $numero <= 15:
            echo $numero . " es entre 5 y 15";
            break;
        case $numero > 15:
            echo $numero . " es mayor que 15";
            break;
        default:
            echo "Error";
            break;
    }
}
?>