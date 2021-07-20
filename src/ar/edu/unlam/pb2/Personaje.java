package ar.edu.unlam.pb2;

public abstract class Personaje {
	
	public String nombre;
	public Integer poderInicial;
	
	
	
	public Personaje(String nombre, Integer poderInicial) {
		super();
		this.nombre = nombre;
		this.poderInicial = poderInicial;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getPoderInicial() {
		return poderInicial;
	}



	public void setPoderInicial(Integer poderInicial) {
		this.poderInicial = poderInicial;
	}



	public abstract String getTipo();
	

}
