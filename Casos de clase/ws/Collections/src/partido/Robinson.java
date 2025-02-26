package partido;

public class Robinson implements Jugador{

	@Override
	public void jugar() {
		System.out.println("Robinson junado muy bien");
	}

	@Override
	public void hacerGol() {
		System.out.println("Robinson Goool de Chilena");
	}

	@Override
	public void cobrarPenal() {
		System.out.println("Robinson Goool de penal por la 90");
	}

	
}
