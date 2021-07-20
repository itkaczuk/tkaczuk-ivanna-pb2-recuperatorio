package ar.edu.unlam.pb2;

public class Batalla {
	
	private Heroe heroe;
	private Villano villano;
	
	public Batalla(Heroe heroe, Villano villano) {
		super();
		this.heroe = heroe;
		this.villano = villano;
	}
	
	public Heroe getHeroe() {
		return heroe;
	}
	public void setHeroe(Heroe heroe) {
		this.heroe = heroe;
	}
	public Villano getVillano() {
		return villano;
	}
	public void setVillano(Villano villano) {
		this.villano = villano;
	}
	
	 public String darNombreGanador() {
		if(getHeroe().getPoderInicial() > getVillano().getPoderInicial()) {
		 return getHeroe().getNombre();} else {
			 return getVillano().getNombre();
		 }	 
	 }
	 
	 
	

//	darGanador()
//	
//	Batalla nuevaBatalla = new etc....(ObjetoHeroe1, ObjetoVillano1)
//
//	assert.equals("nombre del que tenga mas poder",  nuevaBatalla.darGanador());
//	dar ganador o darNombreDelGanador, algo
//	
}
