package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSePuedaPelearUnaBatallasEInformarGanadores() {
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
		
		assertEquals("Thor", batalla.darNombreGanador());
		assertEquals("Hulk", batalla2.darNombreGanador());
		assertEquals("Red Skull", batalla3.darNombreGanador());
		
	
	}

	
	@org.junit.Test
	public void queSePuedanDevolverLosGanadoresDeFormaOrdenada() {
		
	}
	
	@org.junit.Test
	public void queElGanadorSeaUnVillanoYSeLanceUnaExcepcion() {
		
	}
	
	@org.junit.Test
	public void quePuedanTenerPoderInicialYGemasQueIncrementenSuPoder() {
		
	}
	
//	-queUnHeroeYUnVillanoSePuedanEnfrentar (YDarGanador o alguna gilada asi)
//	-queSePuedanDevolverLosGanadoresDeFormaOrdenada (y aca probas todas las formas que te dicen)
//	-queElGanadorSeaUnVillanoYSeLanceUnaExcepcion (esta expects WORLDDDESTroyedexception.class)
//	-quePuedanTenerPoderInicialYGemasQueIncrementenSuPoder
//	-queLasGemasPuedanSerRepartidas
}
