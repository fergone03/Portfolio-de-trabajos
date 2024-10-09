<?php
$miArray = [
    "float1" => 3.14,
    "float2" => 2.71,
    "float3" => 1.61,
    "float4" => 0.57,
    "float5" => 1.41
];

echo "Valores iniciales del array:\n";
foreach ($miArray as $clave => $valor) {
    echo "$clave: $valor\n";
}

unset($miArray["float3"]);

echo "\nValores del array después de eliminar float3:\n";
foreach ($miArray as $clave => $valor) {
    echo "$clave: $valor\n";
}

$miArray = null;