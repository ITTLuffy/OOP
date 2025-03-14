public class Ered {
    public static void main(String[] args) throws Exception {

        Persona p = new Persona("Fede", "Espo");
        System.out.println(p.toString());

        Studente s = new Studente("Gustavo", "Latorta", "ITT Marconi", "IIIC");
        System.out.println(s.toString());
        
        Docente c = new Docente("Thomas", "Morellato", "Informatica");
        System.out.println(c.toString());

    }
}
