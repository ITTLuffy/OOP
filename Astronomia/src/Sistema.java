import java.util.ArrayList;

public class Sistema {

    private String nome;
    private Stella stella;
    private ArrayList<Pianeta> pianeti;
    public static double G = 6.67408e-11;

    private int numPianeti;
    private final int MAX_PIANETI = 10;

    public Sistema(String nome, Stella stella) {
        this.nome = nome;
        this.stella = stella;

        pianeti = new ArrayList<>(9);
        numPianeti = 0;
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

}
