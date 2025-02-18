package libreria;

public class Libro {
    
    // attributi
    private Autore autore;
    private String titolo;
    
    // costruttori
    public Libro(Autore autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
    }

    public Libro() {
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    
    // metodo che stampa i dati del libro
    public void stampaDatiLibro() {
        System.out.println(titolo + " " + autore.stampaDatiAutore());
    }
    
    
    
}
