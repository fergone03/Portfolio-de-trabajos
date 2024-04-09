import random
class ListaNombres:
    def __init__(self):
        self.lista_nombres_digipaimons = [
            "MondPaimon", "FontPaimon", "LiyuPaimon", "InazuPaimon", "SnezhaPaimon",
            "SumeruPaimon", "NatlaPaimon", "PaimonVolt", "PaimonGaleVolt", "AeropaimonShock",
            "Wormmon", "Hawkmon", "Armadimon", "Renamon", "Impmon",
            "PaimonThunderstorm", "ElectroPaimonWind", "MagmaTidePaimon", "SteamBlazePaimon", "HydroFlarePaimon"
        ]
        self.lista_nombres_entrenadores = [
            "Luminen", "Aetheri", "Faruzana", "Raiden Key", "Zhonglin",
            "Lisanna", "Alfeitham", "Razorkismo", "Jeanli", "Xiangping",
            "ChongKun", "Kakomi", "Shentank", "Kujons Saram", "Diluviac",
            "Navie", "Lyncon", "Arlequino", "Dottore", "Yanmei"
        ]
    def obtener_nombre_digipaimon(self):
        return random.choice(self.lista_nombres_digipaimons)  
    def obtener_nombres_entrenadores(self):
        return random.choice(self.lista_nombres_entrenadores)  