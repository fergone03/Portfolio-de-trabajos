class Inventario:
    def __init__(self):
        self.objetos = {}

    def añadir_objeto(self, nombre, cantidad):
        if nombre in self.objetos:
            self.objetos[nombre] += cantidad
        else:
            self.objetos[nombre] = cantidad

    def usar_objeto(self, nombre, cantidad):
        if nombre in self.objetos:
            self.objetos[nombre] -= cantidad
            if self.objetos[nombre] <= 0:
                print("Ya no te quedan ",self.objetos[nombre])
                del self.objetos[nombre]

