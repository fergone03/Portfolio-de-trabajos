from Jugador import Jugador  # Importa la clase Jugador desde un módulo externo

class Inventario:
    def __init__(self):
        self.objetos = {}  # Inicializa un diccionario para almacenar los objetos y sus cantidades

    def añadir_objeto(self, nombre, cantidad):
        # Agrega un objeto al inventario o incrementa su cantidad si ya existe
        if nombre in self.objetos:
            self.objetos[nombre] += cantidad
        else:
            self.objetos[nombre] = cantidad

    def usar_objeto(self, nombre, cantidad):
        # Reduce la cantidad de un objeto en el inventario cuando se usa
        if nombre in self.objetos:
            self.objetos[nombre] -= cantidad
            if self.objetos[nombre] <= 0:
                print(f"Ya no te quedan {nombre}")  # Mensaje si se agota la cantidad de un objeto
                del self.objetos[nombre]  # Elimina el objeto del inventario si se agota

    def consultar_inventario(self):
        # Muestra el contenido del inventario, listando los objetos y sus cantidades
        print("Inventario:")
        for objeto, cantidad in self.objetos.items():
            print(f"{objeto}: {cantidad}")    
