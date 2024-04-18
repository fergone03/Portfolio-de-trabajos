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



