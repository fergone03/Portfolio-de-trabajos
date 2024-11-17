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

function musica() {
  const speakerIcon = document.getElementById("speakerIcon");
  const audioPlayer = document.getElementById("audioPlayer");

  if (audioPlayer.paused) {
    // Reproducir el audio si está en pausa
    audioPlayer.play();
    // Cambiar el ícono de altavoz a uno activado (opcional)
    speakerIcon.style.opacity = "1"; // Puedes cambiar el estilo si deseas indicar que está activado
  } else {
    // Pausar el audio si está sonando
    audioPlayer.pause();
    // Cambiar el ícono de altavoz a uno desactivado (opcional)
    speakerIcon.style.opacity = "0.5"; // Puedes cambiar el estilo si deseas indicar que está desactivado
  }
}
