import random
class ListaNombres:
    def __init__(self):
        #Lista de todos los nombres posibles de digipymons.
        self.lista_nombres_digipaimons = [
            "MondPaimon", "FontPaimon", "LiyuPaimon", "InazuPaimon", "SnezhaPaimon",
            "SumeruPaimon", "NatlaPaimon", "PaimonVolt", "PaimonGaleVolt", "AeropaimonShock",
            "Wormmon", "Hawkmon", "Armadimon", "Renamon", "Impmon",
            "PaimonThunderstorm", "ElectroPaimonWind", "MagmaTidePaimon", "SteamBlazePaimon", "HydroFlarePaimon"
        ]
        #Lista de todos los nombres posibles de entrenadores.
        self.lista_nombres_entrenadores = [
            "Luminen", "Aetheri", "Faruzana", "Raiden Key", "Zhonglin",
            "Lisanna", "Alfeitham", "Razorkismo", "Jeanli", "Xiangping",
            "ChongKun", "Kakomi", "Shentank", "Kujons Saram", "Diluviac",
            "Navie", "Lyncon", "Arlequino", "Dottore", "Yanmei"
        ]
        #Métodos para poder elegir un nombre aleatorio tanto para el digipymon como el entrenador
    def obtener_nombre_digipaimon(self):
        return random.choice(self.lista_nombres_digipaimons)  
    def obtener_nombres_entrenadores(self):
        return random.choice(self.lista_nombres_entrenadores)  