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
        nombre = ListaNombres.obtener_nombre_digipaimon()
        return Digipaimon(nombre, vida, ataque, tipo, nivel)
    def menu():
        n