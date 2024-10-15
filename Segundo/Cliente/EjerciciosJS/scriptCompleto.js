function clickBoton1() {
  alert("¡Hola!");
}
function sobreBoton1() {
  alert("¡Adiós!");
}
var promptNombre = prompt("¿Cuál es tu nombre?");
if (promptNombre === null || promptNombre === "") {
  alert("¡Escribe tu nombre!");
} else {
  console.log("Bienvenid@ a mi página " + promptNombre);
}
var numeroCalculadora1;
var numeroCalculadora2;
function Calculadora() {
  do {
    numeroCalculadora1 = parseFloat(prompt("Escribe un número"));
    if (isNaN(numeroCalculadora1) || numeroCalculadora1 === null) {
      alert("¡Escribe un número válido!");
    }
  } while (isNaN(numeroCalculadora1) || numeroCalculadora1 === null);

  do {
    numeroCalculadora2 = parseFloat(prompt("Escribe otro número"));
    if (isNaN(numeroCalculadora2) || numeroCalculadora2 === null) {
      alert("¡Escribe un número válido!");
    }
  } while (isNaN(numeroCalculadora2) || numeroCalculadora2 === null);

  var booleanBucle = true;

  while (booleanBucle) {
    var opcion = parseInt(
      prompt(
        "Panel de opciones: \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Volver a introducir los números\n6. Salir del programa"
      )
    );

    switch (opcion) {
      default:
        alert("Escribe un número del 1-6");
        break;
      case 1:
        var suma = numeroCalculadora1 + numeroCalculadora2;
        alert("La suma es: " + suma);
        break;
      case 2:
        var resta = numeroCalculadora1 - numeroCalculadora2;
        alert("La resta es: " + resta);
        break;
      case 3:
        var producto = numeroCalculadora1 * numeroCalculadora2;
        alert("El producto es: " + producto);
        break;
      case 4:
        if (numeroCalculadora2 === 0) {
          alert("No se puede dividir entre cero.");
        } else {
          var division = numeroCalculadora1 / numeroCalculadora2;
          alert("La división es: " + division);
        }
        break;
      case 5:
        do {
          numeroCalculadora1 = parseFloat(prompt("Escribe un nuevo número"));
          if (isNaN(numeroCalculadora1) || numeroCalculadora1 === null) {
            alert("¡Escribe un número válido!");
          }
        } while (isNaN(numeroCalculadora1) || numeroCalculadora1 === null);

        do {
          numeroCalculadora2 = parseFloat(prompt("Escribe otro nuevo número"));
          if (isNaN(numeroCalculadora2) || numeroCalculadora2 === null) {
            alert("¡Escribe un número válido!");
          }
        } while (isNaN(numeroCalculadora2) || numeroCalculadora2 === null);
        break;
      case 6:
        alert("Saliendo del programa...");
        booleanBucle = false;
    }
  }
}
