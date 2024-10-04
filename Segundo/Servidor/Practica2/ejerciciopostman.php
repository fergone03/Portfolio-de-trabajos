<!DOCTYPE html>
<html>
<head>
    <title>Ejercicio Opcional Tema 2</title>
</head>
<body>
    <?php
        // Recibimos los valores de las variables por método GET (desde la URL)
        $errorMotor = $_GET['ErrorMotor'] ?? null; // Si no está definida la variable, se asigna null
        $errorMotorDescripcion = "Aviso: No se ha proporcionado información sobre un posible fallo en el motor.<br>";
        
        $errorSuspension = $_GET['ErrorSuspension'] ?? null; // Si no está definida la variable, se asigna null
        $errorSuspensionDescripcion = "Aviso: No se ha proporcionado información sobre un posible fallo en la suspensión.<br>";
        
        $errorElectrico = $_GET['ErrorElectrico'] ?? null; // Si no está definida la variable, se asigna null
        $errorElectricoDescripcion = "Aviso: No se ha proporcionado información sobre un posible fallo en el sistema eléctrico.<br>";

        // Verificamos si hay errores usando GET y mostramos las descripciones correspondientes
        if ($errorMotor === "True") {
            echo $errorMotorDescripcion;
        } else if ($errorSuspension === "True") {
            echo $errorSuspensionDescripcion;
        } else if ($errorElectrico === "True") {
            echo $errorElectricoDescripcion;
        }
    
        // Recibimos los valores de las variables por método POST (generalmente desde un formulario)
        $errorMotor = $_POST['ErrorMotor'] ?? null; // Si no está definida la variable, se asigna null
        $errorMotorDescripcion = "Aviso: No se ha proporcionado información sobre un posible fallo en el motor.<br>";
        
        $errorSuspension = $_POST['ErrorSuspension'] ?? null; // Si no está definida la variable, se asigna null
        $errorSuspensionDescripcion = "Aviso: No se ha proporcionado información sobre un posible fallo en la suspensión.<br>";
        
        $errorElectrico = $_POST['ErrorElectrico'] ?? null; // Si no está definida la variable, se asigna null
        $errorElectricoDescripcion = "Aviso: No se ha proporcionado información sobre un posible fallo en el sistema eléctrico.<br>";     
        
        // Verificamos si hay errores usando POST y mostramos las descripciones correspondientes
        if ($errorMotor === "True") {
            echo $errorMotorDescripcion, 's';
        } 
        if ($errorSuspension === "True") {
            echo $errorSuspensionDescripcion;
        }
        if ($errorElectrico === "True") {
            echo $errorElectricoDescripcion;
        }
    ?>
</body>
</html>
