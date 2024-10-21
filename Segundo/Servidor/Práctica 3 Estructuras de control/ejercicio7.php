<!-- Ejercicio7Arrays -->
<?php
    // Imprime el mensaje de bienvenida de la calculadora.
    echo "Calculadora\n";

    // Solicita al usuario que introduzca el primer número.
    echo "¡Introduce un número!: ";
    // Utiliza fscanf para leer un número entero desde la entrada estándar (teclado) y lo almacena en $numero1.
    fscanf(STDIN, "%d\n", $numero1);

    // Solicita al usuario que introduzca el segundo número.
    echo "¡Introduce otro número!: ";
    // Lee el segundo número entero desde la entrada estándar (teclado) y lo almacena en $numero2.
    fscanf(STDIN, "%d\n", $numero2);

    // Variable booleana para controlar el ciclo do-while.
    $boooleano = true;

    // Bucle do-while para mostrar el menú y realizar las operaciones.
    do {
        // Imprime el menú de opciones disponibles para el usuario.
        echo "\n1) Sumar.\n2) Restar.\n3) Multiplicar.\n4) Dividir.\n5) Cambiar de números.\n6) Salir.\n";
        
        // Lee la opción seleccionada por el usuario.
        fscanf(STDIN, "%d\n", $caso);

        // Estructura switch para manejar las diferentes opciones del menú.
        switch ($caso) {
            case '1':  // Si el usuario selecciona '1', se realiza la suma.
                echo "El resultado es: ", ($numero1 + $numero2);
                break;
            case '2':  // Si el usuario selecciona '2', se realiza la resta.
                echo "El resultado es: ", ($numero1 - $numero2);
                break;
            case '3':  // Si el usuario selecciona '3', se realiza la multiplicación.
                echo "El resultado es: ", ($numero1 * $numero2);
                break;
            case '4':  // Si el usuario selecciona '4', se realiza la división.
                // Verifica si el segundo número es 0 para evitar la división por cero.
                if ($numero2 == "0") {
                    // Si el segundo número es 0, muestra un mensaje y pide que cambie los números.
                    echo "No se puede dividir entre 0, así que necesitas cambiar los números.\n";
                    echo "¡Introduce un número!: ";
                    fscanf(STDIN, "%d\n", $numero1);  // Lee un nuevo valor para $numero1.
                    echo "¡Introduce otro número!: ";
                    fscanf(STDIN, "%d\n", $numero2);  // Lee un nuevo valor para $numero2.
                } else {
                    // Si el segundo número no es 0, realiza la división.
                    echo "El resultado es: ", ($numero1 / $numero2);
                }
                break;
            case '5':  // Si el usuario selecciona '5', el programa finaliza el bucle y sale.
                echo "Byeee\n";
                $boooleano = false;  // Cambia la variable booleana a false para salir del ciclo.
                break;
            default:  // Si el usuario introduce una opción inválida, muestra un mensaje de error.
                echo "¡Escribe números válidos!";
                break;
        }
    } while ($boooleano);  // El bucle continúa mientras $boooleano sea true.
?>
