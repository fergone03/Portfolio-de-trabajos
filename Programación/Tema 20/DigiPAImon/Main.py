import random
from Digipaimon import Digipaimon
from Enemigo import Enemigo
from Jugador import Jugador
from ListaNombres import ListaNombres
from Inventario import Inventario
class Main:
    def generar_digipaimon_aleatorio():
        nombre = ListaNombres.obtener_nombre_digipaimon()
        vida = random.randint(10,20)
        ataque = random.randint(1,10)
        nivel = random.randint(1,3)
        tipo  = random.choice(['fuego', 'agua','planta'])
        return Digipaimon(nombre, vida, ataque, tipo, nivel)
    def menu(self):
        print("Menú:\n 1. Buscar Digipymon\n2. Luchar contra un entrenador\n3. Ir a la tienda\n4. Usar objetos\n5. Consultar inventario\n6. Consultar digipymon\n7. Salir")
        opcionelegida = int(input())
        if (opcionelegida == 1):
            self.buscar_digipaimon()  
        elif (opcionelegida==2):
            self.combate()
        elif(opcionelegida==3):
            self.digishop()
        elif(opcionelegida==4):
            self.usar_item()
        elif(opcionelegida==5):
            print(Jugador.consultar_digicoins)
            print(Inventario.objetos)
        elif(opcionelegida==6):
            Jugador.consultar_digipaimon()
        elif(opcionelegida==7):
            print("Hasta aquí hemos llegado!")
        else:
            print("ELIGE DEL 1-7")
        
    def buscar_digipaimon(Jugador, Inventario): 
        nuevo_digipaimon = Main.generar_digipaimon_aleatorio()
        
        print("Has encontrado un Digipymon:")
        print(nuevo_digipaimon)
        
        probabilidad_captura = 100 - (nuevo_digipaimon.nivel * 10)
        print("Probabilidad de captura:", probabilidad_captura, "%")
        
        if "Digipaiball" in Inventario.objetos() and Jugador.cantidad_digipaimon < 6:
            print("¿Quieres capturar este Digipymon? (Yes/No): ")
            respuesta = input()
            if respuesta == "Yes":
                if random.randint(1, 100) <= probabilidad_captura:
                    print("¡Has capturado al Digipymon!")
                    Jugador.añadir_digipaimon(nuevo_digipaimon)
                else:
                    print("¡Has fallado en capturar al Digipymon!")
                Inventario.usar_objeto('Digipyball', 1)
            elif respuesta =="No":
                print("Has decidido huir!")
            else:
                print("Yes o  No, por favor.")
    def combate():
        nuevo_enemigo = ListaNombres.obtener_nombres_entrenadores()
        
        print("Has encontrado un Hilichurl:")
        print(nuevo_enemigo)
        Enemigo.añadir_digipaimon()
    def digishop():
        print("inventario. ¿Que desea usar?")
        print("1.digipyballs")
        print("2.Pocion")
        print("3.Anabolizantes")
        print("4.")
    def usar_item():
        print(Inventario.objetos)
        print("¿Qué objeto deseas usar?")
        respuesta = input()
        if respuesta == "Pocion":
            Digipaimon.vida +20
        if respuesta in Inventario.objetos:
            Inventario.usar_objeto()
        else:
            print("Ese obejto no esta en tu inventario.")
