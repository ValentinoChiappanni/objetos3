package pepita;

class Ave {
    private String nombre;
    protected int distanciaRecorrida;
    private int energia;

    public Ave(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void comer(int gramosComida) {
        Logger.showInfo(nombre + " come " + gramosComida + " gramos de comida.");
    }

    public void volar(int kilometros) {
        Logger.showInfo(nombre + " vuela " + kilometros + " kilómetros.");
        distanciaRecorrida += kilometros;
    }
    public void setEnergia(int valor) {
		energia = valor;
	}
    public int getEnergia() {
		return energia;
	}
    public String getNombre() {
    	return nombre;
    }
}