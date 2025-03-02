import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Contatto c1 = new Contatto("Alessio", "Ferrari", "3478156324", Genere.Maschio);
        Contatto c2 = new Contatto("Mario", "Rossi", "3786521490", Genere.Maschio);
        Contatto c3 = new Contatto("Federico", "Esposito", "0817654329", Genere.Maschio);
        Contatto c4 = new Contatto("Manuel", "Gjergji", "3135928471", Genere.Maschio);
        Contatto c5 = new Contatto("Mohammad", "Alì", "3924175839", Genere.Maschio);
        Contatto c6 = new Contatto("Maurizio", "Ferrari", "3668412067", Genere.Maschio);
        Contatto c7 = new Contatto("Davide", "Cesari", "025789643", Genere.Maschio);
        Contatto c8 = new Contatto("Giacomo", "Masiero", "3892741563", Genere.Maschio);
        Contatto c9 = new Contatto("Eduard", "Apetroaie", "069874321", Genere.Maschio);
        Contatto c10 = new Contatto("Lucio", "Esposito", "3209475638", Genere.Maschio);
        Contatto c11 = new Contatto("Mummi", "Esposito", "0113498271", Genere.Maschio);
        System.out.println(c1.isOmonimo(c3));
        
        c1.stampaDati();
        Rubrica r1 = new Rubrica();
        r1.aggiungiContatto(c1);
        r1.aggiungiContatto(c2);
        r1.aggiungiContatto(c3);
        r1.aggiungiContatto(c4);
        r1.aggiungiContatto(c5);
        r1.aggiungiContatto(c6);
        r1.aggiungiContatto(c7);
        r1.aggiungiContatto(c8);
        r1.aggiungiContatto(c9);
        r1.aggiungiContatto(c10);
        r1.aggiungiContatto(c11);
                
        r1.stampaContatti();
        
        
        System.out.println(r1.contaNumeriFissi());
        System.out.println(r1.cercaDoppioni("0817654329"));
        ArrayList<Contatto> nuovo = r1.ricercaAvanzata("Espo");
        for (Contatto c : nuovo) {
            c.stampaDati();
        }

    }
    
}
