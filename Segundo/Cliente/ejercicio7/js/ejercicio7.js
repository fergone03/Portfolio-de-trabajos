// Asignatura
class ASIGNATURA {
    constructor(nombre, curso, horas, nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.horas = horas;
        this.nota = nota;
    }

    mostrarASIGNATURA() {
        return `${this.nombre}: ${this.nota}`;
    }

    cambiarHoras(nuevasHoras) {
        this.horas = nuevasHoras;
    }
}

// Crear asignaturas
let asignatura1 = new ASIGNATURA("Despliegue", "2º", "270", [7, 10, 6, 2]);
let asignatura2 = new ASIGNATURA("Programación", "1º", "310", [5, 5, 4, 7]);
let asignatura3 = new ASIGNATURA("Interfaces", "2º", "290", [7, 7, 6, 7]);
let asignatura4 = new ASIGNATURA("Entornos", "1º", "260", [5, 6, 6, 4]);
let asignatura5 = new ASIGNATURA("Servidor", "2º", "320", [6, 4, 4, 5, 7]);

let asignaturas = [asignatura1, asignatura2, asignatura3, asignatura4, asignatura5];

// Calcular la media de cada asignatura
asignaturas.forEach((element) => {
    let total = 0;
    let numeros = element.nota;

    for (let i = 0; i < numeros.length; i++) total += numeros[i];
    let media = total / numeros.length;

    // Actualizar la nota de la asignatura con la media
    element.nota = media;
});

// Mostrar las asignaturas y medias en el HTML dinámicamente
let asignaturasContainer = document.getElementById("asignaturasContainer");

asignaturas.forEach((asignatura) => {
    let asignaturaDiv = document.createElement("div");
    asignaturaDiv.classList.add("row");

    let asignaturaText = document.createElement("div");
    asignaturaText.classList.add("col-12", "text-center");
    asignaturaText.textContent = `${asignatura.nombre}: Media: ${asignatura.nota}`;

    asignaturaDiv.appendChild(asignaturaText);
    asignaturasContainer.appendChild(asignaturaDiv);
});

// Alumno
class ALUMNO {
    constructor(nombre, edad, ciclo, curso, tutor, listaMediaNota) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
        this.curso = curso;
        this.tutor = tutor;
        this.listaMediaNota = listaMediaNota;
    }

    mostrarAlumno() {
        return `${this.nombre} (${this.edad} años) - Ciclo: ${this.ciclo}, Curso: ${this.curso}`;
    }
}

// Crear alumno
let alumno1 = new ALUMNO("Pepe", 21, "DAW", "1º", "Manu", ["Despliegue", "Programación", "Interfaces", "Entornos", "Servidor"]);

// Mostrar datos del alumno
document.getElementById("alumnoNombre").textContent = `Nombre: ${alumno1.nombre}`;
document.getElementById("alumnoEdad").textContent = `Edad: ${alumno1.edad}`;
document.getElementById("alumnoCiclo").textContent = `Ciclo: ${alumno1.ciclo}`;
document.getElementById("alumnoCurso").textContent = `Curso: ${alumno1.curso}`;

// Tutor
class TUTOR {
    constructor(nombre, edad, dni, tituloUniversitario) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.tituloUniversitario = tituloUniversitario;
    } 

    mostrarTUTOR() {
        return `Nombre: ${this.nombre}, Edad: ${this.edad}, DNI: ${this.dni}, Título universitario: ${this.tituloUniversitario}`;
    }

    cambiarNombre() {
        const nombres = ["Juan", "Carlos", "Ana", "Pedro", "Laura"];
        let nuevoNombre = nombres[Math.floor(Math.random() * nombres.length)];
        this.nombre = nuevoNombre;
        document.getElementById("resultadoTutor").textContent = `El tutor es: ${tutor1.mostrarTUTOR()}`;
    }
}

// Crear tutor
let tutor1 = new TUTOR("Manu", 38, "77887798N", "Ingeniería de software");

// Mostrar tutor al hacer clic en el botón
document.getElementById("boton1tutor").addEventListener("click", () => {
    const resultadoTutor = document.getElementById("resultadoTutor");
    resultadoTutor.textContent = `El tutor es: ${tutor1.mostrarTUTOR()}`;
});

// Cambiar nombre del tutor al hacer clic en el botón
document.getElementById("boton2Tutor").addEventListener("click", () => {
    tutor1.cambiarNombre();  // Cambia el nombre en el objeto tutor
});
