class Enemigo:
    def __init__(self, nombre):
        # Se inicializan los atributos de la instancia.
        self.nombre = nombre  # El atributo "nombre" toma el valor proporcionado al crear el objeto.
        self.lista_digipaimon = []  # Se inicializa una lista vacía para almacenar digipaimons.
        self.cantidad_digipaimon = 0  # Se inicializa la cantidad de digipaimons en 0.

    def añadir_digipaimon(self, nuevo_digipaimon):
        # Este método añade un nuevo digipaimon a la lista de digipaimons del enemigo.
        self.lista_digipaimon.append(nuevo_digipaimon)  # Se añade el nuevo digipaimon a la lista.
        self.cantidad_digipaimon += 1  # Aumenta el contador de digipaimons en 1.
