import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
gps observable = new gps();
   observer o1 = new displayResume();
   observer o2 = new displayAll();

   observable.addObserver(o1);
   observable.addObserver(o2);

        observable.setMesure(10, "High Precision");

        // Keep the program running until the user decides to exit



    }
}