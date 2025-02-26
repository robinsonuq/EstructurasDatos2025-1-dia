package partido;

import java.util.HashSet;
import java.util.Set;

public class EquipoFutbol {

	private String nombre;
	
	private Set<Jugador> listaJugadores = new HashSet<>();

	protected int tiempo = 0;

	public EquipoFutbol(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(Set<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	
	public void contratarJugador(Jugador jugador) {
		listaJugadores.add(jugador);
	}

	public void jugar() {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				while(tiempo != 20 ) {
					for (Jugador jugador : listaJugadores) {
						jugador.jugar();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						tiempo++;
						
						if(tiempo == 10) {
							jugador.hacerGol();
						}
					}
				}
			}
		});
		thread.start();
	}
}
