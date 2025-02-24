public class Contatto {

    // attributi, con information hiding
    private String nome, cognome, telefono; 
    private Genere genere;

    // costruttore 
    
    public Contatto() {
    }

    public Contatto(String nome, String cognome, String telefono, Genere genere) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.genere = genere;
    }

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
    
    // metodo x stampare i dati
    public String stampaDati() {
        return nome.charAt(0) + " " + cognome;
    }

    // metodo per sapere se il nome di un contatto è uguale a quello di un altro
    public boolean isOmonimo(Contatto altro) {
        return nome.equals(altro.getNome()) && cognome.equals(altro.getCognome());
    }

}
