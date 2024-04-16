class Jugador:
    def __init__(self, nombre):
        self.nombre = nombre
        self.lista_digipaimon=[]
        self.cantidad_digipaimon = 0
        self.digicoins = 10
    def añadir_digipaimon(self, nuevo_digipaimon):
        self.lista_digipaimon.append(nuevo_digipaimon)
        self.cantidad_digipaimon += 1
    def consultar_digipaimon(self):
        print("Lista de Digipaimon:")
        for digipaimon in self.lista_digipaimon:
            print(digipaimon)
    def consultar_digicoins(self):
        print("Tienes" ,self.digicoins, "en tu monedero")
