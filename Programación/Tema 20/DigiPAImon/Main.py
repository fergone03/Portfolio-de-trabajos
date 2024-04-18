import random
from Digipaimon import Digipaimon
from Enemigo import Enemigo
from Jugador import Jugador
from ListaNombres import ListaNombres
from Inventario import Inventario
class Main:
    def __init__(self):
        self.inventario = Inventario()
        self.lista_nombres = ListaNombres()
        self.jugador = Jugador()

    def generar_digipymon_aleatorio(self):
        vida = random.randint(10, 20)
        ataque = random.randint(1, 10)
        nivel = random.randint(1, 3)
        tipo = random.choice(["fuego", "agua", "planta"])
        nombre = self.lista_nombres.obtener_nombre_digipaimon()
        return Digipaimon(nombre, vida, ataque, tipo, nivel)

    def menu(self,jugador,inventario):
        print("Menu:")
        print("1. Buscar Digipymon")
        print("2. Luchar contra un entrenador")
        print("3. Ir a la tienda")
        print("4. Usar objetos")
        print("5. Consultar inventario")
        print("6. Consultar digipymons")
        print("7. Salir")

        while True:
            print("Elige una opción: ")
            opcion = input()
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



    def buscar_digipaimon(self, jugador): 
        
        digipaimon = self.generar_digipymon_aleatorio()
        print("Digipymon encontrado:")
        print(digipaimon)

        probabilidad_captura = 100 - (digipaimon.nivel * 10)
        print("Probabilidad de captura:", probabilidad_captura, "%")

        if "Digipyball" not in self.inventario.objetos or jugador.cantidad_digipaimon >= 6:
            print("No puedes capturar al Digipymon porque no tienes suficientes Digipyballs o espacio en tu equipo.")
            return

        opcion = input("¿Quieres intentar capturar al Digipymon? (s/n): ").lower()
        if opcion == "s":
            if random.randint(0, 100) < probabilidad_captura:
                print("¡Has capturado al Digipymon!")
                jugador.añadir_digipaimon(digipaimon)
            else:
                print("Has fallado al intentar capturar al Digipymon.")
                self.inventario.usar_objeto("Digipyball", 1)
        else:
            print("Has huido.")
            
    def combate(self, Jugador,):
        enemigo = Enemigo(ListaNombres().obtener_nombres_entrenadores())
        print("Has encontrado un Hilichurl:", enemigo)    
        
        print("¿Quieres enfrentarlo?")
        respuesta = input()
        
        if respuesta == "Yes":
            print("¡Te vas a enfrentar al contrincante!", enemigo)
            
            victorias = 0
            derrotas = 0
            
            for i in range((len(Jugador.lista_digipaimon), len(nuevo_enemigo.lista_digipaimon))):
                Jugador_digipaimon = Jugador.lista_digipaimon[i]
                Enemigo_digipaimon = nuevo_enemigo.lista_digipaimon[i]

                
                print("Tu", Jugador_digipaimon.nombre, "se va a enfrentar a", Enemigo_digipaimon.nombre, "del entrenador enemigo.")   #Aquí no llega a correr
                
                while Jugador_digipaimon.vida > 0 and Enemigo_digipaimon.vida > 0:
                    Enemigo_digipaimon.vida -= ( Jugador_digipaimon.ataque - Enemigo_digipaimon.ataque)
                    if Enemigo_digipaimon.vida <= 0:
                        victorias += 1
                        print("Resultado: Victoria para", Jugador_digipaimon.nombre)
                        break
                    
                    Jugador_digipaimon.vida -= (Enemigo_digipaimon.ataque - Jugador_digipaimon.ataque)
                    if Jugador_digipaimon.vida <= 0:
                        derrotas += 1
                        print("Resultado: Victoria para", Enemigo_digipaimon.nombre)
                        break
            
            if victorias > derrotas:
                print("¡Has ganado el combate!")
            elif derrotas > victorias:
                print("¡Has perdido el combate!")
            else:
                print("El combate terminó en empate.")
        
        elif respuesta == "No":
            print("¡Has decidido huir!")
            Jugador.digicoins -= 1
            if Jugador.digicoins < 0:
                Jugador.digicoins = 0
                print("No tienes suficientes Digicoins para continuar jugando.")
        else:
            print("Por favor, responde 'Yes' o 'No'.")




    def digishop(self, jugador, inventario):
        print("Bienvenido al Digishop:")
        print("Catálogo:")
        print("a. Digipyballs: 5 digicoins")
        print("b. Pocion: 3 digicoins (restaura 10p de vida)")
        print("c. Anabolizantes: 4 digicoins (aumenta 5p de ataque)")

        opcion = input("¿Qué ítem deseas comprar? (a/b/c): ")
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


    def usar_item(self, jugador, inventario, digipaimon):
        print("Inventario:")
        inventario.consultar_inventario()
        item = input("¿Qué ítem deseas usar?")
        if item == "p" and "Pocion" in inventario.objetos:
                    input()
                    jugador.lista_digipaimon[i]
                    if digipaimon.vida < 100:
                        digipaimon.vida += 10
                        inventario.usar_objeto("Pocion", 1)
                        print("Has usado una poción. La vida de tu Digipaimon se ha restaurado.")                       
                    else:
                        print("Todos tus Digipaimons tienen vida completa, no puedes usar una poción.")
        elif item == "b" and "Digipyball" in inventario.objetos:
                print(" No puedes Usar Digipyball")  
        else:
                print("No tienes ese ítem en tu inventario o has ingresado una opción inválida.")

def main(jugador):
    print("¡Bienvenido a Teyvat, un increíble mundo donde habitan las Digipaimon!")
    print("En este emocionante juego, te embarcarás en una aventura por las 7 regiones para convertirte en el viajero que salvará al mundo mientras conoces a estas tiernas haditas que reaccionan a los elementos.")
    print("Hola, soy Aether, un viajero milenario que ha rondado Teyvat una y otra vez a lo largo de las eras. Cómo viejo habitante de este mundo, he dedicado mi vida a conocer a estas criaturas a lo largo de mis aventuras")
    print("Y ahora, igual que yo hace tiempo por la primera Paimon, te encuentro en esta playa, preparado para comenzar tu aventura Digipaimon")
    print("Déjame conocer un poco más sobre tí, ¿Cómo te llamas? ")
    nombre_jugador = input()
    Jugador.nombre = nombre_jugador
    print("¡¿Con qué te llamas?! ", nombre_jugador, " Yo me solía llamar así también antes de encontrar a mi hermana y recordar mi verdadero nombre")
    print("En este paquete inicial que te voy a entregar, encontrarás 3 Digipaiballs y una poción para curar a tus Digipaimon durante los combates.")
    print("Este paquete te será de gran ayuda mientras exploras el mundo de los Digipaimon y te enfrentas a desafíos emocionantes.")
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
    print("Tu Digipaimon:", primer_digipymon)
    while True:
        Main().menu(jugador, inventario)
main()    