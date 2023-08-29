package pepita;

public class Paloma extends Ave{

	public Paloma(String nombre, Logger logger) {
		super(nombre, logger);
	}

	public void defecar() {
		this.restarEnergia(1);
		this.sumarKilometrosVolados(1);
		logger.showInfo(nombre + " esta defecando.");
	}
}
