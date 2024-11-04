import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {
        // Der Computer denkt sich ein zufällige Zahl im Bereich 1 bis 100 aus:
        int z = new Random().nextInt(100) + 1;
        System.out.println("Errate eine Zahl zwischen 1 und 100");

        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int g = 0;
        int a = 0;

        while (g == 0) {
            if (e == z) {
                System.out.println("Richtig");
                g = 1;
                System.out.println("Du hast " + a + " Versuche gebraucht");
                scanner.nextLine();
            } else if (z > e) {
                System.out.println("Ihre Zahl ist zu klein");
                e = scanner.nextInt();
            } else if (z < e) {
                System.out.println("Ihre Zahl ist zu groß");
                e = scanner.nextInt();
            }
            a++;
            System.out.println("Bitte versuchen Sie es erneut");
        }

        scanner.close();
    }
}