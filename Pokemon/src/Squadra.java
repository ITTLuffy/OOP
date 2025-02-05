public class Squadra {

    // vettore di Pokemon
    private Pokemon[] team;

    private int numPokemon;
    private final int MAX_POKEMON = 6;

    public Squadra(Pokemon[] team) {
        this.team = team;
    }

    public Squadra() {
        team = new Pokemon[MAX_POKEMON];
        this.numPokemon = 0;
    }

    public boolean aggiungiPokemon(Pokemon nuovo) {
        if (numPokemon < MAX_POKEMON) {
            team[numPokemon] = nuovo;
            numPokemon++;
            return true;
        } else {
            return false;
        }

    }

    public Pokemon deposita(int posizione) {
        if (posizione >= MAX_POKEMON || posizione < 0) {
            return null;
        }
        
        // salvo da parte
        Pokemon depositato = team[posizione];
        
        for (int i = posizione; i < team.length - 1; i++) {
            team[i] = team[i + 1];
        }

        team[MAX_POKEMON - 1] = null;
        numPokemon--;
        return depositato;
    }

    public void stampa() {
        System.out.println("[");
        for (Pokemon p : team) {
            if (p != null) {
                p.printDati();
            } else {
                System.out.println("Vuoto");
            }
        }
        System.out.println("]");

    }

    public boolean cercaDoppi() {
        for (int i = 0; i < MAX_POKEMON - 1; i++) {
            for (int k = i; k < 10; k++) {
                if (team[i].getNome().equals(team[k].getNome())) {
                    System.out.println("Presente");
                    return true;
                }

            }
        }
        System.out.println("No");
        return false;
    }

    public boolean cercaDoppione(Pokemon p) {
        // controllo esistenza
        if (p == null) {
            return false;
        }

        for (int i = 0; i < MAX_POKEMON; i++) {
            if (team[i].getNome().equals(p.getNome())) {
                System.out.println("Si");
                return true;
            }

        }
        System.out.println("No");
        return false;
    }

    public boolean isMonotype(Tipo cercato) {
        for (int i = 0; i < MAX_POKEMON - 1; i++) {
            for (int k = i; k < MAX_POKEMON; k++) {
                if (team[i].getPrimario() != cercato && team[i].getSecondario() != cercato) {
                    System.out.println("No");
                    return false;
                }                     
            }
        }
        return true;
    }
    
    // classe Mossa
    // nome - stringa
    // danno (intero)
    // precisione (intero)
    // Tipo (fuoco, acqua, ...) 
    // 
    
    
    
    
    
}
