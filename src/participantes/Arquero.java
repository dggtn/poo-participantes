package participantes;

public class Arquero extends Personaje {
	
	protected void antesDeJugar() {
	
		System.out.println("TOMA UNA FLECHA");
	}
	
	protected void jugar() {
	
		System.out.println("DISPARA");
	}
}