public class Mossa {
    
    private String nome;
    private int danno;
    private int precisione;
    private Tipo tipo;
        
    

    public Mossa(String nome, int danno, int precisione, Tipo tipo) {
        this.nome = nome;
        this.danno = danno;
        this.precisione = precisione;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDanno() {
        return danno;
    }

    public int getPrecisione() {
        return precisione;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
