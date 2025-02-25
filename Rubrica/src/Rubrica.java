
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
        boolean presente = false;
        for (Contatto contatto : contatti) {
            if (contatto.isOmonimo(nuovo)) {
                presente = true;

                contatto.setTelefono(nuovo.getTelefono());

                break;
            }
        }
        if (!presente) {
            contatti.add(nuovo);    
        }
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
            if (contatto.getTelefono().startsWith("0")) {
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

    /**
     * boolean cercaDoppioniPotente(), cerca se sono presenti contatti che
     *
     * @return possiedono lo stesso numero di telefono
     *
     */
    public boolean cercaDoppioniPotente() {
        for (int i = 0; i < contatti.size(); i++) {
            for (int j = 0; j < contatti.size(); j++) {
                if (contatti.get(i).getTelefono().equals(contatti.get(j).getTelefono()) && i != j) {
                    return true;
                }

            }

            return false;
        


    

    public boolean cercaDoppioniForEach() {
    

        for (Contatto contatto : contatti) {
            for (Contatto contatto2 : contatti) {
                if (contatto.getTelefono().equals(contatto2.getTelefono()) && contatto != contatto2) {
                    return true;
                }
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
