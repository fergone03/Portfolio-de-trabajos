function mostrarPersonaje(idBoton) {
  // Ocultar el contenedor de botones y el barco
  document.getElementById("contenedor-botones").style.display = "none";
  document.getElementById("imagen-barco").style.display = "none";
  
  // Mostrar la imagen del personaje
  document.getElementById("imagenSeleccionada").style.display = "block";
  
  let personaje = "";
  let urlImagen = "";

  // Asignar el personaje y la URL de la imagen según el botón presionado
  switch (idBoton) {
    case 1:
      personaje = "Usopp";
      urlImagen = "./src/characters/Usopp.png"; 
      document.getElementById("imagenSeleccionada").style.width = "30%";
      break;
    case 2:
      personaje = "Franky";
      urlImagen = "./src/characters/Franky.png"; 
      document.getElementById("imagenSeleccionada").style.width = "30%";
      break;
    case 3:
      personaje = "Luffy";
      urlImagen = "./src/characters/Luffy.png"; 
      break;
    case 4:
      personaje = "Brook";
      urlImagen = "./src/characters/Brook.png"; 
      document.getElementById("imagenSeleccionada").style.width = "20%";
      break;
    case 5:
      personaje = "Sanji";
      urlImagen = "./src/characters/Sanji.png"; 
      document.getElementById("imagenSeleccionada").style.width = "17%";
      break;
    case 6:
      personaje = "Jinbe";
      urlImagen = "./src/characters/Jinbe.png"; 
      document.getElementById("imagenSeleccionada").style.width = "40%";
      break;
    case 7:
      personaje = "Robin";
      urlImagen = "./src/characters/Robin.png"; 
      break;
    case 8:
      personaje = "Zoro";
      urlImagen = "./src/characters/Zoro.png"; 
      document.getElementById("imagenSeleccionada").style.width = "40%";
      break;
    case 9:
      personaje = "Nami";
      urlImagen = "./src/characters/Nami.png"; 
      break;
    case 0:
      personaje = "Chopper";
      urlImagen = "./src/characters/Chopper.png"; 
      document.getElementById("imagenSeleccionada").style.width = "20%";
      break;
    default:
      break;
  }

  // Actualizar el título y la imagen del personaje
  document.getElementById("titulo").innerHTML = "¡Eres " + personaje + "!";
  document.getElementById("imagenSeleccionada").src = urlImagen;
}
