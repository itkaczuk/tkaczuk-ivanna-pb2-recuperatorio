package ar.edu.unlam.pb2;

public abstract class Personaje implements IHechizable {

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

}
