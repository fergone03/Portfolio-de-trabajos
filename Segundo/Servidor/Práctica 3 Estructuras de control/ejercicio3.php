<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio3Arrays</title>
</head>
<body>
    <?php
    // Definición de un array llamado $array1 con claves y valores float.
    $array1 = ["float1" => 1.2,"float2" => 3.4,"float3" => 4.5,"float4" => 6.7,"float5" => 8.9];

    // Primer bucle foreach: recorre el array y muestra cada valor en una nueva línea (<br>).
    foreach($array1 as $item) {
    echo "".$item."<br>";}; // Se imprime cada valor del array seguido de un salto de línea.

    // Se elimina el elemento del array que tiene la clave "float3".
    unset($array1["float3"]);
    echo "<br>"; // Añade una línea en blanco para separar las dos listas de salida.

    // Segundo bucle foreach: recorre el array $array1 nuevamente, pero ahora sin el elemento "float3".
    foreach($array1 as $item){
        echo "".$item."<br>"; // Se imprime de nuevo cada valor del array, pero sin el valor eliminado.
     };

    // Se elimina el array $array1 por completo.
    unset($array1);
    ?>
</body>
</html>
