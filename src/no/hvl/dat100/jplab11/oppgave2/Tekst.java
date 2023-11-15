package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
	private String tekst;

    public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        super(id, bruker, dato, likes);
        this.tekst = tekst;
    }
    
//public get/set metoder for tekst klassen
    
    public String getTekst() {
        return tekst;
    }
    

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
    
        
        public String toString() {
            return "TEKST" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "nen " + getTekst() + "\n" ;
}
    }
