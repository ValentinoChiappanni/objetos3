package pepita;

public class Mariposa extends Ave{
	public Mariposa(String nombre, Logger logger) {
		super(nombre, logger);
	}

	int alimentoConsumido = 0;
	@Override
	public void volar(int kilometros) {
		this.sumarKilometrosVolados(kilometros);;
		
	}

	@Override
	public void comer(int gramos) {
		alimentoConsumido += gramos * 5;
		
	}

}
