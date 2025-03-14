import java.util.ArrayList;

public class Sistema {

    private String nome;
    private Stella stella;
    private ArrayList<Pianeta> pianeti;
    public static double G = 6.67408e-11;

    public Sistema(String nome, Stella stella) {
        this.nome = nome;
        this.stella = stella;

        pianeti = new ArrayList<>(9);
    }

    public void stampaPianeti() {

        System.out.println("[");

        // for (int i=0; i<pianeti.length; i++) {
        //
        // Pianeta p = pianeti[i];
        // }
        for (Pianeta p : pianeti) {

            // controllo se esiste il pianeta
            p.stampaDati();
        }

        System.out.println("]");
    }

    // metodi con FEATURES di arrayList

    /**
     * Metodo per aggiungere un pianeta
     *
     * @param p1 Pianeta da aggiungere
     */
    public void appendi(Pianeta nuovo) {

        pianeti.add(nuovo);

    }

    public boolean inserisci(Pianeta nuovo, int pos) {

        if (pos < 0 || pos > pianeti.size()) {
            return false;
        } else {
            // aggiungo pianeta nella pos scelta, shiftando il resto
            pianeti.add(pos, nuovo);
            return true;
        }

    }

    public boolean contiene(Pianeta cercato) {
        return pianeti.contains(cercato);
    }

    public int trovaPosizione(Pianeta cercato) {
        return pianeti.indexOf(cercato);
    }

    public Pianeta leggi(int pos) {
        if (pos < 0 || pos > pianeti.size()) {
            return null;
        }
        return pianeti.get(pos);
    }

    public Pianeta sostituisce(int pos, Pianeta nuovo){
        if (pos < 0 || pos > pianeti.size()) {
            return null;
        }
        
        return pianeti.set(pos, nuovo);

    }

    public Pianeta rimuovi(int pos) {
        if (pos < 0 || pos > pianeti.size()) {
            return null;
        }
        return pianeti.remove(pos);
    }

    public boolean cercaPianeta(String nomePianeta) {
        for (Pianeta nuovo : pianeti) {
            if (nuovo.getNome().equals(nomePianeta)) {
                return true;
            }
            
        }
        return false;
    }

    public int rimuoviTutti(Pianeta nuovo) {
        int pianetiTrovati = 0;
        for (int idx = pianeti.size() - 1; idx >= 0; idx--) {
            // if (pianeti.get(idx) == p) --> l'istanza è la stessa
            if (pianeti.get(idx).getNome().equals(nuovo.getNome())) { // si possono anche confrontare le istanze in questo caso
                pianetiTrovati++;
                pianeti.remove(idx);
            }
            
        }
        return pianetiTrovati;

    }

    public boolean isVuoto() {
        return pianeti.isEmpty();
    }

    


}
