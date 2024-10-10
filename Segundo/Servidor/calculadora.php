<?php

$num1 = 10; 
$num2 = 5; 
$operacion = "sumar"; 



$resultado = null;

switch ($operacion) {
    case "sumar":
        $resultado = $num1 + $num2;
        break;
    case "restar":
        $resultado = $num1 - $num2;
        break;
    case "multiplicar":
        $resultado = $num1 * $num2;
        break;
    case "dividir":
        if ($num2 == 0) {
            echo "Error: No se puede dividir por cero.\n";
            exit;
        }
        $resultado = $num1 / $num2;
        break;
    default:
        echo "Error: Operación no válida. Usa 'sumar', 'restar', 'multiplicar' o 'dividir'.\n";
        exit;
}

echo "El resultado de la operación $operacion es: $resultado\n";
