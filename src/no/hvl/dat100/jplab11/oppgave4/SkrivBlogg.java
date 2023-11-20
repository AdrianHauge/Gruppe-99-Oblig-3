package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.File;

import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	private static String mappe = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String fil = filnavn;
		
		try {
		File file = new File(mappe+fil);
		PrintWriter skriver = new PrintWriter(file);
		
		skriver.println(samling.toString());
		skriver.close();
		
		Innlegg[] innleggArray = samling.getSamling();
		
		skriver.println(samling.getAntall());
		
		for (int i = 0; i < samling.getAntall(); i++) {
			skriver.println (innleggArray[i].toString());
		}
		
		return true;
		
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Filen finnes ikke.");
			return false;
		}
		
	}

	public static void main(String[] args) {
		Blogg blogg = new Blogg();

		skriv(blogg, "Bloggen", "blogg.dat");
	}
}