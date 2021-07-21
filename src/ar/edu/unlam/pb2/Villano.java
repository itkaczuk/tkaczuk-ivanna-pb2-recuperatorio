package ar.edu.unlam.pb2;

public class Villano extends Personaje{
	
	

	public Villano(String nombre, Integer poderInicial) {
		super(nombre, poderInicial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Personaje o) {
		return this.nombre.compareTo(o.nombre);
	}

}
