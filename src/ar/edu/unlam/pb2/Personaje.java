package ar.edu.unlam.pb2;


public abstract class Personaje implements IHechizable, Comparable<Personaje>{


	public String nombre;
	public Integer poderInicial;
	private TipoDeGema gema;

	public TipoDeGema getGema() {
		return gema;
	}

	public void setGema(TipoDeGema gema) {
		this.gema = gema;
	}

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

	@Override
	public Boolean hechizarGema() {
		switch (getGema()) {
		case TIEMPO:
		case MENTE:
		case PODER: {
			setPoderInicial(getPoderInicial() * 3);
			return true;
		}
		case ALMA:
		case ESPACIO:
		case REALIDAD: {
			setPoderInicial(getPoderInicial() * 2);
			return true;
		}
		default:
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Personaje o) {
		return this.nombre.compareTo(o.nombre);
	}

}
