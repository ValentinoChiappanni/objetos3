package pepita;

class Mariposa {
    private int distanciaRecorrida;

    public Mariposa() {
        this.distanciaRecorrida = 0;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void comer(int gramosComida) {
        Logger.showInfo("Twinkle come " + gramosComida + " gramos de comida.");
    }

    public void volar(int kilometros) {
        Logger.showInfo("Twinkle vuela " + kilometros + " kilómetros.");
        distanciaRecorrida += kilometros;
    }
}
