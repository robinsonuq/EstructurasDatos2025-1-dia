package partido;

public class Partido {

	
	public static void main(String[] args) {
		
		EquipoFutbol quindio = new EquipoFutbol("Quindio");
		
		EquipoFutbol lasLauras = new EquipoFutbol("Quindio");
	
		
		Jugador messi = new Jugador() {
			
			@Override
			public void jugar() {
				System.out.println("Messi jugando muy bien");
			}
			
			@Override
			public void hacerGol() {
				System.out.println("Gool de tiro libre");
			}
			
			@Override
			public void cobrarPenal() {
				System.out.println("Cobrando penal por la izquierda");
				
			}
		};
		
		lasLauras.contratarJugador(messi);
		
		
		Robinson ronRobinson = new Robinson();
		quindio.contratarJugador(ronRobinson);
		
		CR7 cr7 = new CR7();
		quindio.contratarJugador(cr7);
		
		quindio.jugar();
		lasLauras.jugar();
	}
}
