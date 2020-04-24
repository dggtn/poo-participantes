package participantes;

public class Hechicero extends Personaje {
	
	protected void jugar() {
	
		System.out.println("LANZA HECHIZO");
	}

	protected void despuesDeJugar() {
	
		System.out.println("GANA EXPERIENCIA");
	}
}
