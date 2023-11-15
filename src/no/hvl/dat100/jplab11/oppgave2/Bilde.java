package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {
        private String url;

        public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
            super(id, bruker, dato, likes, tekst);
            this.url = url;
        }
        
//public get/set metoder for bilde klassen
        
        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String toString() {
             return "BILDE" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "net Bildet\n" + getUrl() + "\n";
        }
}
        

