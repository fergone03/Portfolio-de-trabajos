let colors = [
  "red",
  "green",
  "blue",
  "yellow",
  "pink",
  "brown",
  "black",
  "white",
];

// Pregunta al usuario cuántas franjas quiere, con un máximo de 5
let nofranjas = prompt("¿Cuántas franjas quieres?\nMáximo: 5");

// Convierte la entrada a un número y valida
nofranjas = parseInt(nofranjas);
if (isNaN(nofranjas) || nofranjas < 1 || nofranjas > 5) {
  alert("Por favor, introduce un número entre 1 y 5.");
}

// Función para crear un generador de colores que asegura que el último color no se repita
function crearColor() {
  let ultimoColor = null;

  return function (colors) {
    let nuevoColor;
    do {
      nuevoColor = colors[Math.floor(Math.random() * colors.length)];
    } while (nuevoColor === ultimoColor);

    ultimoColor = nuevoColor;
    return nuevoColor;
  };
}

// Crea una instancia de la función para seleccionar colores
let elegirColor = crearColor();

// Obtiene el elemento contenedor de la tabla
let tableContainer = document.getElementById("table-container");

// Comienza la tabla
let tableHTML = "<table>";

// Recorre y añade filas basadas en la entrada del usuario
for (let i = 0; i < nofranjas; i++) {
  let colorSeleccionado = elegirColor(colors);
  tableHTML += `
                <tr>
                    <td style="background-color:${colorSeleccionado}; height:100px;"></td>
                </tr>
            `;
}

// Cierra la tabla e inserta el contenido en el contenedor
tableHTML += "</table>";
tableContainer.innerHTML = tableHTML;
