package it.prova.provanegoziopc.model;

import java.nio.charset.Charset;
import java.util.*;

public class Fattura {

	private Negozio negozio;
	private Computer computer;
	private double prezzo;
	private String codice;

	public Fattura() {

	}

	public Fattura(Negozio negozio, Computer computer, double prezzo, String codice) {

		this.negozio = negozio;
		this.computer = computer;
		this.prezzo = prezzo;
	}

	public Negozio getNegozio() {
		return negozio;
	}

	public void setNegozio(Negozio negozio) {
		this.negozio = negozio;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	
	

	private static String generaCodiceUnivoco(int lunghezza) {
        String caratteri = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder codice = new StringBuilder();
        Random rnd = new Random();
        while (codice.length() < lunghezza) { 
            int index = (int) (rnd.nextFloat() * caratteri.length());
            codice.append(caratteri.charAt(index));
        }
        return codice.toString();
    }


	private void aggiungiArticolo(Computer computer, double prezzo, String codice) {
		
		this.computer = computer;
		this.prezzo = prezzo;
		this.codice = codice; 
	}
	
	@Override
	public String toString() {
		return "Benvenuto nel nostro negozio: " + this.getNegozio().getIndirizzo() + this.getNegozio().getCivico() + "\n" 
				+ this.getComputer().getMarca() + this.getComputer().getModello() + this.getComputer().getProcessore() + "\n"
				+ this.prezzo + "\n" + this.codice + "\n" + "Grazie ed arrivederci"; 
				
	}
	
	public static Fattura emettiFatturaPerTransazione(Negozio negozioDoveAcquisto) {

		Fattura scontrino = new Fattura();
		scontrino.setNegozio(negozioDoveAcquisto);

		List<Computer> catalogo = negozioDoveAcquisto.getInventario();

		for (int i = 0; i < catalogo.size(); i++) {
			Computer computer = catalogo.get(i);
			System.out.println("Premi " + i + " per selezionare il computer: "
					+ computer.getModello() + " " + computer.getProcessore());
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleziona un computer: ");
		int numeroSelezione = scanner.nextInt();
		if (numeroSelezione >= 0 && numeroSelezione < catalogo.size()) {
			Computer computerSelezionato = catalogo.get(numeroSelezione);
			System.out.println("Hai selezionato: " + computerSelezionato.getModello());
			System.out.println("Inserisci prezzo per il computer: ");
			double prezzo = scanner.nextDouble();
			scontrino.aggiungiArticolo(computerSelezionato, prezzo, generaCodiceUnivoco(8)); 
			System.out.println(scontrino.toString());
		} else {
			System.out.println("Numero non valido!");
			return null; 
		}

		return scontrino;

	}



}
