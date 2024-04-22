class Jugador:
    def __init__(self, nombre):
        # Inicializa los atributos del jugador con el nombre proporcionado
        self.nombre = nombre                # Nombre del jugador
        self.lista_digipaimon = []          # Lista de Digipaimon del jugador
        self.cantidad_digipaimon = 0        # Cantidad total de Digipaimon que posee el jugador
        self.digicoins = 10                 # Cantidad inicial de Digicoins del jugador
        
    def añadir_digipaimon(self, nuevo_digipaimon):
        # Añade un nuevo Digipaimon a la lista del jugador y actualiza la cantidad de Digipaimon
        self.lista_digipaimon.append(nuevo_digipaimon)
        self.cantidad_digipaimon += 1
        
    def consultar_digipaimon(self):
        # Imprime la lista de Digipaimon del jugador
        print("Lista de Digipaimon:")
        for digipaimon in self.lista_digipaimon:
            print(digipaimon)
    
    def consultar_digicoins(self):
        # Imprime la cantidad de Digicoins del jugador
        print("Tienes", self.digicoins, "en tu monedero")
