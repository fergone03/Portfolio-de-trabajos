class Digipaimon:
    def __init__(self, nombre, vida, ataque, tipo, nivel):
        # Inicializa los atributos del Digipaimon con los valores proporcionados
        self.nombre = nombre  # Nombre del Digipaimon
        self.vida = vida      # Puntos de vida del Digipaimon
        self.ataque = ataque  # Poder de ataque del Digipaimon
        self.tipo = tipo      # Tipo del Digipaimon 
        self.nivel = nivel    # Nivel del Digipaimon
        
    def __str__(self):
        # Devuelve una representación en cadena del Digipaimon
        return f"Nombre: {self.nombre}, vida: {self.vida}, ataque: {self.ataque}, tipo: {self.tipo}, nivel: {self.nivel}"
