//Scrivi un programma Java che abbia un metodo che prenda due stringhe
// e le compari lessico-graficamente.
//Il metodo dovrà restituire "Le due stringhe sono uguali" o
// "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

public class Main {
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder("hello world");
        StringBuilder test2 = new StringBuilder("hello world");

        if (test.compareTo(test2) == 0) {
            System.out.println("Le due stringe sono uguali.");
        }else{
            System.out.println("Le due stringhe sono differenti.");
        }
    }
}