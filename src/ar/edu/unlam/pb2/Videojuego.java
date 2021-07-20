package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Videojuego {
	
	public HashSet<Batalla> batallas;
	public TreeSet<Villano> villanosGanadores;
	public TreeSet<Heroe> heroesGanadores;
	
	
	public Videojuego(Set<Batalla> batallas, TreeSet<Villano> villanosGanadores, TreeSet<Heroe> heroesGanadores) {
		super();
		this.batallas = new HashSet<Batalla>();
		this.villanosGanadores = new TreeSet<Villano>();
		this.heroesGanadores = new TreeSet<Heroe>();
	}
	
	public void agregarHeroesALaLista(Heroe heroe) {
		heroesGanadores.add(heroe);
	}
	
	public void agregarVillanosALaLista(Villano villano) {
		villanosGanadores.add(villano);
	}
	
	public void agregarBatallasALaLista(Batalla batalla) {
		batallas.add(batalla);
	}
	
	

}
