public class Astronomia {

    public static void main(String[] args) {
        
        Pianeta p1 = new Pianeta("Mercurio", 3.33e23, 2.43965e6, 5.7909175e10);
        Pianeta p2 = new Pianeta("Venere", 4.869e24, 6.05159e6, 1.08208930e11);
        Pianeta p3 = new Pianeta("Terra", 5.97219e24, 6.37815e6, 1.49598262e11);
        Pianeta p4 = new Pianeta("Marte", 6.4191e23, 3.397e6, 2.2793664e11);
        Pianeta p5 = new Pianeta("Giove", 1.8987e27, 7.149268e7, 7.7841201e11);
        Pianeta p6 = new Pianeta("Saturno", 5.6851e26, 6.026714e7, 1.4267254e12);
        Pianeta p7 = new Pianeta("Urano", 8.6849e25, 2.555725e7, 2.8709722e12);
        Pianeta p8 = new Pianeta("Nettuno", 1.0244e26, 2.476636e7, 4.4982529e12);
        Pianeta p9 = new Pianeta("Plutone", 1.3105e22, 1.184e6, 5.90638e12);
        
        System.out.println(p1.getNome());  
        p3.stampaDati();
        
        Stella sole = new Stella("Sole", 1.989e30);
        
        Sistema solare = new Sistema("Sistema solare", sole);
        
        solare.appendi(p1);
        solare.appendi(p2);
        solare.appendi(p3);
        solare.appendi(p4);
        solare.appendi(p5);
        solare.appendi(p6);
        solare.appendi(p7);
        solare.appendi(p8);
        solare.appendi(p9);
        solare.stampaPianeti();
        
        System.out.println(p1.gravità());
        System.out.println(p2.gravità());
        System.out.println(p3.gravità());
        System.out.println(p4.gravità());
        System.out.println(p5.gravità());
        System.out.println(p6.gravità());
        System.out.println(p7.gravità());
        System.out.println(p8.gravità());
        System.out.println(p9.gravità());

        solare.inserisci(p9, 4);
        solare.inserisci(p1, 0);
        solare.stampaPianeti();

        System.out.println("Plutone " + solare.contiene(p9));
        System.out.println("Plutone " + solare.trovaPosizione(p9));

        System.out.println("Doppioni " + solare.rimuoviTutti(p9));

        
        
    }
    
}
