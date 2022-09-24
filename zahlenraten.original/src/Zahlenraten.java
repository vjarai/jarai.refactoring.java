import javax.swing.*;
import java.util.Random;

public class Zahlenraten
{
    public static void main(String[] args) {

        //Der Computer denkt sich ein zufällige Zahl im Bereich 1 bis 100 aus: int geheimzahl = new Random().Next(1, 101);
        int z =1 +  new Random().nextInt() % 100 ;
        System.out.println("Errate eine Zahl zwischen 1 und 100");
        //Nachdem der Anwender einen Tipp eingegeben hat, antwortet der Computer, ob der Tipp "Zu klein.", "Zu groß." oder "Richtig!" war.
        int e = Integer.parseInt(JOptionPane.showInputDialog(String.format("Bitte Tip eingeben")));
        int g = 0;
        int a = 0;
        while (g == 0)
        {

            if (e == z) { System.out.println("Richtig"); g = 1; JOptionPane.showInputDialog("du hast" + a + "Versuche gebraucht"); }
            else if (z > e) {  e = Integer.parseInt(JOptionPane.showInputDialog("Ihre Zahl ist zu klein")); }
            else if (z < e) {e = Integer.parseInt(JOptionPane.showInputDialog("Ihre Zahl ist zu gross")); }
            a++;
        }

    }
    //Der Anwender muss so lange einen Tipp eingeben, bis er die richtige Zahl erraten hat.
    //Der Computer zeigt am Ende an, wieviele Versuche der Anwender benötigt hat

}
