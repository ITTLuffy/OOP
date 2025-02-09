public class Sistema {

    private String nome;
    private Stella stella;
    private Pianeta[] pianeti;

    private int numPianeti;
    private final int MAX_PIANETI = 10;

    public Sistema(String nome, Stella stella) {
        this.nome = nome;
        this.stella = stella;

        pianeti = new Pianeta[MAX_PIANETI];
        numPianeti = 0;
    }

    public void stampaPianeti() {

        System.out.println("[");

//        for (int i=0; i<pianeti.length; i++) {
//            
//            Pianeta p = pianeti[i];
//        }
        for (Pianeta p : pianeti) {

            // controllo se esiste il pianeta
            if (p != null) {
                p.stampaDati();
            } else {
                System.out.println("Nessun dato");
            }
        }

        System.out.println("]");
    }

    /**
     * Metodo per aggiungere un pianeta
     *
     * @param p1 Pianeta da aggiungere
     */
    public boolean aggiungiPianeta(Pianeta p1) {
        if (numPianeti >= 0 && numPianeti < MAX_PIANETI) {
            pianeti[numPianeti] = p1;
            numPianeti++;
            return true;
        } else {
            return false;
        }
    }
    
    

}
