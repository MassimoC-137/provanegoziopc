package it.prova.provanegoziopc.test;

import java.util.ArrayList;
import java.util.*;

import it.prova.provanegoziopc.model.Computer;
import it.prova.provanegoziopc.model.Fattura;
import it.prova.provanegoziopc.model.Negozio;

public class TestComputer {

	public static void main(String[] args) {

		
		Computer mac1 = new Computer("Apple ", "Macbook Pro ", "motboapp2024", "M3 MAX", "mcbp20240215");
		Computer mac2 = new Computer("Apple ", "Macbook Pro ", "motboapp2023", "M2 PRO", "mcbp20230155");
		Computer mac3 = new Computer("Apple ", "Macbook Air ", "motboapp2022", "M1", "mcba20220570");
		Computer mac4 = new Computer("Apple ", "iMac ", "motboapp2021", "intel", "imac20210030");
		Computer pc1 = new Computer("Hp ", "Pavillon ", "motbopc2023", "M3", "pchp20230086");
		Computer pc2 = new Computer("Hp ", "Notebook ", "motbopc2021", "M3", "pchp20210179");
		
		List<Computer> appleStore1 = Arrays.asList(mac1, mac2, mac3);
		
		List<Computer> appleStore2 = Arrays.asList(mac3, mac4);
		
		List<Computer> mediaworld = new ArrayList<>();
		mediaworld.add(pc1); 
		mediaworld.add(pc2);
		
		

		Computer mac5 = new Computer("Apple", "Macbook Pro", "motboapp2024", "M3", "mcbp20240001");
		
		Computer pc3 = new Computer("Dell", "Latitude", "motbopc2022", "M3", "pcdll20220069");
		
		
		Negozio shop1 = new Negozio("via del Corso ", 181, appleStore1);
		Negozio shop2 = new Negozio("viale dell'Oceano Pacifico ", 83, appleStore2);
		Negozio shop3 = new Negozio("via Tuscolana ", 1252, mediaworld);

		
		
		List<Fattura> tuttiScontrini = new ArrayList<>(); 
		
		
//		shop3.gestioneInventarioPC();
		
		Fattura.emettiFatturaPerTransazione(shop1);
		
	}

}
