import java.util.ArrayList;

public class Figura {

    // creato il coso
    ArrayList<Punto> punti;

    // inizializzo, creo l'istanza
    public Figura() {
        punti = new ArrayList<>();
    }

    public boolean isPoligonoChiuso() {

    }

    public void tingi(Colore c) {
        for (Punto punto : punti) {
            punto.setColore(c);
        }
    }

    public boolean isMonocromatico() {
        boolean ris = false;
        for (int i = 0; i < punti.size() - 1; i++) {
            if (punti.get(i).getColore() != punti.get(i).getColore()) {
                return ris = false;
            } else {
                ris = true;
            }

        }
        return ris;
    }

    public double segnmentoPiuLungo() {

    }

}
