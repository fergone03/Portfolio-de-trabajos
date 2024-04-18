import random
from Digipaimon import Digipaimon
from Enemigo import Enemigo
from Jugador import Jugador
from ListaNombres import ListaNombres
from Inventario import Inventario
jugador = Jugador()
class Main:
    def __init__(self):
        self.inventario = Inventario()
        self.lista_nombres = ListaNombres()

    def generar_digipymon_aleatorio(self):
        vida = random.randint(10, 20)
        ataque = random.randint(1, 10)
        nivel = random.randint(1, 3)
        tipo = random.choice(["fuego", "agua", "planta"])
        nombre = self.lista_nombres.obtener_nombre_digipaimon()
        return Digipaimon(nombre, vida, ataque, tipo, nivel)

    def menu(self):
        print("Menu:")
        print("1. Buscar Digipymon")
        print("2. Luchar contra un entrenador")
        print("3. Ir a la tienda")
        print("4. Usar objetos")
        print("5. Consultar inventario")
        print("6. Consultar digipymons")
        print("7. Salir")

        while True:
            opcion = input("Elige una opción: ")
            if opcion.isdigit() and 1 <= int(opcion) <= 7:
                return int(opcion)
            else:
                print("Opción inválida. Inténtalo de nuevo.")

    def buscar_digipymon(self, jugador):
        digipymon = self.generar_digipymon_aleatorio()
        print("Digipymon encontrado:")
        print(digipymon)

        probabilidad_captura = 100 - (digipymon.nivel * 10)
        print("Probabilidad de captura:", probabilidad_captura, "%")

        if "Digipyball" not in self.inventario.objetos or jugador.cantidad_digipaimon >= 6:
            print("No puedes capturar al Digipymon porque no tienes suficientes Digipyballs o espacio en tu equipo.")
            return

        opcion = input("¿Quieres intentar capturar al Digipymon? (s/n): ").lower()
        if opcion == "s":
            if random.randint(0, 100) < probabilidad_captura:
                print("¡Has capturado al Digipymon!")
                jugador.añadir_digipaimon(digipymon)
            else:
                print("Has fallado al intentar capturar al Digipymon.")
            self.inventario.usar_objeto("Digipyball", 1)
        else:
            print("Has huido.")
            
    def combate(self, jugador):
        # Generar un enemigo con un nombre aleatorio
        enemigo = Enemigo(ListaNombres().lista_nombres_entrenadores())
        # Añadir al enemigo tantos Digipymon como tenga el jugador
        for i in range(jugador.cantidad_digipaimon):
            enemigo.añadir_digipaimon(Main().generar_digipymon_aleatorio())

        if not jugador.lista_digipaimon:
            print("No tienes ningún Digipymon para combatir.")
            return

        opcion = input("¿Quieres combatir contra {}? (s/n): ".format(enemigo.nombre)).lower()
        if opcion == "s":
            victorias = 0
            derrotas = 0
            for i in range(len(jugador.lista_digipaimon)):
                jugador_digipymon = jugador.lista_digipaimon[i]
                enemigo_digipymon = enemigo.lista_digipaimon[i]
                print("Tu Digipymon:", jugador_digipymon)
                print("Digipymon enemigo:", enemigo_digipymon)
                if jugador_digipymon.ataque > enemigo_digipymon.ataque:
                    print("¡Ganaste el combate!")
                    jugador_digipymon.vida -= jugador_digipymon.ataque - enemigo_digipymon.ataque
                    if jugador_digipymon.vida <= 0:
                        jugador_digipymon.vida = 0
                        print("Tu Digipymon ha perdido toda su vida.")
                    victorias += 1
                elif jugador_digipymon.ataque < enemigo_digipymon.ataque:
                    print("Perdiste el combate.")
                    jugador_digipymon.vida -= enemigo_digipymon.ataque - jugador_digipymon.ataque
                    if jugador_digipymon.vida <= 0:
                        jugador_digipymon.vida = 0
                        print("Tu Digipymon ha perdido toda su vida.")
                    derrotas += 1
                else:
                    print("Empate.")
            # Calcular la cantidad de Digicoins ganados o perdidos
            if victorias > derrotas:
                jugador.digicoins += victorias
                print("¡Has ganado la batalla y has ganado {} Digicoins!".format(victorias))
            elif derrotas > victorias:
                if jugador.digicoins >= derrotas:
                    jugador.digicoins -= derrotas
                    print("Has perdido la batalla y has perdido {} Digicoins.".format(derrotas))
                else:
                    jugador.digicoins = 0
                    print("Has perdido la batalla y has perdido todos tus Digicoins.")
            else:
                print("La batalla terminó en empate.")
        else:
            # El jugador decide huir
            print("Has decidido huir.")
            if jugador.digicoins > 0:
                jugador.digicoins -= 1
                print("Has perdido 1 Digicoin.")
            else:
                print("No tienes Digicoins para perder.")

    def digishop(self, jugador, inventario):
        print("Bienvenido al Digishop:")
        print("Catálogo:")
        print("a. Digipyballs: 5 digicoins")
        print("b. Pocion: 3 digicoins (restaura 10p de vida)")
        print("c. Anabolizantes: 4 digicoins (aumenta 5p de ataque)")

        opcion = input("¿Qué ítem deseas comprar? (a/b/c): ").lower()
        if opcion == "a":
            if jugador.digicoins >= 5:
                jugador.digicoins -= 5
                inventario.añadir_objeto("Digipyball", 5)
                print("Has comprado 5 Digipyballs.")
            else:
                print("No tienes suficientes Digicoins para comprar Digipyballs.")
        elif opcion == "b":
            if jugador.digicoins >= 3:
                jugador.digicoins -= 3
                inventario.añadir_objeto("Pocion", 1)
                print("Has comprado una Poción.")
            else:
                print("No tienes suficientes Digicoins para comprar una Poción.")
        elif opcion == "c":
            if jugador.digicoins >= 4:
                jugador.digicoins -= 4
                inventario.añadir_objeto("Anabolizantes", 1)
                print("Has comprado Anabolizantes.")
            else:
                print("No tienes suficientes Digicoins para comprar Anabolizantes.")
        else:
            print("Opción no válida.")

    def usar_item(self,  inventario, digipaimon):
            print("Inventario:")
            inventario.consultar_inventario()
            item = input("¿Qué ítem deseas usar? (p/b): ")
            if item == "p" and "Pocion" in inventario.objetos:
                    input()
                    jugador.lista_digipaimon[i].vida
                    if digipaimon.vida < 100:
                        digipaimon.vida += 10
                        inventario.usar_objeto("Pocion", 1)
                        print("Has usado una poción. La vida de tu Digipaimon se ha restaurado.")
                    else:
                        print("Todos tus Digipaimons tienen vida completa, no puedes usar una poción.")
            elif item == "b" and "Digipyball" in inventario.objetos:
                print(" No puedes Usar Digipyball")  # Implementa la lógica para usar Digipyball
            else:
                print("No tienes ese ítem en tu inventario o has ingresado una opción inválida.")

def main():
    print("¡Bienvenido a Digipaimon!")
    nombre_jugador = input("Introduce tu nombre: ")
    print("¡Hola, {}!".format(nombre_jugador))
    
    jugador = Jugador(nombre_jugador)
    jugador.digicoins = 10
    
    # Genera un Digipymon aleatorio para el jugador
    primer_digipymon = Main().generar_digipymon_aleatorio()
    jugador.añadir_digipaimon(primer_digipymon)
    print("Has encontrado a un Digipymon llamado {} y se ha unido a tu equipo.".format(primer_digipymon.nombre))
    
    # Recibes inicialmente 3 Digipyballs y una Poción
    inventario = Inventario()
    inventario.añadir_objeto("Digipyball", 3)
    inventario.añadir_objeto("Pocion", 1)
    print("Has recibido 3 Digipyballs y una Poción.")

    while True:
        opcion = Main().menu()
        if opcion == 1:
            Main().buscar_digipymon(jugador)
        elif opcion == 2:
                    resultado_combate = Main().combate(jugador)  # Almacenar el resultado del combate
                    if resultado_combate == "perdido":
                        print("Has perdido la batalla y has perdido 1 Digicoins.")
                        jugador.digicoins -= 1
                        if (Digipaimon.vida <= 0 for Digipaimon in jugador.lista_digipaimon):
                            print("¡Todos tus Digipaimons han perdido toda su vida! ¡Juego terminado!")
                            break
                    elif resultado_combate == "ganado":
                        print("¡Has ganado la batalla y has ganado 1 Digicoins!")
                        jugador.digicoins += 1
        elif opcion == 3:
            Main().digishop(jugador, inventario)
        elif opcion == 4:
            Main().usar_item(jugador, inventario)
        elif opcion == 5:
            inventario.consultar_inventario()
        elif opcion == 6:
            jugador.consultar_digipaimon()
        elif opcion == 7:
            print("¡Gracias por jugar!")
            break

if __name__ == "__main__":
    main()
