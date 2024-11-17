// Función para mostrar/ocultar el contenido principal
function toggleContenido() {
  const contenido = document.getElementById("contenido");
  const contenidoSonidos = document.getElementById("contenidoSonidos");
  const fullPageCarousel = document.getElementById("FullPageCarousel");

  // Alternar la visibilidad entre contenido principal y otros
  fullPageCarousel.style.display = "block";
  contenido.style.display = "none";
  contenidoSonidos.style.display = "none";
}

// Función para mostrar/ocultar los sonidos de la naturaleza
function toggleContenidoSonidos() {
  const contenido = document.getElementById("contenido");
  const contenidoSonidos = document.getElementById("contenidoSonidos");
  const fullPageCarousel = document.getElementById("FullPageCarousel");

  // Alternar la visibilidad entre sonidos y contenido principal
  contenido.style.display = "none";
  fullPageCarousel.style.display = "none";
  contenidoSonidos.style.display = "block";
}

// Función para restablecer el contenido original
function resetContenido() {
  const contenido = document.getElementById("contenido");
  const contenidoSonidos = document.getElementById("contenidoSonidos");
  const fullPageCarousel = document.getElementById("FullPageCarousel");

  // Mostrar el contenido principal y ocultar los otros
  contenido.style.display = "block";
  fullPageCarousel.style.display = "none";
  contenidoSonidos.style.display = "none";
}

// Selecciona el icono del altavoz y el elemento de audio
const audio = new Audio('./src/media/sounds/ocean waves sounds 1 minute relaxation _ ocean waves sounds _ ocean sounds _ Calming Sea [ ezmp3.cc ].mp3');

document.getElementById('checkboxInput').addEventListener('change', (event) => {
  if (event.target.checked) {
    audio.play();
  } else {
    audio.pause();
    audio.currentTime = 0;
  }
});
