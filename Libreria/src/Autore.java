public class Autore {
    
   // attributi
   
   private String nome, cognome, nazionalita;
   
   // costruttori

    public Autore(String nome, String cognome, String nazionalita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
    }

    public Autore() {
    }

    // incapsulamento
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }
   
    // metodo che ritorna i dati dell'autore
    public String stampaDatiAutore() {
        return nome + ", " + cognome + ", " + nazionalita;
    } 
    
}
