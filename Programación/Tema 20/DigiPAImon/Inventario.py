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
                print(f"Ya no te quedan {nombre}")
                del self.objetos[nombre]
    def consultar_inventario(self):
        print("Inventario:")
        for objeto, cantidad in self.objetos.items():
            print(f"{objeto}: {cantidad}")    
