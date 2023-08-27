package pepita;

class Paloma extends Ave {
    public Paloma(String nombre) {
        super(nombre);
    }

    public void irAlBano() {
        Logger.showInfo(getNombre() + " va al baño.");
        if (getEnergia() >= 1) {
            setEnergia(getEnergia() - 1); // Decrementa la energía al ir al baño
            distanciaRecorrida++; // Incrementa la distancia
        } else {
            Logger.showError(getNombre() + " no tiene suficiente energía para ir al baño.");
        }
    }
}
