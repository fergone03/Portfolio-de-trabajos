import random
from Digipaimon import Digipaimon
from Enemigo import Enemigo
from Jugador import Jugador
from ListaNombres import ListaNombres
from Inventario import Inventario
class Main:


    def generar_digipaimon_aleatorio():
        lista_nombres = ListaNombres()
        nombre = lista_nombres.obtener_nombre_digipaimon()        
        vida = random.randint(10,20)
        ataque = random.randint(1,10)
        nivel = random.randint(1,3)
        tipo  = random.choice(['fuego', 'agua','planta'])
        return Digipaimon(nombre, vida, ataque, tipo, nivel)
    


    def menu(self, Jugador, Inventario):
        print("Menú:\n 1. Buscar Digipymon\n2. Luchar contra un entrenador\n3. Ir a la tienda\n4. Usar objetos\n5. Consultar inventario\n6. Consultar digipymon\n7. Salir")
        opcionelegida = int(input())
        if opcionelegida == 1:
                self.buscar_digipaimon(Jugador, Inventario)
        elif opcionelegida == 2:
                self.combate(Jugador, Enemigo)
        elif opcionelegida == 3:
                self.digishop()
        elif opcionelegida == 4:
                self.usar_item(Jugador)
        elif opcionelegida == 5:
                Jugador.consultar_digicoins()
                print(Inventario.objetos)
        elif opcionelegida == 6:
                Jugador.consultar_digipaimon()
        elif opcionelegida == 7:
                print("Hasta aquí hemos llegado!")        
        else:
                print("ELIGE DEL 1-7")



    def buscar_digipaimon(self, Jugador, Inventario): 
        
        nuevo_digipaimon = Main.generar_digipaimon_aleatorio()
        print("Has encontrado un Digipymon:")
        print(nuevo_digipaimon)
    
        probabilidad_captura = 100 - (nuevo_digipaimon.nivel * 10)
        print("Probabilidad de captura:", probabilidad_captura, "%")
        
        
        if "Digipaiball" in Inventario.objetos and Jugador.cantidad_digipaimon < 6:

            print("¿Quieres capturar este Digipymon? (Yes/No): ")
            respuesta = input()
            if respuesta == "Yes":
                if random.randint(1, 100) <= probabilidad_captura:
                    print("¡Has capturado al Digipaimon!")
                    Jugador.añadir_digipaimon(nuevo_digipaimon)
                    print("Has capturado a:", nuevo_digipaimon.nombre)  
                else:
                    print("¡Has fallado en capturar al Digipymon!")
                Inventario.usar_objeto("Digipaiball", 1)
            elif respuesta =="No":
                print("Has decidido huir!")
            else:
                print("Yes o  No, por favor.")



    def combate(self, Jugador, Enemigo): # Mira a ver q siempre acaba en empate y creo que te imprime el mismo Paimon q a ti
        lista_nombres = ListaNombres()  
        nuevo_enemigo = Enemigo(lista_nombres.obtener_nombres_entrenadores())  
        print("Has encontrado un Hilichurl:", nuevo_enemigo.nombre)    
        
        print("¿Quieres enfrentarlo?")
        respuesta = input()
        
        if respuesta == "Yes":
            print("¡Te vas a enfrentar al contrincante!", nuevo_enemigo.nombre)
            
            victorias = 0
            derrotas = 0
            
            for i in range(len(Jugador.lista_digipaimon), len(nuevo_enemigo.lista_digipaimon)):
                Jugador_digipaimon = Jugador.lista_digipaimon[i]
                Enemigo_digipaimon = nuevo_enemigo.lista_digipaimon[i]
                
                while Jugador_digipaimon.vida > 0 and Enemigo_digipaimon.vida > 0:
                    if Jugador_digipaimon.ataque > Enemigo_digipaimon.ataque:
                        Enemigo_digipaimon.vida -= (Jugador_digipaimon.ataque - Enemigo_digipaimon.ataque)
                        victorias += 1
                        print("Tu", Jugador_digipaimon.nombre, "ha ganado")
                    elif Jugador_digipaimon.ataque < Enemigo_digipaimon.ataque:
                        Jugador_digipaimon.vida -= (Enemigo_digipaimon.ataque - Jugador_digipaimon.ataque)
                        derrotas += 1
                        print("Tu", Jugador_digipaimon.nombre, "ha perdido")
                    else:
                        print("Empate")
                        
                if Jugador_digipaimon.vida <= 0:
                    print("Tu Digipaimon ha sido derrotado.")
                    Jugador.cantidad_digipaimon -= 1
                    Jugador.lista_digipaimon.remove(Jugador_digipaimon)
                    
                if Enemigo_digipaimon.vida <= 0:
                    print("El Digipaimon enemigo ha sido derrotado.")
                    Enemigo.cantidad_digipaimon -= 1
                    Enemigo.lista_digipaimon.remove(Enemigo_digipaimon)
            
            # Verificación del resultado del combate
            if victorias > derrotas:
                Jugador.digicoins += victorias
                print("Has ganado el combate, has recibido", victorias, "Digicoins")
            elif derrotas > victorias:
                Jugador.digicoins -= derrotas
                if Jugador.digicoins < 0:
                    Jugador.digicoins = 0
                    print("No tienes suficientes Digicoins para continuar jugando.")
                else:
                    print("Has perdido el combate, has perdido", derrotas, "Digicoins")
            else:
                print("El combate terminó en empate.")
                
            print("\nVida de tus Digipaimon:")
            for digipaimon in Jugador.lista_digipaimon:
                print(digipaimon)
        
        elif respuesta == "No":
            print("¡Has decidido huir!")
            Jugador.digicoins -= 1
            if Jugador.digicoins < 0:
                Jugador.digicoins = 0
                print("No tienes suficientes Digicoins para continuar jugando.")
        else:
            print("Por favor, responde 'Yes' o 'No'.")



    def digishop():
        print("Inventario. ¿Qué desea comprar?\n1.Digipaiballs\n2.Poción\n3.Anabolizantes")



    def usar_item(Jugador, Jugador_digipaimon):
        print(Inventario.objetos)
        print("¿Qué objeto deseas usar?")
        respuesta = input()
    
        if respuesta ==  "Digipaiball" and "Digipaiballs" in Inventario.objetos:
            print("¡Las Digipaiballs no son un consumible!\nTienes", Inventario.objetos["Digipaiballs"].cantidad, "Digipaiballs")
        elif respuesta == "Poción" and "Pociones" in Inventario.objetos:
            print("Te quedan", Inventario.objetos["Pociones"].cantidad, "Pociones")
            Jugador_digipaimon.vida += 20
            Inventario.usar_objeto("Pociones", 1)
        elif respuesta == "Anabolizante" and "Anabolizantes" in Inventario.objetos:
            print("Te quedan", Inventario.objetos["Anabolizantes"].cantidad, "Anabolizantes")
            Jugador_digipaimon.vida += 20
            Inventario.usar_objeto("Pociones", 1)  
        else:
            print("Ese objeto no está en tu inventario.")

def main():
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
    jugador = Jugador("Nombre del jugador")  
    inventario = Inventario()  
    inventario.añadir_objeto("Digipaiball", 3) 
    inventario.añadir_objeto("Poción", 1)
    nuevo_digipaimon = Main.generar_digipaimon_aleatorio()
    jugador.añadir_digipaimon(nuevo_digipaimon)
    print("¡Has recibido un Digipaimon como regalo!")
    print("Tu Digipaimon:", nuevo_digipaimon)
    while True:
        Main().menu(jugador, inventario)

main()    