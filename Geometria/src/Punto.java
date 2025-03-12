public class Punto {
    
    // attributi con information hiding
    private int x;
    private int y;
    private Colore colore;

    // costruttori
    public Punto() {
    }
    
    public Punto(int x, int y, Colore colore) {
        this.x = x;
        this.y = y;
        this.colore = colore;
    }

    // incapsulation
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Colore getColore() {
        return colore;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }
    
    public double distanza(Punto p1, Punto p2) {
        int distanzaX;
        int distanzaY;
        
        distanzaX = p1.getX() - p2.getX();
        distanzaY = p1.getY() - p2.getY();     
        double risultato;
        return risultato = Math.sqrt(Math.pow(distanzaX, 2) + Math.pow(distanzaY, 2));
    }
    
    
}
