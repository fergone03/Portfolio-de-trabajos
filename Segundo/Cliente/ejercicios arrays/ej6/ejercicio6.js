let userWords = [];
let coinciden = [];

// Pedir al usuario que ingrese elementos hasta que el array tenga 8 elementos
for (let i = 0; i < 8; i++) {
  let input = prompt("Ingresa un elemento para el array:"); // Añadir el elemento ingresado al array
  userWords.push(input);
}
document.write(
  "<p>Los elementos introducidos por el usario al principio son: " + userWords+"</p>"
);
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
document.write("<p>Los colores que pueden ser coincidentes son: " + colors+"</p>");
// Iterar sobre el primer array
for (let i = 0; i < userWords.length; i++) {
  // Si el elemento del primer array está en el segundo array
  if (colors.includes(userWords[i])) {
    // Añadirlo al array de coincidentes
    coinciden.push(userWords[i]);
  }
}

userWords = userWords.filter((item) => !coinciden.includes(item));

document.write("<p>Los elementos que coinciden son: " + coinciden+"</p>");

userWords = coinciden.concat(userWords);

document.write(
  "<p>El array con los elementos coincidentes al principio de la lista es: " +
    userWords+"</p>"
);
