public class Contatto {
    private String nome, cognome;
    String telefono;
    Genere genere;
    
    // incapsulation

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Genere getGenere() {
        return genere;
    }

    public Contatto() {
    }

    public Contatto(String nome, String cognome, String telefono, Genere genere) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.genere = genere;
    }
    
    public String stampaDati() {
        return nome + " " + cognome + " " + telefono + " " + genere;
    }

    
    
    
    
}
