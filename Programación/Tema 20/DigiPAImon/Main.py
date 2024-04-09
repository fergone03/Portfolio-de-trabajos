import random
import Digipaimon
import Enemigo
import Jugador
import ListaNombres
import Inventario
class Main:
    def generar_digipaimon_aleatorio(self):
        self.vida = random.randint(10,20)
        self.ataque = random.randint(1,10)
        self.nivel = random.randint(1,3)
        self.tipo  = random.choice(['fuego', 'agua','planta'])
        self.nombre = random.choice(ListaNombres.lista_nombres_digipaimons)