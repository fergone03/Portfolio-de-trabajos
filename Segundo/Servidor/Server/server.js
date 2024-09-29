var http = require("http"); //Importar la librería HTTP
http
  .createServer(function (req, res) {
    // Utilización del método createServer que recibe
    //por parámetro una funcíon callback(parámetro=petición/respuesta)
    res.writeHead(200, { "Content-Type": "text/html" }); //Método writeHead=recibe pcomo parámetro lo que se va a mostrar en pantalla.
    //Si sale 200=la petición se recibió de forma correcta. Content-type= Tipo de contenido.
    res.write("<h2>Hola Mundo</h2>"); //escribe un mensaje que se almacena en la respuesta
    res.end(""); //Se cierra la respuesta usando el método end
  })
  .listen(8000); //y se le asigna un puerto en el que el servidor estará escuchando

console.log(
  "El servidor web implementado se encuentra en la dirección 127.0.0.1:8000"
); //log que indica que el server está en ejecución
