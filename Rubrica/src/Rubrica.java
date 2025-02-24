import java.util.ArrayList;

public class Rubrica {

    // array
    private ArrayList<Contatto> contatti;

    // costruttore
    public Rubrica() {
        contatti = new ArrayList<>(); // istanza x array, inizializzata
    }

    /*
    void aggiungiContatto(Contatto nuova), aggiunge un nuovo contatto alla lista, 
    ma solo se un omonimo non è già presente in rubrica; in quel caso, modifica
    il numero di telefono del contatto esistente con quello del contatto nuovo.
    L'omonimia tra contatti si può verificare con il metodo aggiunto in precedenza.  
     */
    // metodo x aggiungere un contatto all'array
    public void aggiungiContatto(Contatto nuovo) {
        for (Contatto contatto : contatti) {
            if (nuovo.isOmonimo(contatto)) {
                contatto.setTelefono(nuovo.getTelefono());
            }
        }
        contatti.add(nuovo);
    }

    // metodo x stampare i contatti, utilizzando il metodo stampaDati
    /*
    void stampaContatti(), che stampa a schermo l'iniziale 
    del nome e il cognome di ogni contatto (ad esempio: "T. Morellato")
     */
    public void stampaContatti() {
        for (Contatto contatto : contatti) {
            System.out.println(contatto.stampaDati());
        }
    }

    // volevo provare a usare la lambda expression
//    public void stampaContatti() {
//        contatti.forEach(contatto -> System.out.println(contatto.stampaDati())); // contatto = parametro -> separatore sout = corpo funzione
//    }
    // metodo per contare quanti numeri fissi ci sono
    /*
    int contaNumeriFissi(), conta 
    quanti numeri di telefono iniziano per "0"
     */
    public int contaNumeriFissi() {
        int c = 0;
        for (Contatto contatto : contatti) {
            if (contatto.getTelefono().charAt(contatto.getTelefono().length() - 1) == '0') { // via n. 1
                c++;
            }

            // altra via
            // if (contatto.getTelefono().startsWith(0)) ...
        }
        return c;
    }

    // metodo x contare i doppioni di un array
    /*
    boolean cercaDoppioni(String numero), cerca se sono presenti contatti che possiedono lo stesso numero di telefono 
     */
    public boolean cercaDoppioni(String numero) {
        for (Contatto contatto : contatti) {
            if (contatto.getTelefono().equals(numero)) {
                return true;
            }
        }
        return false;
    }

    /*
    ArrayList<Contatto> ricercaAvanzata(String cercata), produce una lista di contatti che presentano, 
    nel nome O nel cognome, la sottostringa cercata. 
    Potete usare il metodo contains( ) delle stringhe per cercare pezzi di stringa
     */
    public ArrayList<Contatto> ricercaAvanzata(String cercata) {
        ArrayList<Contatto> risultato;
        risultato = new ArrayList<>();
        for (Contatto contatto : risultato) {
            if (contatto.getNome().contains(cercata) || contatto.getCognome().contains(cercata)) {
                risultato.add(contatto);
            }

        }
        return risultato;
    }

}
