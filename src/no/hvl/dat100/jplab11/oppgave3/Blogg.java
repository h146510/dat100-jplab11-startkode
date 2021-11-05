package no.hvl.dat100.jplab11.oppgave3;

import java.util.Arrays;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private int lengde;
	private int antall;
	private int id;
	private int dato;
	private String tekst;
	private String url;
	private Innlegg[] innleggtabell;

	// TODO: objektvariable 

	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
	
		this.lengde = lengde;
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return this.antall;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		return false;
}

	public boolean ledigPlass() { 
		  for (int i = 0; i < innleggtabell.length; i++) {
	            if(innleggtabell[i] == null) {
	                return true;
	            }
	            else
	                i++;
	        }return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		 {
			
		}
		return true;
	}
	
	public String toString() {
//		"2\n" + 
//				"TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n" + 
//				"BILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n";
		return "2\n" +
		
		 "TEKST" + "\n" + id + "\n" + dato + "\n" + tekst + "\n" +
		
		 "BILDE" + "\n" + id + "\n" + dato + "\n" + tekst + "\n" + url + "\n";
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}