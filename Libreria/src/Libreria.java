
import java.util.Scanner;

public class Libreria {

    private Libro[] libreria = new Libro[3];

    public Libreria() {
    }
    

    // metodo che aggiunge libro all'array
    public boolean aggiungiLibro(Libro nuovo) {
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] == null) {
                libreria[i] = nuovo;
                System.out.println("Inserito");
                return true;
            }

        }
        System.out.println("Non inserito");
        return false;
    }
    
    public void aggiungiLibroPotente() {
        // libro e autore 
        Libro nuovo;
        Autore nuovoNuovo;
        // chiedo le cose all'utente
        Scanner in = new Scanner(System.in);
        System.out.println("Aggiungi libro");
        System.out.println("Inserisci titolo libro");
        String t = in.next();
        System.out.println("Inserisci nome autore");
        String n = in.next();
        System.out.println("Inserisci cognome autore");
        String c = in.next();
        System.out.println("Inserisci nazionalita");
        String na = in.next();
        // costruisco l'autore e il libro
        nuovoNuovo = new Autore(n, c, na);
        nuovo = new Libro(nuovoNuovo, t);
        aggiungiLibro(nuovo);
    }

    // metodo che elimina libro dall'array
    public boolean rimuoviLibro(Libro nuovo, int pos) {
        if (libreria[pos] != null) {
            libreria[pos] = null;
            return true;
        }
        return false;
    }
    
    public boolean rimuoviLibroPotente() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci titolo libro da rimuovere");
        String t = in.next();
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null && libreria[i].getTitolo().equals(t)) {
                libreria[i] = null;
                System.out.println("Rimosso");
                return true;
            }
            
        }
        System.out.println("Non rimosso");
        return false; 
    }

    // metodo che stampa i dati della libreria
    public void stampaLibreria() {
        System.out.println("[");
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null) {
                libreria[i].stampaDatiLibro();
            } else {
                System.out.println("Vuoto");
            }
        }
        System.out.println("]");
    }

}
