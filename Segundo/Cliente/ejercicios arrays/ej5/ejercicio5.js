let colors = [
  "red",   // Lista de colores disponibles para las franjas
  "green",
  "blue",
  "yellow",
  "pink",
  "brown",
  "black",
  "white",
];

// Solicita al usuario la cantidad de franjas deseada, con un máximo de 5
let nofranjas = prompt("¿Cuántas franjas quieres?\nMáximo: 5");

// Convierte la entrada a un número y verifica que esté en el rango permitido
nofranjas = parseInt(nofranjas);
if (isNaN(nofranjas) || nofranjas < 1 || nofranjas > 5) {
  alert("Por favor, introduce un número entre 1 y 5.");
  nofranjas = 5; // Si la entrada no es válida, se asigna el valor máximo por defecto
}

// Inicia la tabla en la que se mostrarán las franjas
document.write("<table>");

// Función para crear un generador de color que garantiza que no se repita el último color seleccionado
function crearColor() {
  let ultimoColor = null; // Inicializa el último color como nulo

  return function (colors) {
    let nuevoColor;
    // Sigue buscando un color al azar hasta que sea diferente al último color
    do {
      nuevoColor = colors[Math.floor(Math.random() * colors.length)];
    } while (nuevoColor === ultimoColor);

    // Guarda el color actual como último color y lo devuelve
    ultimoColor = nuevoColor;
    return nuevoColor;
  };
}

// Crea una instancia de la función para seleccionar colores
let elegirColor = crearColor();

// Bucle que se ejecuta tantas veces como franjas haya indicado el usuario
for (let i = 0; i < nofranjas; i++) {
  // Selecciona un color que no sea igual al anterior
  let colorSeleccionado = elegirColor(colors);
  
  // Agrega una fila a la tabla con una celda del color seleccionado, con dimensiones de 100x100 px
  document.write(
    '<tr><td style="background-color:' +
      colorSeleccionado +
      '; width:100px; height:100px;"></td></tr>'
  );
}

// Cierra la etiqueta de la tabla después de agregar todas las filas
document.write("</table>");
