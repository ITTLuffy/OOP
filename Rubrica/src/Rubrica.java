import java.util.ArrayList;

public class Rubrica {

    // array
    private ArrayList<Contatto> contatti;

    // costruttore
    public Rubrica() {
        contatti = new ArrayList<>(); // istanza x array, inizializzata
    }

    /*
     * void aggiungiContatto(Contatto nuova), aggiunge un nuovo contatto alla lista,
     * ma solo se un omonimo non è già presente in rubrica; in quel caso, modifica
     * il numero di telefono del contatto esistente con quello del contatto nuovo.
     * L'omonimia tra contatti si può verificare con il metodo aggiunto in
     * precedenza.
     */
    // metodo x aggiungere un contatto all'array
    public void aggiungiContatto(Contatto nuovo) {

        // sentinella per l'inserimento
        boolean presente = false;

        for (Contatto c : contatti) {
            if (c.isOmonimo(nuovo)) {
                presente = true;

                // contatto esistente, aggiorno il numero di telefono
                c.setTelefono(nuovo.getTelefono());
                break;
                // non dovrei altri omonimi, termino il ciclo
            }
        }

        // aggiungo il nuovo contatto perché non è presente
        if (!presente) {
            contatti.add(nuovo);
        }
    }

    // metodo x stampare i contatti, utilizzando il metodo stampaDati
    /*
     * void stampaContatti(), che stampa a schermo l'iniziale
     * del nome e il cognome di ogni contatto (ad esempio: "T. Morellato")
     */
    public void stampaContatti() {
        for (Contatto contatto : contatti) {
            System.out.println(contatto.stampaDati());
        }
    }

    // volevo provare a usare la lambda expression
    // public void stampaContatti() {
    // contatti.forEach(contatto -> System.out.println(contatto.stampaDati())); //
    // contatto = parametro -> separatore sout = corpo funzione
    // }
    // metodo per contare quanti numeri fissi ci sono
    /*
     * int contaNumeriFissi(), conta
     * quanti numeri di telefono iniziano per "0"
     */
    public int contaNumeriFissi() {
        int c = 0;
        for (Contatto contatto : contatti) {
            if (contatto.getTelefono().charAt(0) == '0') { // via n. 1
                c++;
            }

            // altra via
            // if (contatto.getTelefono().startsWith(0)) ...
        }
        return c;
    }

    // metodo x contare i doppioni di un array
    /*
     * boolean cercaDoppioni(String numero), cerca se sono presenti contatti che
     * possiedono lo stesso numero di telefono
     */
    public boolean isDoppione(String numero) {
        for (Contatto contatto : contatti) {
            if (contatto.getTelefono().equals(numero)) {
                return true;
            }
        }
        return false;
    }

    public boolean cercaDoppioni() {

        // devo saltare i contatti uguali, quindi il secondo ciclo parte dopo il primo
        // for (int i=0; i < contatti.size(); i++) {
        // for (int j=i+1; j < contatti.size()-1; j++) {
        //
        // if (contatti.get(i).getTelefono().equals(contatti.get(j).getTelefono()))
        // return true;
        // }
        // }
        //
        // return false;

        for (Contatto c1 : contatti) {
            for (Contatto c2 : contatti) {

                // salto i contatti uguali, "continue" passa alla prossima iterazione
                if (c1 == c2)
                    continue;

                // controllo la corrispondenza del numero
                if (c1.getTelefono().equals(c2.getTelefono()))
                    return true;
            }
        }

        return false;
    }

    /*
     * ArrayList<Contatto> ricercaAvanzata(String cercata), produce una lista di
     * contatti che presentano,
     * nel nome O nel cognome, la sottostringa cercata.
     * Potete usare il metodo contains( ) delle stringhe per cercare pezzi di
     * stringa
     */
    public ArrayList<Contatto> ricercaAvanzata(String cercata) {
        ArrayList<Contatto> risultato = new ArrayList<>();
        cercata = cercata.toLowerCase();
        for (Contatto contatto : risultato) {
            if (contatto.getNome().toLowerCase().contains(cercata)
                    || contatto.getCognome().toLowerCase().contains(cercata)) {
                risultato.add(contatto);
            }

        }
        return risultato;
    }

    public void ordinaCognome() {

        // versione estesa con corpo di funzione (necessita il return!)
        contatti.sort((c1, c2) -> {
            /*
             * if (c1 < c2)
             * return -1;
             * if (c1 > c2)
             * return +1;
             * else
             * return 0;
             */

            return c1.getCognome().compareTo(c2.getCognome());
        });
    }

    public void ordinaNome() {
        // versione compatta, con una sola istruzione non necessito le graffe
        contatti.sort((c1, c2) -> c1.getNome().compareTo(c2.getNome()));
    }

    public void ordinaEta(boolean crescente) {
        contatti.sort((c1, c2) -> {
            // classe wrapper
            return (crescente ? +1 : -1) * Integer.compare(c1.getEta(), c2.getEta());

            // if (c1.getEta() < c2.getEta())
            // return -1;
            // if (c1.getEta() > c2.getEta())
            // return +1;
            // //if (c1.getEta() == c2.getEta())
            // return 0;
        });
    }

}
