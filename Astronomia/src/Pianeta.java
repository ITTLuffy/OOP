public class Pianeta {
    
    // attributi o campi
    private String nome;
    private double massa, raggio, distanzaStella;
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
    
    public double gravità() {
        return (Sistema.G*this.massa)/Math.pow(this.raggio, 2);
    }
    
}
