public class Main {

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Pikachu", 14, 70, Tipo.Erba);
        Pokemon p2 = new Pokemon("Charmander", 35, 327, Tipo.Erba);
        Pokemon p3 = new Pokemon("Eevee", 7, 30, Tipo.Erba);
        Pokemon p4 = new Pokemon("Squirtle", 7, 30, Tipo.Erba);
        Pokemon p5 = new Pokemon("Pidgeotto", 7, 30, Tipo.Erba);
//        Pokemon p7 = new Pokemon("Charmander", 35, 327, Tipo.Fuoco);

        Pokemon p6 = new Pokemon("Bulbasaur", 7, 30, Tipo.Normale);

        Squadra myTeam = new Squadra();
        myTeam.aggiungiPokemon(p1);
        myTeam.aggiungiPokemon(p2);
        myTeam.aggiungiPokemon(p3);
        myTeam.aggiungiPokemon(p4);
        myTeam.aggiungiPokemon(p5);
        myTeam.aggiungiPokemon(p6);
        

        myTeam.stampa();

//        myTeam.deposita(2);
        myTeam.stampa();

//        myTeam.cercaDoppione(p2);
        
//        myTeam.isMonotype(Tipo.Erba);
        
        // garbage collector
        
        Mossa m1 = new Mossa("Graffio", 20, 80, Tipo.Normale);
        Mossa m2 = new Mossa("Fulmine", 30, 90, Tipo.Elettro);
        Mossa m3 = new Mossa("Morso", 10, 70, Tipo.Normale);
        Mossa m4 = new Mossa("Idropompa", 30, 99, Tipo.Acqua);
        Mossa m5 = new Mossa("Torsione Alare", 50, 70, Tipo.Normale);
        
        p1.aggiungiMossa(m5);
        p1.aggiungiMossa(m1);
        p1.aggiungiMossa(m2);
        p1.aggiungiMossa(m3);   
        p1.aggiungiMossa(m4);     
        p2.printMosse();
        
        
    }

}
