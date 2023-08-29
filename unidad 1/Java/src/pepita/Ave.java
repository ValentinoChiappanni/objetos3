package pepita;



public class Ave implements AnimalVolador {
	private int energia = 2; //Siempre inicia con 2
	private int kilometrosVolados = 0;
	 protected Logger logger;
	protected String nombre;
	 
	 public Ave(String nombre, Logger logger) {
	        this.nombre = nombre;
	        this.energia = 2;
	        this.logger = logger;
	    }
	
	@Override
	public void volar(int kilometros) {
		if (this.energiaEsSuficiente(kilometros*3)) {
			this.restarEnergia(kilometros * 3);
			this.sumarKilometrosVolados(kilometros);
			logger.showInfo(nombre + " volo "+ kilometros + " kilometros.");
		} else {
			 logger.showError(nombre + " no tiene suficiente energía para volar " + kilometros + " kilómetros.");
	            throw new RuntimeException(nombre + " no tiene suficiente energía para volar.");
		}
	}

	@Override
	public void comer(int gramos) {
		this.sumarEnergia(gramos);
		logger.showInfo(nombre + " comio "+ gramos + " de comida");
		
	}
	
	public void sumarEnergia(int energiaASumar) {
		energia += energiaASumar;
		logger.showInfo(nombre + " sumo "+ energiaASumar + " de energia.");
	}
	
	public void restarEnergia(int energiaARestar) {
		energia -= energiaARestar;
		logger.showInfo(nombre + " resto "+ energiaARestar + " de energia.");
	}
	public void sumarKilometrosVolados(int sumarKilometro) {
		kilometrosVolados += sumarKilometro;
	}

	public boolean energiaEsSuficiente(int kilometros) {
		return kilometros  <= energia;
	}
	
	public void energiaTotal() {	
		logger.showInfo(nombre + " tiene " + energia + " de energia.");
	}
	public void distanciaRecorrida() {	
		logger.showInfo(nombre + " recorrio " + kilometrosVolados + " kilometros.");
	}
	
	
}
