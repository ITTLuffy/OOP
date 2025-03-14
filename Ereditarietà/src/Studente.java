public class Studente extends Persona {

    private String istituto, classe;

    public Studente(String nome, String cognome, String istituto, String classe) {
        super(nome, cognome);
        this.istituto = istituto;
        this.classe = istituto;
    }

    @Override
    public String toString() {
        return super.toString() + "istituto=" + istituto + ", classe=" + classe;
    }
 

}
