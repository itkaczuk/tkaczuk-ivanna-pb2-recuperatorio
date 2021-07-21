package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

public class Test {
	
	@org.junit.Test
	public void quePuedanTenerPoderInicialYGemasQueIncrementenSuPoder() {
		
		Videojuego videojuego = new Videojuego();
		
		Heroe heroe = new Heroe("Thor", 100);
		Villano villano = new Villano ("Hela", 50);
		Heroe heroe2 = new Heroe("Hulk", 300);
		Villano villano2 = new Villano ("Loki", 90);
		Heroe heroe3 = new Heroe("Iron Man", 100);
		Villano villano3 = new Villano ("Red Skull", 250);
		
		heroe.setGema(TipoDeGema.TIEMPO);
		villano.setGema(TipoDeGema.ALMA);
		heroe3.setGema(TipoDeGema.ESPACIO);
		villano3.setGema(TipoDeGema.MENTE);
		heroe2.setGema(TipoDeGema.PODER);
		villano2.setGema(TipoDeGema.REALIDAD);
		
		heroe.hechizarGema();
		villano.hechizarGema();
		heroe2.hechizarGema();
		villano2.hechizarGema();
		heroe3.hechizarGema();
		villano3.hechizarGema();
		
		assertEquals(TipoDeGema.TIEMPO, heroe.getGema());
		assertEquals(TipoDeGema.ALMA, villano.getGema());
		assertEquals(TipoDeGema.REALIDAD, villano2.getGema());
		assertEquals(TipoDeGema.PODER, heroe2.getGema());
		assertEquals(TipoDeGema.MENTE, villano3.getGema());
		assertEquals(TipoDeGema.ESPACIO, heroe3.getGema());
		
		assertEquals((Integer)300, heroe.getPoderInicial());
		assertEquals((Integer)100, villano.getPoderInicial());
		assertEquals((Integer)180, villano2.getPoderInicial());
		assertEquals((Integer)900, heroe2.getPoderInicial());
		assertEquals((Integer)750, villano3.getPoderInicial());
		assertEquals((Integer)200, heroe3.getPoderInicial());
		
		
		
	}

	@org.junit.Test
	public void queSePuedaPelearUnaBatallasEInformarGanadores() throws WorldDestroyedException {
		
		Videojuego videojuego = new Videojuego();
		
		Heroe heroe = new Heroe("Thor", 100);
		Villano villano = new Villano ("Hela", 50);
		Heroe heroe2 = new Heroe("Hulk", 300);
		Villano villano2 = new Villano ("Loki", 90);
		Heroe heroe3 = new Heroe("Iron Man", 100);
		Villano villano3 = new Villano ("Red Skull", 250);
		
		heroe.setGema(TipoDeGema.TIEMPO);
		villano.setGema(TipoDeGema.ALMA);
		heroe3.setGema(TipoDeGema.ESPACIO);
		villano3.setGema(TipoDeGema.MENTE);
		heroe2.setGema(TipoDeGema.PODER);
		villano2.setGema(TipoDeGema.REALIDAD);
		
		heroe.hechizarGema();
		villano.hechizarGema();
		heroe2.hechizarGema();
		villano2.hechizarGema();
		heroe3.hechizarGema();
		villano3.hechizarGema();
		
		
		Batalla batalla = new Batalla(heroe, villano);
		Batalla batalla2 = new Batalla(heroe2, villano2);
		Batalla batalla3 = new Batalla(heroe3, villano3);
		
		videojuego.agregarBatallasALaLista(batalla3);
		videojuego.agregarBatallasALaLista(batalla2);
		videojuego.agregarBatallasALaLista(batalla);
		
		assertEquals("Thor", batalla.darNombreGanador());
		assertEquals("Hulk", batalla2.darNombreGanador());
		assertEquals("Red Skull", batalla3.darNombreGanador());
		
		videojuego.agregarVillanosALaLista(villano3);
		videojuego.agregarHeroesALaLista(heroe);
		videojuego.agregarHeroesALaLista(heroe2);
		
		assertEquals("Salvaste al mundo del poderoso Thanos", videojuego.ganadorDelJuego());
		
	
	}

	
	@org.junit.Test
	public void queSePuedanDevolverLosGanadoresDeFormaOrdenada() throws WorldDestroyedException {
		
		Videojuego videojuego = new Videojuego();
		
		Heroe heroe = new Heroe("Thor", 100);
		Villano villano = new Villano ("Hela", 50);
		Heroe heroe2 = new Heroe("Hulk", 300);
		Villano villano2 = new Villano ("Loki", 90);
		Heroe heroe3 = new Heroe("Iron Man", 100);
		Villano villano3 = new Villano ("Red Skull", 250);
		
		heroe.setGema(TipoDeGema.TIEMPO);
		villano.setGema(TipoDeGema.ALMA);
		heroe3.setGema(TipoDeGema.ESPACIO);
		villano3.setGema(TipoDeGema.MENTE);
		heroe2.setGema(TipoDeGema.PODER);
		villano2.setGema(TipoDeGema.REALIDAD);
		
		heroe.hechizarGema();
		villano.hechizarGema();
		heroe2.hechizarGema();
		villano2.hechizarGema();
		heroe3.hechizarGema();
		villano3.hechizarGema();
		
		
		Batalla batalla = new Batalla(heroe, villano);
		Batalla batalla2 = new Batalla(heroe2, villano2);
		Batalla batalla3 = new Batalla(heroe3, villano3);
		
		videojuego.agregarBatallasALaLista(batalla3);
		videojuego.agregarBatallasALaLista(batalla2);
		videojuego.agregarBatallasALaLista(batalla);
		
		assertEquals("Thor", batalla.darNombreGanador());
		assertEquals("Hulk", batalla2.darNombreGanador());
		assertEquals("Red Skull", batalla3.darNombreGanador());
		
		videojuego.agregarVillanosALaLista(villano3);
		videojuego.agregarHeroesALaLista(heroe);
		videojuego.agregarHeroesALaLista(heroe2);
		
		assertEquals("Hulk", videojuego.getHeroesGanadores().first().getNombre());
		assertEquals("Thor", videojuego.getHeroesGanadores().last().getNombre());
		assertEquals("Red Skull", videojuego.getVillanosGanadores().first().getNombre());
	
		assertEquals("Salvaste al mundo del poderoso Thanos", videojuego.ganadorDelJuego());
		
	}
	
	@org.junit.Test (expected = WorldDestroyedException.class)
	public void queElGanadorSeaUnVillanoYSeLanceUnaExcepcion() throws WorldDestroyedException{
		
		Videojuego videojuego = new Videojuego();
		
		Heroe heroe = new Heroe("Thor", 100);
		Villano villano = new Villano ("Hela", 50);
		Heroe heroe2 = new Heroe("Hulk", 300);
		Villano villano2 = new Villano ("Loki", 900);
		Heroe heroe3 = new Heroe("Iron Man", 100);
		Villano villano3 = new Villano ("Red Skull", 250);
		
		heroe.setGema(TipoDeGema.TIEMPO);
		villano.setGema(TipoDeGema.ALMA);
		heroe3.setGema(TipoDeGema.ESPACIO);
		villano3.setGema(TipoDeGema.MENTE);
		heroe2.setGema(TipoDeGema.PODER);
		villano2.setGema(TipoDeGema.REALIDAD);
		
		heroe.hechizarGema();
		villano.hechizarGema();
		heroe2.hechizarGema();
		villano2.hechizarGema();
		heroe3.hechizarGema();
		villano3.hechizarGema();
		
		
		Batalla batalla = new Batalla(heroe, villano);
		Batalla batalla2 = new Batalla(heroe2, villano2);
		Batalla batalla3 = new Batalla(heroe3, villano3);
		
		videojuego.agregarBatallasALaLista(batalla3);
		videojuego.agregarBatallasALaLista(batalla2);
		videojuego.agregarBatallasALaLista(batalla);
		
		videojuego.agregarVillanosALaLista(villano3);
		videojuego.agregarHeroesALaLista(heroe);
		videojuego.agregarVillanosALaLista(villano2);
		
		assertEquals("Thor", batalla.darNombreGanador());
		assertEquals("Loki", batalla2.darNombreGanador());
		assertEquals("Red Skull", batalla3.darNombreGanador());
		
		assertNotEquals("Salvaste al mundo del poderoso Thanos", videojuego.ganadorDelJuego());
			
	}
	

	
}
