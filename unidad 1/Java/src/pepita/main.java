package pepita;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pepita.Logger.LogLevel;

public class main {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance(Logger.LogLevel.INFO);
		Golondrina pepita  = new Golondrina("pepita", logger);
		Mariposa twinkle  = new Mariposa("Twinkle", logger);
		Golondrina pepon  = new Golondrina("Pepon", logger);
		Paloma bombon  = new Paloma("Bombon", logger);
		
		List<Ave> animales = new ArrayList<>();
		animales.add(pepon);
		animales.add(pepita);
		animales.add(twinkle);
		animales.add(bombon);
		
		animales.forEach(animal -> {
		    animal.comer(20);
		    animal.volar(2);
		    animal.comer(10);
		    animal.volar(3);
		    animal.distanciaRecorrida();
		});

}
}