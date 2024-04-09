from  juego import Juego

class Videojuego(Juego):  # Videojuego hereda de Juego
    def __init__(self, nombre, participantes, genero, desarrolladora):
        super().__init__(nombre,participantes)  # Llama al constructor de la clase Juego
        self.genero = genero
        self.desarrolladora = desarrolladora

    def añadir_participantes(self,participantes):
        self.participantes = participantes
        print ("El videojuego " + str(self.nombre) + " tiene " + str(self.participantes) + " participantes")

    def __str__(self):
        return f"Nombre: {self.nombre}, participantes: {self.participantes}, genero: {self.genero}, desarrolladora: {self.desarrolladora}"

def main():

    #Crear un objeto de la clase Videojuego
    videojuego1 = Videojuego("GTA", 1, "Acción", "Rockstar Games")
    #Imprimir el objeto usando el método __str__
    print(videojuego1)


    videojuego1.añadir_participantes(5)
    
    print(videojuego1)

    #Cambiar el valor de un atributo desde el propio atributo
    videojuego1.nombre = "Sekiro"
    videojuego1.desarrolladora = "From Software"

    print(videojuego1)
    print(videojuego1.desarrolladora)

main()