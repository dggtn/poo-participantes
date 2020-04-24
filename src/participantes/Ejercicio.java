package participantes;

public class Ejercicio {
		
	public static void main(String[] args) {
		
		Ejercicio ejercicio = new Ejercicio();
		
		ejercicio.cuandoParticipaUnaBomba();
		ejercicio.cuandoParticipaUnHechicero();
		ejercicio.cuandoParticipaUnHechiceroSupremo();
		ejercicio.cuandoParticipaUnArquero();
		ejercicio.cuandoParticipaUnElfo();
	}
	
	public void cuandoParticipaUnaBomba() {
	
		System.out.println("------- Bomba -------");
		Participante principal = new Bomba();
		principal.participar();
	}
	
	public void cuandoParticipaUnHechicero() {
		
		System.out.println("------- Hechicero -------");
		Participante principal = new Hechicero();
		principal.participar();
	}
	
	public void cuandoParticipaUnHechiceroSupremo() {
		
		System.out.println("------- HechiceroSupremo -------");
		Participante principal = new HechiceroSupremo();
		principal.participar();
	}
	
	public void cuandoParticipaUnArquero() {
		
		System.out.println("------- Arquero -------");
		Participante principal = new Arquero();
		principal.participar();
	}
	
	public void cuandoParticipaUnElfo() {
		
		System.out.println("------- Elfo -------");
		Participante principal = new Elfo();
		principal.participar();
	}

}
