package it.prova.provanegoziopc.model;

import java.util.Iterator;
import java.util.List;

public class Negozio {

	private String indirizzo; 
	private int civico; 
	private List<Computer> inventario;
	
	public Negozio() {
		
	}
	
	public Negozio(String indirizzo, int civico, List<Computer> inventario) {
		
		this.indirizzo = indirizzo; 
		this.civico = civico; 
		this.inventario = inventario; 
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getCivico() {
		return civico;
	}
	public void setCivico(int civico) {
		this.civico = civico;
	}
	public List<Computer> getInventario() {
		return inventario;
	}
	public void setInventario(List<Computer> inventario) {
		this.inventario = inventario;
	}
		
	
	
	public void gestioneInventarioPC() {
		
		for (Computer computer : inventario) {
			System.out.println(computer.getModello()+ " " + computer.getProcessore());
		}
		
		
	}
//	
//
//	public static Negozio trovaComputerDalNumeroSeriale(Computer computerDaCercare) {
//		
//		for
//		
//		
//		
//		
//	}

	
	
	
}
