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
                Inventario.usar_objeto("Digipaiball", 1)
            elif respuesta =="No":
                print("Has decidido huir!")
            else:
                print("Yes o  No, por favor.")



    def combate(Jugador,Enemigo):
        nuevo_enemigo = ListaNombres.obtener_nombres_entrenadores()        
        print("Has encontrado un Hilichurl:")
        Enemigo.añadir_digipaimon()
        
        for nuevo_enemigo in range(Jugador.cantidad_digipaimon):
            nuevo_digipaimon = Main.generar_digipaimon_aleatorio()
            nuevo_enemigo.añadir_digipaimon(nuevo_digipaimon)
            
        print("¿Quieres enfrentarlo?")
        respuesta = input()
        
        if respuesta == "Yes":
            print("¡Te vas a enfrentar al contrincante!", nuevo_enemigo)
            
            for i in range(len(Jugador.lista_digipaimon,Enemigo.lista_digipaimon)):
                Jugador_digipaimon = Jugador.lista_digipaimon[i]
                Enemigo_digipaimon = Enemigo.lista_digipaimon[i]
                
                while Jugador_digipaimon.vida > 0 and Enemigo_digipaimon.vida > 0:
                    victorias=0
                    derrotas=0
                    if Jugador_digipaimon.ataque>Enemigo_digipaimon.ataque:
                        Jugador_digipaimon.vida-(Jugador_digipaimon.ataque - Enemigo_digipaimon.ataque)
                        victorias+=1
                        return print("Tu", Jugador_digipaimon.nombre , " ha ganado") 
                        
                    elif Jugador_digipaimon.ataque<Enemigo_digipaimon.ataque:
                        derrotas+=1
                        Enemigo_digipaimon.vida-(Enemigo_digipaimon.ataque - Jugador_digipaimon.ataque)
                        return print("Tu", Jugador_digipaimon.nombre , " ha ganado")
                    
                    if Jugador_digipaimon.vida <= 0:
                        print("Tu Digipymon ha sido derrotado.")
                        Jugador.cantidad_digipaimon -= 1
                        Jugador.lista_digipaimon.remove(Jugador_digipaimon)
                
                    if Enemigo_digipaimon.vida <= 0:
                        print("El Digipymon enemigo ha sido derrotado.")
                        Enemigo.cantidad_digipaimon -= 1
                        Enemigo.lista_digipaimon.remove(Enemigo_digipaimon)      
                                      
                if victorias>derrotas:
                        Jugador.digicoins+=victorias
                        print("Has ganado el combate, has recibido ", +str(victorias))
                        
                elif derrotas>victorias:
                        Jugador.digicoins=-derrotas
                        if  Jugador.digicoins < 0 :
                            print ("No tienes suficientes digicoins para continuar jugando.")
                            break
                        else:
                            print("Has perdido el combate, has perdido ", +str(derrotas))
                        
                else:
                        print("Empate")
                print("\nVida de tu Digipaimon:\n\n"+str(Jugador_digipaimon))
      
        elif respuesta =="No":
            print("¡Has decidido huir!")
            Jugador.digicoins-1
        else:
            print("Yes o  No, por favor.")



    def digishop():
        print("Inventario. ¿Qué desea comprar?\n1.Digipaiballs\n2.Poción\n3.Anabolizantes")



    def usar_item():
        print(Inventario.objetos)
        print("¿Qué objeto deseas usar?")
        respuesta = input()
        if respuesta ==  "Digipaiballs":
            print("¡Las digipaiballs no son un consumible!\nTienes",Inventario.objetos["Digipaiballs"].cantidad,"Digipaiballs")
        elif respuesta == "Pocion":
            print("Te quedan",Inventario.objetos["Pociones"].cantidad,"Pociones")
            Digipaimon.vida +=20
        elif respuesta in Inventario.objetos:
            Inventario.usar_objeto()
        else:
            print("Ese obejto no esta en tu inventario.")


    def main():
        print("Bienvenido,¿Cual es tu nombre?") 
        Jugador.nombre = respuesta 
        respuesta = input()     
    main()    