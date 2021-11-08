package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		try {
			File fil = new File(mappe+filnavn);
			PrintWriter skriver = new PrintWriter(fil);
			skriver.print(samling.toString());
			skriver.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}
}
