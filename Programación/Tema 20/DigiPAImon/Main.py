import random
import time
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
            print(f"También tienes {jugador.digicoins} Digicoins")
        elif opcion == "6":
            jugador.consultar_digipaimon()
        elif opcion == "7":
            print("¡Gracias por jugar!")
            break
        else:
            print("Opción no válida. Por favor, elige una opción del 1 al 7.")
        digipaimones_con_vida = False
        for digipaimon in jugador.lista_digipaimon:
            if digipaimon.vida > 0:
                digipaimones_con_vida = True
                break
        if not digipaimones_con_vida:
            print("Todos tus Digipaimons han sido derrotados. ¡Has perdido!")
            break
        if jugador.digicoins <= 0:
            print("No tienes suficientes Digicoins para continuar jugando. ¡El juego se cerrará!")
            break

def buscar_digipaimon(jugador, inventario):
    digipaimon = generar_digipaimon_aleatorio()

    print("Buscando Digipaimon...")
    time.sleep(1)
    print("Digipaimon encontrado:")
    time.sleep(1)
    print(digipaimon)
    time.sleep(1)

    probabilidad_captura = 100 - (digipaimon.nivel * 10)
    print(f"Probabilidad de captura: {probabilidad_captura}%")
    time.sleep(1)

    if "Digipaiball" not in inventario.objetos or jugador.cantidad_digipaimon >= 6:
        print("No puedes capturar al Digipaimon porque no tienes suficientes Digipaiballs o espacio en tu equipo.")
        return

    opcion = input("¿Quieres intentar capturar al Digipaimon?")
    if opcion.lower() == "yes":
        print("Capturando Digipaimon...")
        time.sleep(1)
        if random.randint(0, 100) < probabilidad_captura:
            print("¡Has capturado al Digipaimon!")
            jugador.añadir_digipaimon(digipaimon)
            inventario.usar_objeto("Digipaiball", 1)
            time.sleep(1)
        else:
            print("Has fallado al intentar capturar al Digipaimon.")
            inventario.usar_objeto("Digipaiball", 1)
            time.sleep(1)
    elif opcion.lower() == "no":
        print("Has huido.")
        time.sleep(1)
    else:
        print("Opción no válida. Por favor, responde Yes o No.")
        time.sleep(1)

def combate(jugador):
    enemigo = Enemigo(ListaNombres().obtener_nombres_entrenadores())
    print("Buscando un entrenador para combatir...")
    time.sleep(1)
    print("Has encontrado un Hilichurl:", enemigo.nombre)    
    time.sleep(1)

    for i in range(jugador.cantidad_digipaimon):
        enemigo.añadir_digipaimon(generar_digipaimon_aleatorio())

    if not jugador.lista_digipaimon:
        print("No tienes ningún Digipaimon para combatir.")
        time.sleep(1)
        return

    print("¿Quieres enfrentarlo?")
    respuesta = input()

    if respuesta.lower() == "yes":
        print(f"¡Te vas a enfrentar al contrincante {enemigo.nombre}!")
        time.sleep(1)

        victorias = 0
        derrotas = 0
                    
        for i in range(len(jugador.lista_digipaimon)):
            jugador_digipaimon = jugador.lista_digipaimon[i]
            if jugador_digipaimon.vida == 0:
                print(f"{jugador_digipaimon.nombre} no puede combatir porque no tiene vida.")
                time.sleep(1)
                continue  

            enemigo_digipaimon = enemigo.lista_digipaimon[i]
            print("Tu Digipaimon:", jugador_digipaimon)
            time.sleep(1)
            print("Digipaimon enemigo:", enemigo_digipaimon)
            time.sleep(1)
            if jugador_digipaimon.ataque > enemigo_digipaimon.ataque:
                print("¡Ganaste el combate!")
                time.sleep(1)
                jugador_digipaimon.vida -= jugador_digipaimon.ataque - enemigo_digipaimon.ataque
                if jugador_digipaimon.vida <= 0:
                    jugador_digipaimon.vida = 0
                    print("Tu Digipaimon ha perdido toda su vida.")
                    time.sleep(1)
                victorias += 1  
            elif jugador_digipaimon.ataque < enemigo_digipaimon.ataque:
                print("Perdiste el combate.")
                time.sleep(1)
                jugador_digipaimon.vida -= enemigo_digipaimon.ataque - jugador_digipaimon.ataque
                if jugador_digipaimon.vida <= 0:
                    jugador_digipaimon.vida = 0
                    print("Tu Digipaimon ha perdido toda su vida.")
                    time.sleep(1)
                derrotas += 1  
            else:
                print("Empate.")
                time.sleep(1)

        if victorias > derrotas:
            jugador.digicoins += victorias
            print(f"¡Has ganado la batalla! Obtienes {victorias} Digicoins")
            time.sleep(1)
        elif victorias < derrotas:
            if jugador.digicoins >= derrotas:
                jugador.digicoins -= derrotas
                print(f"¡Has perdido la batalla! Pierdes {derrotas} Digicoins")
                time.sleep(1)
            else:
                jugador.digicoins = 0
                print("Has perdido la batalla y has perdido todos tus Digicoins.")
                time.sleep(1)
        else:
            print("El combate terminó en empate.")
            time.sleep(1)        
                
    elif respuesta.lower() == "no":
        jugador.digicoins -= 1
        if jugador.digicoins < 0:
            jugador.digicoins = 0
            print("No tienes suficientes Digicoins para continuar jugando.")
        else:
            print("¡Has decidido huir y has soltado 1 Digicoin por el camino! Ahora tienes", jugador.digicoins, "Digicoins")
            time.sleep(1)
    else:
        print("Por favor, responde 'Yes' o 'No'.")
        time.sleep(1)

def digishop(jugador, inventario):
    print("Bienvenido al Digishop:")
    print("Catálogo:")
    print("a. Digipaiballs: 5 digicoins")
    print("b. Pocion: 3 digicoins (restaura 10p de vida)")
    print("c. Anabolizantes: 4 digicoins (aumenta 5p de ataque)")
    
    time.sleep(1)
    opcion = input("¿Qué ítem deseas comprar?: ")
    time.sleep(1)
    if opcion.lower() == "digipaiball":
        if jugador.digicoins >= 5:
            jugador.digicoins -= 5
            inventario.añadir_objeto("Digipaiball", 5)
            print("Has comprado 5 Digipaiball.")
        else:
            print("No tienes suficientes Digicoins para comprar Digipaiball.")
            time.sleep(1)
    elif opcion.lower() == "pocion":
        if jugador.digicoins >= 3:
            jugador.digicoins -= 3
            inventario.añadir_objeto("Pocion", 1)
            print("Has comprado una Poción.")
        else:
            print("No tienes suficientes Digicoins para comprar una Poción.")
            time.sleep(1)
    elif opcion.lower() == "anabolizantes":
        if jugador.digicoins >= 4:
            jugador.digicoins -= 4
            inventario.añadir_objeto("Anabolizantes", 1)
            print("Has comprado Anabolizantes.")
        else:
            print("No tienes suficientes Digicoins para comprar Anabolizantes.")
            time.sleep(1)
    else:
        print("Opción no válida.")
    time.sleep(1)

def usar_item(jugador, inventario):
    print("Inventario:")
    time.sleep(1)
    inventario.consultar_inventario()
    item = input("¿Qué ítem deseas usar? ")

    if item.lower() == "pocion" and "Pocion" in inventario.objetos:
        print("Elige el Digipaimon en el que deseas usar la Poción:")
        jugador.consultar_digipaimon()
        indice_digipaimon = int(input("Ingresa el número del Digipaimon: ")) - 1
        time.sleep(1)

        if 0 <= indice_digipaimon < len(jugador.lista_digipaimon):
            jugador.lista_digipaimon[indice_digipaimon].vida += 10
            print(f"Se ha usado la Poción en {jugador.lista_digipaimon[indice_digipaimon].nombre}")
            time.sleep(1)
            print(f"La vida de {jugador.lista_digipaimon[indice_digipaimon].nombre} ha sido restaurada a {jugador.lista_digipaimon[indice_digipaimon].vida}")
            time.sleep(1)
            inventario.usar_objeto("Pocion", 1)
        else:
            print("Número de Digipaimon no válido.")
            time.sleep(1)
    elif item.lower() == "digipaiball":
        print("No puedes usar Digipaiball.")
        time.sleep(1)
    elif item.lower() == "anabolizantes" and "Anabolizantes" in inventario.objetos:
        print("Elige el Digipaimon en el que deseas usar los Anabolizantes:")
        time.sleep(1)
        jugador.consultar_digipaimon()
        indice_digipaimon = int(input("Ingresa el número del Digipaimon: ")) - 1

        if 0 <= indice_digipaimon < len(jugador.lista_digipaimon):
            jugador.lista_digipaimon[indice_digipaimon].ataque += 5
            time.sleep(1)
            print(f"Se han usado los Anabolizantes en {jugador.lista_digipaimon[indice_digipaimon].nombre}")
            time.sleep(1)
            print(f"El ataque de {jugador.lista_digipaimon[indice_digipaimon].nombre} ha sido aumentado a {jugador.lista_digipaimon[indice_digipaimon].ataque}")
            inventario.usar_objeto("Anabolizantes", 1)
        else:
            print("Número de Digipaimon no válido.")
    else:
        print("No tienes ese ítem en tu inventario o has ingresado una opción inválida.")

    time.sleep(1)

def main():
    inventario = Inventario()
    
    print("¡Bienvenido a Teyvat, un increíble mundo donde habitan las Digipaimon!")
    time.sleep(1)
    print("En este emocionante juego, te embarcarás en una aventura por las 7 regiones para convertirte en el viajero que salvará al mundo mientras conoces a estas tiernas haditas que reaccionan a los elementos.")
    time.sleep(1)
    print("Hola, soy Aether, un viajero milenario que ha rondado Teyvat una y otra vez a lo largo de las eras. Cómo viejo habitante de este mundo, he dedicado mi vida a conocer a estas criaturas a lo largo de mis aventuras")
    time.sleep(1)    
    print("Y ahora, igual que yo hace tiempo por la primera Paimon, te encuentro en esta playa, preparado para comenzar tu aventura Digipaimon")
    time.sleep(1)    
    print("Déjame conocer un poco más sobre tí, ¿Cómo te llamas? ")
    time.sleep(1)
    nombre_jugador = input()
    jugador = Jugador(nombre_jugador)  # Pasar el nombre del jugador al constructor
    print(f"¡¿Con qué te llamas?! {nombre_jugador}, Yo me solía llamar así también antes de encontrar a mi hermana y recordar mi verdadero nombre")
    time.sleep(1)    
    print("En este paquete inicial que te voy a entregar, encontrarás 3 Digipaiballs y una poción para curar a tus Digipaimon durante los combates.")
    time.sleep(1)    
    print("Este paquete te será de gran ayuda mientras exploras el mundo de los Digipaimon y te enfrentas a desafíos emocionantes.")
    jugador.digicoins = 10
    time.sleep(1)    
    # Genera un Digipaimon aleatorio
    primer_digipaimon = generar_digipaimon_aleatorio()
    jugador.añadir_digipaimon(primer_digipaimon)
    print(f"Has encontrado a un Digipaimon llamado {primer_digipaimon} y se ha unido a tu equipo.")
    time.sleep(1)
    # Recibes al principio 3 Digipaiballs y una Poción
    inventario.añadir_objeto("Digipaiball", 3)
    inventario.añadir_objeto("Pocion", 1)
    print("Has recibido 3 Digipaiball y una Poción.")
    time.sleep(1)
    print(f"Tu Digipaimon: {primer_digipaimon}")
    time.sleep(1)
    # Inicia el menú del juego
    menu(jugador, inventario)

main()
