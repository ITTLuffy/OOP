public class Pianeta {
    
    // attributi o campi
    private String nome;
    private double massa, raggio, distanzaStella;
    private final double COST_GRAVIT = 6.67408e-11;
    // information hiding
    
    // -----------------------------
    
    // incapsulamento (encapsulation)
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMassa() {
        return massa;
    }

    public double getRaggio() {
        return raggio;
    }

    public double getDistanzaStella() {
        return distanzaStella;
    }
    
    // costruttore
    public Pianeta() {}
    
    public Pianeta(String nome, double massa, double raggio, double distanza) {
        // crea l'istanza
        // inizializza gli attributi
        this.nome = nome;
        this.massa = massa;
        this.raggio = raggio;
        this.distanzaStella = distanza;
    }

    public void stampaDati() {
        System.out.println(this.nome + ": " + this.distanzaStella);
    }
    
    public double gravità(Pianeta p1) {
        return (COST_GRAVIT*p1.getMassa())/Math.pow(p1.getRaggio(), 2);
    }
    
}
