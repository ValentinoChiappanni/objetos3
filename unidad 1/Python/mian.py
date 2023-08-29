import random

class Logger:
    class LogLevel:
        INFO = 1
        WARN = 2
        ERROR = 3

    def __init__(self, log_level):
        self.log_level = log_level

    def show_info(self, message):
        if self.log_level == self.LogLevel.INFO:
            print(f"INFO: {message}")

    def show_warn(self, message):
        if self.log_level == self.LogLevel.WARN:
            print(f"WARN: {message}")

    def show_error(self, message):
        if self.log_level == self.LogLevel.ERROR:
            print(f"ERROR: {message}")

class AnimalVolador:
    def volar(self, kilometros):
        pass

    def comer(self, gramos):
        pass

class Ave(AnimalVolador):
    def __init__(self, nombre, logger):
        self.energia = 2
        self.kilometros_volados = 0
        self.logger = logger
        self.nombre = nombre

    def volar(self, kilometros):
        if self.energia_es_suficiente(kilometros * 3):
            self.restar_energia(kilometros * 3)
            self.sumar_kilometros_volados(kilometros)
            self.logger.show_info(f"{self.nombre} voló {kilometros} kilómetros.")
        else:
            self.logger.show_error(f"{self.nombre} no tiene suficiente energía para volar {kilometros} kilómetros.")
            raise RuntimeError(f"{self.nombre} no tiene suficiente energía para volar.")

    def comer(self, gramos):
        self.sumar_energia(gramos)
        self.logger.show_info(f"{self.nombre} comió {gramos} de comida.")

    def sumar_energia(self, energia_a_sumar):
        self.energia += energia_a_sumar
        self.logger.show_info(f"{self.nombre} sumó {energia_a_sumar} de energía.")

    def restar_energia(self, energia_a_restar):
        self.energia -= energia_a_restar
        self.logger.show_info(f"{self.nombre} restó {energia_a_restar} de energía.")

    def sumar_kilometros_volados(self, sumar_kilometro):
        self.kilometros_volados += sumar_kilometro

    def energia_es_suficiente(self, kilometros):
        return kilometros <= self.energia

    def energia_total(self):
        self.logger.show_info(f"{self.nombre} tiene {self.energia} de energía.")

    def distancia_recorrida(self):
        self.logger.show_info(f"{self.nombre} recorrió {self.kilometros_volados} kilómetros.")

class Golondrina(Ave):
    def __init__(self, nombre, logger):
        super().__init__(nombre, logger)

    def pescar(self):
        if self.energia_es_suficiente(2):
            self.restar_energia(2)
            self.sumar_kilometros_volados(1)
            self.intenta_pescar()

    def intenta_pescar(self):
        if self.pesca_de_suerte():
            self.sumar_energia(10)

    def pesca_de_suerte(self):
        numero_random = random.randint(0, 9)
        return numero_random == 3

class Mariposa(Ave):
    def __init__(self, nombre, logger):
        super().__init__(nombre, logger)
        self.alimento_consumido = 0

    def volar(self, kilometros):
        self.sumar_kilometros_volados(kilometros)

    def comer(self, gramos):
        self.alimento_consumido += gramos * 5

class Paloma(Ave):
    def __init__(self, nombre, logger):
        super().__init__(nombre, logger)

    def defecar(self):
        self.restar_energia(1)
        self.sumar_kilometros_volados(1)
        self.logger.show_info(f"{self.nombre} está defecando.")

if __name__ == "__main__":
    logger = Logger(Logger.LogLevel.INFO)
    pepita = Golondrina("pepita", logger)
    twinkle = Mariposa("Twinkle", logger)
    pepon = Golondrina("Pepon", logger)
    bombon = Paloma("Bombon", logger)

    animales = [pepon, pepita, twinkle, bombon]

    for animal in animales:
        animal.comer(20)
        animal.volar(2)
        animal.comer(10)
        animal.volar(3)
        animal.distancia_recorrida()
