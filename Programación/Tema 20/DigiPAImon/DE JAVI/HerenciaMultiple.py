class Videojuego:
    def __init__(self, nombre):
        self.nombre = nombre

class Caracteristicas:
    def __init__(self, genero):
        self.genero = genero

class JuegoDeAccion(Videojuego, Caracteristicas):
    def __init__(self, nombre, genero, armas):
        Videojuego.__init__(self, nombre)
        Caracteristicas.__init__(self, genero)
        self.armas = armas

def main():
    # Crear una instancia de la clase JuegoDeAccion
    juego = JuegoDeAccion("Call of Duty", "Acción", ["Pistolas", "Escopetas", "fusiles", "granadas"])

    # Acceder a los atributos de la instancia
    print("Nombre del juego:", juego.nombre)
    print("Género del juego:", juego.genero)
    print("Armas disponibles:", juego.armas)

main() 
