package pepita;

public class Golondrina extends Ave{

	public Golondrina(String nombre, Logger logger) {
		super(nombre, logger);
	}

	public void pescar() {
		if (this.energiaEsSuficiente(2)) {
			this.restarEnergia(2);
			this.sumarKilometrosVolados(1);
			this.intentaPescar();
		}
		
	}
	
	public void intentaPescar() {
		if (this.pescaDeSuerte()) {
			this.sumarEnergia(10);
		}
	}

	public boolean pescaDeSuerte() {
		int numeroRandom = (int) (Math.random() * 10) ;
		return numeroRandom == 3;
	}
	
	
}
