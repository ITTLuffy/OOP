
import java.util.ArrayList;

public class Figura {

    // creato il coso
    ArrayList<Punto> punti;

    // inizializzo, creo l'istanza
    public Figura() {
        punti = new ArrayList<>();
    }

    public void aggiungiPunto(Punto aggiunto) {
        punti.add(aggiunto);
    }

    public boolean isPoligonoChiuso() {
        // ultimo punto
        boolean chiuso = punti.get(0).getX() == punti.get(punti.size() - 1).getX()
                && punti.get(0).getY() == punti.get(punti.size() - 1).getY();
        // coppie
        for (int i = 0; i < punti.size() - 2; i += 2) {
            if (punti.get(i).getX() != punti.get(i + 1).getX()
                    || punti.get(i).getY() != punti.get(i + 1).getY()) {
                return false;
            }

        }
        return chiuso;
    }

    public void tingi(Colore c) {
        for (Punto punto : punti) {
            punto.setColore(c);
            System.out.println(punto.getColore());
        }
    }

    public boolean isMonocromatico() {
        boolean ris = false;
        for (int i = 0; i < punti.size() - 1; i++) {
            if (punti.get(i).getColore() != punti.get(i + 1).getColore()) {
                return false;
            } else {
                ris = true;
            }

        }
        return ris;
    }

    public double segmentoPiuLungo() {
        double ris = 0;
        for (int i = 0; i < punti.size() - 2; i += 2) {
            double dis = Punto.distanza(punti.get(i), punti.get(i + 1));
            if (dis > ris) {
                ris = dis;
            }
        }
        return ris;
    }

    public double segmentoColoratoPiuLungo() {
        double ris = 0;
        for (int i = 0; i < punti.size() - 2; i += 2) {
            double dis = Punto.distanza(punti.get(i), punti.get(i + 1));
            if (dis > ris && punti.get(i).getColore() == punti.get(i).getColore()) {
                ris = dis;
            }
        }
        return ris;
    }
    
    public boolean checkColoriSegmenti() {
        boolean ris = false;
        for (int i = 0; i < punti.size() - 1; i+=2) {
            
            if(punti.get(i).getColore() != punti.get(i + 2).getColore()) 
                return ris;
            else 
                ris = true;
        }
        return ris;
    }
    
    public double perimetro() {
        double ris;
        if (!isPoligonoChiuso()) {
            return 0;
        } else {
            ris = 0;
            for (int i = 0; i < punti.size() - 1; i++) {
                ris += Punto.distanza(punti.get(i), punti.get(i+1));
            }
        }
        return ris;
    }

}

