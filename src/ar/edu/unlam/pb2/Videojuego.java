package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Videojuego {
	


	public HashSet<Batalla> batallas;
	public TreeSet<Villano> villanosGanadores;
	public TreeSet<Heroe> heroesGanadores;
	
	
	public Videojuego() {
		super();
		this.batallas = new HashSet<Batalla>();
		this.villanosGanadores = (TreeSet<Villano>) new TreeSet<Villano>().descendingSet();
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
	
	
	public HashSet<Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(HashSet<Batalla> batallas) {
		this.batallas = batallas;
	}

	public TreeSet<Villano> getVillanosGanadores() {
		return villanosGanadores;
	}

	public void setVillanosGanadores(TreeSet<Villano> villanosGanadores) {
		this.villanosGanadores = villanosGanadores;
	}

	public TreeSet<Heroe> getHeroesGanadores() {
		return heroesGanadores;
	}

	public void setHeroesGanadores(TreeSet<Heroe> heroesGanadores) {
		this.heroesGanadores = heroesGanadores;
	}
	
	public String ganadorDelJuego() throws WorldDestroyedException {
		if(heroesGanadores.size()>villanosGanadores.size()) {
			return "Salvaste al mundo del poderoso Thanos";
		} else {
			throw new WorldDestroyedException();
		}
	}
	
	
}
