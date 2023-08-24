package pepita;

import java.io.Console;

public class main {

	public static void main(String[] args) {
		final Golondrina pepita = new Golondrina();
		pepita.comer(5);
		pepita.volar(1);
		pepita.comer(20);
		pepita.volar(2);
		System.out.print(pepita.energiaTotal());
	}

}
