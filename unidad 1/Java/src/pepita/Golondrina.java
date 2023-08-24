package pepita;

public class Golondrina implements Ave{
 private int energia = 2; 

@Override
public void volar(int kilometros) {
	if (energia <= 0) {
	// Lanzar exepcion
	} else {
		energia = Math.max(0, energia - kilometros*3);
	}
	
}

@Override
public void comer(int gramos) {
	energia += gramos;
}

public int energiaTotal() {
	return energia;
}
 
 


}
