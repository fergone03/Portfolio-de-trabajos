import random
from Digipaimon import Digipaimon
from Enemigo import Enemigo
from Jugador import Jugador
from ListaNombres import ListaNombres
from Inventario import Inventario
class Main:
    def generar_digipaimon_aleatorio(self):
        self.vida = random.randint(10,20)
        self.ataque = random.randint(1,10)
        self.nivel = random.randint(1,3)
        self.tipo  = random.choice(['fuego', 'agua','planta'])
        self.nombre = ListaNombres.obtener_nombre_digipaimon()