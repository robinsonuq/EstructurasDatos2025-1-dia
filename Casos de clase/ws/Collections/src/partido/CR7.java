package partido;

public class CR7 implements Jugador{

	@Override
	public void jugar() {
		System.out.println(" CR7 Jugando super bien");
		
	}

	@Override
	public void hacerGol() {
		System.out.println("CR7 Goool de Cabeza");
	}

	@Override
	public void cobrarPenal() {
		System.out.println("CR7 Gol por la 90");
	}

}
