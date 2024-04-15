package it.prova.provanegoziopc.model;

public class Computer {

	private String marca; 
	private String modello; 
	private String schedaMadre; 
	private String processore; 
	private String numeroSeriale; 
	

	public Computer() {
		
	}
	
	public Computer(String marca, String modello, String schedaMadre, String processore, String numeroSeriale) {
		
		this.marca = marca; 
		this.modello = modello; 
		this.schedaMadre = schedaMadre; 
		this.processore = processore; 	
		this.numeroSeriale = numeroSeriale;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getSchedaMadre() {
		return schedaMadre;
	}

	public void setSchedaMadre(String schedaMadre) {
		this.schedaMadre = schedaMadre;
	}
	
	public String getProcessore() {
		return processore;
	}

	public void setProcessore(String processore) {
		this.processore = processore;
	}
	
	public String getNumeroSeriale() {
		return numeroSeriale;
	}

	public void setNumeroSeriale(String numeroSeriale) {
		this.numeroSeriale = numeroSeriale;
	}
	
	
	
}
