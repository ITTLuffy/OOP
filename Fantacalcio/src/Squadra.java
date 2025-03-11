
import java.util.ArrayList;

public class Squadra {

    private String nome;
    private ArrayList<Calciatore> calciatori;
    private final int MAX_POR = 3;
    private final int MAX_DIF = 8;
    private final int MAX_CEN = 6;
    private final int MAX_ATT = 6;

    public Squadra(String nome) {
        this.nome = nome;
        calciatori = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    int contaPerRuolo(Ruolo r), che conta quanti giocatori 
    di un determinato ruolo sono inseriti in squadra
     */
    public int contaPerRuolo(Ruolo r) {
        int c = 0;
        for (Calciatore calciatore : calciatori) {
            if (calciatore.getRuolo() == r) {
                c++;
            }
        }
        return c;
    }

    /*
    void stampaFiltrata(Ruolo filtro), che visualizza a schermo 
    le informazioni solo dei giocatori del ruolo indicato. 
    Se il dato passato in input è null va visualizzata tutta la squadra.
     */
    public void stampaFiltrata(Ruolo filtro) {
        for (Calciatore calciatore : calciatori) {
            if (calciatore.getRuolo() == filtro || filtro == null) { // metto == pk confronto le istanze
                calciatore.stampaDati();
            }
        }
    }

    /*
    - Calciatore cercaMigliore(), che ritorna il 
    calciatore con la mediaVoto più alta
     */
    public Calciatore cercaMigliore() {
        Calciatore migliore = calciatori.get(0);  // Inizializza con il primo calciatore della lista
        for (int i = 1; i < calciatori.size(); i++) {  // Inizia dal secondo calciatore
            if (calciatori.get(i).getMediaVoto() > migliore.getMediaVoto()) {
                migliore = calciatori.get(i);  // Aggiorna il miglior calciatore
            }
        }
        return migliore;
    }

    /*
    - ArrayList<Calciatore> trovaPeggiori(), che filtra i giocatori in squadra
    e produce un nuovo arraylist contenente i giocatori (non portieri)
    la cui media voto è minore di 6
     */
    public ArrayList<Calciatore> trovaPeggiori() {
        ArrayList<Calciatore> peggiori = new ArrayList<>(); // arrayList da restituire
        for (int i = 0; i < calciatori.size(); i++) {
            if (calciatori.get(i).getRuolo() != Ruolo.POR && calciatori.get(i).getMediaVoto() < 6) {
                peggiori.add(calciatori.get(i));
            }
        }
        return peggiori;
    }

    /*
    - int rimuoviInfortunati(), che rimuove tutti i giocatori 
    infortunati dalla rosa, restituendo il numero di giocatori rimossi
     */
    public int rimuoviInfortunati() {
        int rimossi = 0;
        for (int i = 0; i < calciatori.size(); i++) {
            if (calciatori.get(i).isInfortunato()) {
                calciatori.remove(i);
                rimossi++;
            }

        }

        return rimossi;
    }

    /*
    - void aggiungiGiocatore(Calciatore nuovo), che inserisce un nuovo calciatore 
    in squadra a patto che ci sia posto. Nota: ogni rosa può possedere al massimo 3 portieri, 
    8 difensori, 6 centrocampisti e 6 attaccanti (dati che possono essere gestiti come costanti). 
    Per controllare la validità dell'inserimento, sfruttare la funzione del passo precedente.
     */
    public void aggiungiGiocatore(Calciatore nuovo) {
        Ruolo finale = nuovo.getRuolo(); // ruolo
        switch(finale) { // switch
            case POR -> {
                if (contaPerRuolo(finale) < MAX_POR) { // varie condizioni x aggiungere
                    calciatori.add(nuovo);
                }
            }
            case DIF -> {
                if (contaPerRuolo(finale) < MAX_DIF) {
                    calciatori.add(nuovo);
                }
            }
            case CEN -> {
                if (contaPerRuolo(finale) < MAX_CEN) {
                    calciatori.add(nuovo);
                }
            }
            case ATT -> {
                if (contaPerRuolo(finale) < MAX_ATT) {
                    calciatori.add(nuovo);
                }
            }
            default -> {
            }
        }
        // switch
        
    }

}
