package no.hvl.dat100.jplab11.oppgave3;

import java.util.Arrays;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {
	
	private int lengde;
	private int id;
	private int dato;
	private String tekst;
	private String bruker;
	private String url;
	private Innlegg[] innleggtabell;
	private int nesteledige;

	// TODO: objektvariable 

	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
	
		this.lengde = lengde;
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return this.nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledige && !funnet) {
			if (innleggtabell[pos] == innlegg)
			funnet = true;
			else 
			pos++;
		}
		if (funnet) return pos;
		else 
			return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		if (pos >= 0) {
			return true;
		} else {
			return false;
		}
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
		boolean ny = finnInnlegg(innlegg) == -1;
		if(ny&& nesteledige < innleggtabell.length) {
			innleggtabell[nesteledige] = innlegg;
			nesteledige ++;
			return true;
		} else {
			return false;
		}
}
	
	
	public String toString() {
		String svar = "2"+"\n";
        for (int i = 0; i < nesteledige; i++) {
            svar += innleggtabell[i].toString() + "";
        }
        return svar;
		
//		"2\n" + 
//				"TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n" + 
//				"BILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n";
		
//	Blogg samling = new Blogg(2);
//		
//		Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10","en tekst");
//		Bilde innlegg2 = new Bilde(2,"Oline Olsen","24-10","et bilde","http://www.picture.com/oo.jpg");
//		
//		2\nTEKST\n1\nOle Olsen\n23-10\n0\nen tekst\nBILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
////
//		return"2\n" + "TEKST" + "\n" + id + "\n" + bruker + "\n" + dato + "\n" + tekst + "\n" + "BILDE" + "\n" + id + "\n" + bruker + "\n" + dato + "\n" + tekst + "\n" + url + "\n";
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