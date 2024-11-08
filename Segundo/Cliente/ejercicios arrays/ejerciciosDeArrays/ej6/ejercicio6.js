let userWords = [];
let coinciden = [];

// Pedir al usuario que ingrese elementos hasta que el array tenga 8 elementos
for (let i = 0; i < 8; i++) {
    let input = prompt("Ingresa un elemento para el array:");
    userWords.push(input);
}

// Mostrar los elementos ingresados por el usuario en la alerta
document.getElementById("userWordsList").innerHTML = `<strong>Elementos del array:</strong> ${userWords.join(", ")}`;

let colors = ["red", "green", "blue", "yellow", "pink", "brown", "black", "white"];

// Mostrar los colores posibles para la coincidencia en la alerta
document.getElementById("colors").innerHTML = `<strong>Colores posibles:</strong> ${colors.join(", ")}`;

// Iterar sobre el primer array y encontrar coincidencias
for (let i = 0; i < userWords.length; i++) {
    if (colors.includes(userWords[i])) {
        coinciden.push(userWords[i]);
    }
}

// Mostrar los elementos que coinciden en la alerta
document.getElementById("matchingColors").innerHTML = `<strong>Los elementos que coinciden son:</strong> ${coinciden.join(", ")}`;

// Filtrar los elementos que no coinciden
userWords = userWords.filter((item) => !coinciden.includes(item));

// Mostrar el array con los elementos coincidentes al principio
let updatedArray = coinciden.concat(userWords);
document.getElementById("updatedArray").innerHTML = `<strong>El array con los elementos coincidentes al principio es:</strong> ${updatedArray.join(", ")}`;
