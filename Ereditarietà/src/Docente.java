public class Docente extends Persona{
    private String materia;

    public Docente(String materia) {
        this.materia = materia;
    }

    public Docente(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "materia=" + materia;
    }
}
