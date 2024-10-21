<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio6Arrays</title>
</head>
<body>
    <?php
        // Se obtiene el valor del número desde la URL utilizando el método GET.
        $numero = $_GET["numero"];

        // Se imprime una parte que muestra la tabla de multiplicar del número recibido.
        echo "Tabla del ".$numero."<br>";

        // Bucle for que va desde 0 hasta 10.
        // En cada iteración se calcula y se imprime el resultado de la multiplicación del número por el índice actual ($i).
        for ($i = 0 ; $i < 11; $i++){
            echo $numero . " x " . $i . " = " . ($numero * $i) . "</br>";
        }
    ?>
</body>
</html>
