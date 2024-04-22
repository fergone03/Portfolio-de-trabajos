import random
from Digipaimon import Digipaimon
from Enemigo import Enemigo
from Jugador import Jugador
from ListaNombres import ListaNombres
from Inventario import Inventario

def generar_digipaimon_aleatorio():
    vida = random.randint(10, 20)
    ataque = random.randint(1, 10)
    nivel = random.randint(1, 3)
    tipo = random.choice(["fuego", "agua", "planta"])
    nombre = ListaNombres().obtener_nombre_digipaimon()
    return Digipaimon(nombre, vida, ataque, tipo, nivel)

def menu(jugador, inventario):
    while True:
        print("Menu:")
        print("1. Buscar Digipaimon")
        print("2. Luchar contra un entrenador")
        print("3. Ir a la tienda")
        print("4. Usar objetos")
        print("5. Consultar inventario")
        print("6. Consultar digipaimons")
        print("7. Salir")

        opcion = input("Elige una opción: ")

        if opcion == "1":
            buscar_digipaimon(jugador, inventario)
        elif opcion == "2":
            combate(jugador)
        elif opcion == "3":
            digishop(jugador, inventario)
        elif opcion == "4":
            usar_item(jugador, inventario)
        elif opcion == "5":
            inventario.consultar_inventario()
        elif opcion == "6":
            jugador.consultar_digipaimon()
        elif opcion == "7":
            print("¡Gracias por jugar!")
            break
        else:
            print("Opción no válida. Por favor, elige una opción del 1 al 7.")

def buscar_digipaimon(jugador, inventario):
    digipaimon = generar_digipaimon_aleatorio()

    print("Digipaimon encontrado:")
    print(digipaimon)

    probabilidad_captura = 100 - (digipaimon.nivel * 10)
    print("Probabilidad de captura:", probabilidad_captura, "%")

    if "Digipaiball" not in inventario.objetos or jugador.cantidad_digipaimon >= 6:
        print("No puedes capturar al Digipaimon porque no tienes suficientes Digipaiballs o espacio en tu equipo.")
        return

    opcion = input("¿Quieres intentar capturar al Digipaimon?")
    if opcion == "Yes":
        if random.randint(0, 100) < probabilidad_captura:
            print("¡Has capturado al Digipaimon!")
            jugador.añadir_digipaimon(digipaimon)
            inventario.usar_objeto("Digipaiball", 1)
        else:
            print("Has fallado al intentar capturar al Digipaimon.")
            inventario.usar_objeto("Digipaiball", 1)
    elif opcion == "No":
        print("Has huido.")
    else:
        print("Opción no válida. Por favor, responde Yes o No.")

def combate(jugador):
    enemigo = Enemigo(ListaNombres().obtener_nombres_entrenadores())
    print("Has encontrado un Hilichurl:", enemigo.nombre)    

    for i in range(jugador.cantidad_digipaimon):
        enemigo.añadir_digipaimon(generar_digipaimon_aleatorio())

    if not jugador.lista_digipaimon:
        print("No tienes ningún Digipaimon para combatir.")
        return

    print("¿Quieres enfrentarlo?")
    respuesta = input()

    if respuesta == "Yes":
        print("¡Te vas a enfrentar al contrincante!", enemigo)
            
        victorias = 0
        derrotas = 0
            
        for i in range(len(jugador.lista_digipaimon)):
                jugador_digipaimon = jugador.lista_digipaimon[i]
                enemigo_digipaimon = enemigo.lista_digipaimon[i]
                print("Tu Digipaimon:", jugador_digipaimon)
                print("Digipaimon enemigo:", enemigo_digipaimon)
                if jugador_digipaimon.ataque > enemigo_digipaimon.ataque:
                    print("¡Ganaste el combate!")
                    jugador_digipaimon.vida -= jugador_digipaimon.ataque - enemigo_digipaimon.ataque
                    if jugador_digipaimon.vida <= 0:
                        jugador_digipaimon.vida = 0
                        print("Tu Digipaimon ha perdido toda su vida.")
                    victorias += 1
                elif jugador_digipaimon.ataque < enemigo_digipaimon.ataque:
                    print("Perdiste el combate.")
                    jugador_digipaimon.vida -= enemigo_digipaimon.ataque - jugador_digipaimon.ataque
                    if jugador_digipaimon.vida <= 0:
                        jugador_digipaimon.vida = 0
                        print("Tu Digipaimon ha perdido toda su vida.")
                    derrotas += 1
                else:
                    print("Empate.")
        if victorias > derrotas:
                jugador.digicoins += victorias
                print("¡Has ganado el combate! Obtienes ", victorias, " Digicoins")
        elif derrotas > victorias:
                    if jugador.digicoins >= derrotas:
                        jugador.digicoins -= derrotas                
                        print("¡Has perdido el combate! Pierdes ", derrotas, " Digicoins")
                    else:
                        jugador.digicoins = 0
                        print("Has perdido la batalla y has perdido todos tus Digicoins.")
        else:
                print("El combate terminó en empate.")
        
    elif respuesta == "No":
        print("¡Has decidido huir!")
        jugador.digicoins -= 1
        if jugador.digicoins < 0:
            jugador.digicoins = 0
            print("No tienes suficientes Digicoins para continuar jugando.")
    else:
        print("Por favor, responde 'Yes' o 'No'.")

def digishop(jugador, inventario):
    print("Bienvenido al Digishop:")
    print("Catálogo:")
    print("a. Digipaiballs: 5 digicoins")
    print("b. Pocion: 3 digicoins (restaura 10p de vida)")
    print("c. Anabolizantes: 4 digicoins (aumenta 5p de ataque)")

    opcion = input("¿Qué ítem deseas comprar?: ")
    if opcion == "Digipaiball":
        if jugador.digicoins >= 5:
            jugador.digicoins -= 5
            inventario.añadir_objeto("Digipaiball", 5)
            print("Has comprado 5 Digipaiball.")
        else:
            print("No tienes suficientes Digicoins para comprar Digipaiball.")
    elif opcion == "Pocion":
        if jugador.digicoins >= 3:
            jugador.digicoins -= 3
            inventario.añadir_objeto("Pocion", 1)
            print("Has comprado una Poción.")
        else:
            print("No tienes suficientes Digicoins para comprar una Poción.")
    elif opcion == "Anabolizantes":
        if jugador.digicoins >= 4:
            jugador.digicoins -= 4
            inventario.añadir_objeto("Anabolizantes", 1)
            print("Has comprado Anabolizantes.")
        else:
            print("No tienes suficientes Digicoins para comprar Anabolizantes.")
    else:
        print("Opción no válida.")

def usar_item(jugador, inventario):
    print("Inventario:")
    inventario.consultar_inventario()
    item = input("¿Qué ítem deseas usar?")
    if item == "Pocion" and "Pocion" in inventario.objetos:
        inventario.usar_objeto("Pocion", 1)
    elif item == "Digipaiball" and "Digipaiball" in inventario.objetos:
        print("No puedes usar Digipaiball.")
    elif item == "Anabolizantes" and "Anabolizantes" in inventario.objetos:
        inventario.usar_objeto("Anabolizantes", 1)
    else:
        print("No tienes ese ítem en tu inventario o has ingresado una opción inválida.")

def main():
    inventario = Inventario()
    
    print("¡Bienvenido a Teyvat, un increíble mundo donde habitan las Digipaimon!")
    print("En este emocionante juego, te embarcarás en una aventura por las 7 regiones para convertirte en el viajero que salvará al mundo mientras conoces a estas tiernas haditas que reaccionan a los elementos.")
    print("Hola, soy Aether, un viajero milenario que ha rondado Teyvat una y otra vez a lo largo de las eras. Cómo viejo habitante de este mundo, he dedicado mi vida a conocer a estas criaturas a lo largo de mis aventuras")
    print("Y ahora, igual que yo hace tiempo por la primera Paimon, te encuentro en esta playa, preparado para comenzar tu aventura Digipaimon")
    print("Déjame conocer un poco más sobre tí, ¿Cómo te llamas? ")
    nombre_jugador = input()
    jugador = Jugador(nombre_jugador)  # Pasar el nombre del jugador al constructor
    print("¡¿Con qué te llamas?! ", nombre_jugador , " Yo me solía llamar así también antes de encontrar a mi hermana y recordar mi verdadero nombre")
    print("En este paquete inicial que te voy a entregar, encontrarás 3 Digipaiballs y una poción para curar a tus Digipaimon durante los combates.")
    print("Este paquete te será de gran ayuda mientras exploras el mundo de los Digipaimon y te enfrentas a desafíos emocionantes.")
    jugador.digicoins = 10
    
    # Genera un Digipaimon aleatorio
    primer_digipaimon = generar_digipaimon_aleatorio()
    jugador.añadir_digipaimon(primer_digipaimon)
    print("Has encontrado a un Digipaimon llamado ", primer_digipaimon," y se ha unido a tu equipo.")
    
    # Recibes al principio 3 Digipaiballs y una Poción
    inventario.añadir_objeto("Digipaiball", 3)
    inventario.añadir_objeto("Pocion", 1)
    print("Has recibido 3 Digipaiball y una Poción.")
    print("Tu Digipaimon:", primer_digipaimon)
    
    # Inicia el menú del juego
    menu(jugador, inventario)

main()
