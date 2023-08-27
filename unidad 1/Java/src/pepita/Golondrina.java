package pepita;

import java.util.Random;

class Golondrina extends Ave {
    public Golondrina(String nombre) {
        super(nombre);
    }

    public void pescar() {
        Random random = new Random();
        int probabilidad = random.nextInt(10); // Genera un número entre 0 y 9

        if (probabilidad == 0) {
            Logger.showInfo(getNombre() + " intenta pescar.");
            if (getEnergia() >= 2) {
                setEnergia(getEnergia() - 2); // Gasta energía al pescar
                distanciaRecorrida++; // Incrementa la distancia
                comer(10); // Aumenta la energía al atrapar un pez
            } else {
                Logger.showError(getNombre() + " no tiene suficiente energía para pescar.");
            }
        } else {
            distanciaRecorrida++; // Incrementa la distancia aunque no haya pescado
        }
    }

	}
