class Enemigo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.lista_digipaimon=[]
        self.cantidad_digipaimon = 0
    def añadir_digipaimon(self, nuevo_digipaimon):
        self.lista_digipaimon.append(nuevo_digipaimon)
        self.cantidad_digipaimon += 1