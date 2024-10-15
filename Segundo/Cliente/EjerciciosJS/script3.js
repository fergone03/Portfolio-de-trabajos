var numeroCalculadora1 = parseFloat(prompt("Escribe un número"));
var numeroCalculadora2 = parseFloat(prompt("Escribe otro número"));
var booleanBucle = true;
if (
  numeroCalculadora1 === "" ||
  numeroCalculadora1 === null ||
  (isNaN(numeroCalculadora1) && numeroCalculadora2 === "") ||
  numeroCalculadora2 === null ||
  isNaN(numeroCalculadora2)
) {
  alert("Escribe un numero válido");
}
while (booleanBucle) {
  var opcion = parseInt(
    prompt(
      "Panel de opciones: \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Volver a introducir los números\n6. Salir del programa"
    )
  );
  switch (opcion) {
    default:
      alert("escribe un numero del 1-6");
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
      numeroCalculadora1 = parseFloat(prompt("Escribe un nuevo número"));
      numeroCalculadora2 = parseFloat(prompt("Escribe otro nuevo número"));
      break;
    case 6:
      alert("Saliendo del programa...");
      booleanBucle = false;
  }
}
