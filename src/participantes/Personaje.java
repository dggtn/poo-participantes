package participantes;

public abstract class Personaje implements Participante {
	
	public void participar() {
	
		System.out.println("INICIA TURNO");
		
		antesDeJugar();
		
		System.out.println("CONSUME UNA VIDA");
		
		jugar();
		
		System.out.println("ACTUALIZA PUNTOS");
		
		despuesDeJugar();
	}
	
	protected void antesDeJugar() {
	}
	
	protected void despuesDeJugar() {
	}

	protected abstract void jugar();
}
