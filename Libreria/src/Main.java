import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Autore a1 = new Autore("Ken", "Follet", "inglese");
        Libro l1 = new Libro(a1, "La colonna di fuoco");
        Libro l2 = new Libro(a1, "I pilastri della terra");

        l1.stampaDatiLibro();
        l2.stampaDatiLibro();

        Libreria nuova = new Libreria();
        // v1
        // nuova.aggiungiLibro(l1);
        // nuova.aggiungiLibro(l2);
        // nuova.stampaLibreria();
        // nuova.rimuoviLibro(l2, 1);
        // nuova.stampaLibreria();
        //
        // // v2
        // nuova.aggiungiLibroPotente();
        // nuova.stampaLibreria();
        // nuova.aggiungiLibroPotente();
        // nuova.stampaLibreria();
        // nuova.aggiungiLibroPotente();
        // nuova.stampaLibreria();
        // nuova.rimuoviLibroPotente();
        // nuova.stampaLibreria();

        Scanner in = new Scanner(System.in);


        boolean esci = false;

        while (!esci) {
            System.out.println("Inserisci 1 se vuoi aggiungere un libro, 2 se vuoi rimuovere un libro, 3 se vuoi stampare la libreria, 4 se vuoi uscire");
            int n = in.nextInt();

            switch (n) {
                case 1 -> nuova.aggiungiLibroPotente();
                case 2 -> nuova.rimuoviLibroPotente();
                case 3 -> nuova.stampaLibreria();
                case 4 -> {
                    System.out.println("Arrivederci");
                    esci = true;
                }
                default -> {
                    System.out.println("Inserisci un numero valido");
                }
            }

        }

    }

}
