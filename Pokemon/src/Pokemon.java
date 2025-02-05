public class Pokemon {

    // attributi
    private String nome;
    private int livello;     // information hiding 
    private int puntiVita;
    private Tipo primario, secondario;
    private Mossa[] mosse;
    private int mosseApprese = 0;
    private final int MAX_MOSSE = 4;

    // getter e setter - INCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public int getLivello() {
        return livello;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public Tipo getPrimario() {
        return primario;
    }

    public Tipo getSecondario() {
        return secondario;
    }

    public Mossa[] getMosse() {
        return mosse;
    }

    public int getMosseApprese() {
        return mosseApprese;
    }

    // costruttori - OVERLOADING
    public Pokemon() {

    }

    public Pokemon(String nome, int livello, int puntiVita, Tipo primario) {
        this.nome = nome;
        this.livello = livello;
        this.puntiVita = puntiVita;
        this.primario = primario;
        mosse = new Mossa[MAX_MOSSE];
    }

    public Pokemon(String nome, int livello, int puntiVita, Tipo primario, Tipo secondario) {
        this(nome, livello, puntiVita, primario); // richiamo altro costruttore
        this.secondario = secondario;
    }

    public void printDati() {
        System.out.println(nome + ", lv. " + livello + ", punti vita " + puntiVita + ", tipo: " + primario.name());
    }

    public boolean aggiungiMossa(Mossa m) {
        if (mosseApprese < MAX_MOSSE) {
            mosse[mosseApprese] = m;
            mosseApprese++;
            return true;
        }
        return false;

    }

    public void printMosse() {
        for (int i = 0; i < MAX_MOSSE; i++) {
            if (mosse[i] == null) {
                System.out.println("Vuoto");
            } else {
                System.out.println("Mossa " + i + " " + mosse[i].getNome());
            }
        }
    }

}
