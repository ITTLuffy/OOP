
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // calciatori vari
        Calciatore c1 = new Calciatore("Mike", "Maignan", Ruolo.POR, 6.5, false);
        Calciatore c2 = new Calciatore("Gianluigi", "Donnarumma", Ruolo.POR, 7.0, false);
        Calciatore c3 = new Calciatore("Alessandro", "Bastoni", Ruolo.DIF, 6.9, false);
        Calciatore c4 = new Calciatore("Theo", "Hernandez", Ruolo.DIF, 7.5, false);
        Calciatore c5 = new Calciatore("Milan", "Skriniar", Ruolo.DIF, 7.2, false);
        Calciatore c6 = new Calciatore("Nicolo", "Barella", Ruolo.CEN, 7.4, false);
        Calciatore c7 = new Calciatore("Lorenzo", "Pellegrini", Ruolo.CEN, 7.1, false);
        Calciatore c8 = new Calciatore("Marco", "Verratti", Ruolo.CEN, 7.3, false);
        Calciatore c9 = new Calciatore("Federico", "Chiesa", Ruolo.ATT, 7.6, false);
        Calciatore c10 = new Calciatore("Ciro", "Immobile", Ruolo.ATT, 8.0, false);
        Calciatore c11 = new Calciatore("Giovanni", "Di Lorenzo", Ruolo.DIF, 6.8, true);
        Calciatore c12 = new Calciatore("Leonardo", "Spinazzola", Ruolo.DIF, 6.7, false);
        Calciatore c13 = new Calciatore("Luca", "Milanese", Ruolo.CEN, 4.5, false);
        Calciatore c14 = new Calciatore("Antonio", "Candreva", Ruolo.CEN, 5.9, false);
        Calciatore c15 = new Calciatore("Giacomo", "Raspadori", Ruolo.ATT, 4.1, false);
        Calciatore c16 = new Calciatore("Matteo", "Politano", Ruolo.ATT, 6.8, true);
        Calciatore c17 = new Calciatore("Sandro", "Tonali", Ruolo.CEN, 7.2, false);
        Calciatore c18 = new Calciatore("Raul", "Albiol", Ruolo.DIF, 6.4, false);
        Calciatore c19 = new Calciatore("Giuseppe", "Pezzella", Ruolo.DIF, 6.3, false);
        Calciatore c20 = new Calciatore("Andrea", "Belotti", Ruolo.ATT, 7.0, false);
        Calciatore c21 = new Calciatore("Francesco", "Acerbi", Ruolo.DIF, 6.4, false);
        Calciatore c22 = new Calciatore("Roberto", "Gagliardini", Ruolo.CEN, 5.5, false);

        // squadra
        Squadra s1 = new Squadra("Italia");
        // aggiunta giocatori
        s1.aggiungiGiocatore(c1);
        s1.aggiungiGiocatore(c2);
        s1.aggiungiGiocatore(c3);
        s1.aggiungiGiocatore(c4);
        s1.aggiungiGiocatore(c5);
        s1.aggiungiGiocatore(c6);
        s1.aggiungiGiocatore(c7);
        s1.aggiungiGiocatore(c8);
        s1.aggiungiGiocatore(c9);
        s1.aggiungiGiocatore(c10);
        s1.aggiungiGiocatore(c11);
        s1.aggiungiGiocatore(c12);
        s1.aggiungiGiocatore(c13);
        s1.aggiungiGiocatore(c14);
        s1.aggiungiGiocatore(c15);
        s1.aggiungiGiocatore(c16);
        s1.aggiungiGiocatore(c17);
        s1.aggiungiGiocatore(c18);
        s1.aggiungiGiocatore(c19);
        s1.aggiungiGiocatore(c20);
        s1.aggiungiGiocatore(c21);
        s1.aggiungiGiocatore(c22);

        // funzione conta per ruolo
        System.out.println("Portieri");
        System.out.println(s1.contaPerRuolo(Ruolo.POR));
        System.out.println("Difensori");
        System.out.println(s1.contaPerRuolo(Ruolo.DIF));
        System.out.println("Centrocampisti");
        System.out.println(s1.contaPerRuolo(Ruolo.CEN));
        System.out.println("Attaccanti");
        System.out.println(s1.contaPerRuolo(Ruolo.ATT));

        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");

        // funzione stampa filtrata
        System.out.println("Portieri");

        s1.stampaFiltrata(Ruolo.POR);

        System.out.println("Difensori");

        s1.stampaFiltrata(Ruolo.DIF);

        System.out.println("Centrocampisti");

        s1.stampaFiltrata(Ruolo.CEN);

        System.out.println("Attaccanti");

        s1.stampaFiltrata(Ruolo.ATT);

        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");

        // funzione cerca migliore
        System.out.println("Giocatore migliore");
        Calciatore migliore = s1.cercaMigliore();
        migliore.stampaDati();

        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");

        // funzione cerca peggiore
        System.out.println("Calciatori peggiori");
        ArrayList<Calciatore> peggiori = s1.trovaPeggiori();
        for (Calciatore calciatore : peggiori) {
            calciatore.stampaDati();
        }
        
        // funzione rimuovi infortunati
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Giocatori infortunati rimossi");
        System.out.println(s1.rimuoviInfortunati());
        
    }

}
