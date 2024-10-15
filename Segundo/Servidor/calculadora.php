<?php

$numeroCalculadora1 = 10; 
$numeroCalculadora2 = 5; 
$operacionAHacer = "sumar"; 
$resultado = null;

switch ($operacionAHacer) {
    case "sumar":
        $resultado = $numeroCalculadora1 + $numeroCalculadora2;
        break;
    case "restar":
        $resultado = $numeroCalculadora1 - $numeroCalculadora2;
        break;
    case "multiplicar":
        $resultado = $numeroCalculadora1 * $numeroCalculadora2;
        break;
    case "dividir":
        if ($numeroCalculadora2 == 0) {
            echo "Error: No se puede dividir por cero.\n";
            exit;
        }
        $resultado = $numeroCalculadora1 / $numeroCalculadora2;
        break;
    default:
        echo "Error: Operación no válida. Usa 'sumar', 'restar', 'multiplicar' o 'dividir'.\n";
        exit;
}

echo "El resultado de la operación $operacionAHacer es: $resultado\n";
