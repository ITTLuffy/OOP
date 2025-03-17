public class Main {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(0, 0, Colore.BLU);
        Punto p2 = new Punto(3, 0, Colore.BLU);
        Punto p3 = new Punto(3, 0, Colore.BLU);
        Punto p4 = new Punto(1, 2, Colore.BLU);
        Punto p5 = new Punto(1, 2, Colore.BLU);
        Punto p6 = new Punto(0, 0, Colore.BLU);
        
        System.out.println(Punto.distanza(p1, p2));
        
        Figura f1 = new Figura();
        f1.aggiungiPunto(p1);
        f1.aggiungiPunto(p2);
        f1.aggiungiPunto(p3);
        f1.aggiungiPunto(p4);
        f1.aggiungiPunto(p5);
        f1.aggiungiPunto(p6);
        System.out.println(f1.isPoligonoChiuso());        
        f1.tingi(Colore.ROSSO);
        System.out.println(f1.isMonocromatico());
        System.out.println(f1.segmentoPiuLungo());
    }
}
