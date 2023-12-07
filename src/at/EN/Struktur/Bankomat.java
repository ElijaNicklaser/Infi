package at.EN.Struktur;
import java.util.Random;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double Kontostand = 0;
        int selection =0;
        double e =0;
        double a =0;


        while (selection != 4) {
            System.out.println("Um folgende Aktionen auszuführen drücken sie bitte eine der folgenden Zahlen:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Wie viel möchtest du einzahlen?");
                    e = scanner.nextDouble();

                    if (e <= 0) {
                        System.out.println("Zahl wird nicht akzeptiert! Gib deine Aktion erneut ein");
                    } else {
                        Kontostand = ++e;
                        System.out.println("Dein Geld ist eingezahlt.");
                        break;
                    }

                case 2:
                    System.out.println("Wie viel möchtest du abheben?");
                    a = scanner.nextDouble();

                    if (e <= 0) {
                        System.out.println("Zahl wird nicht akzeptiert! Gib deine Aktion erneut ein");
                    } else {
                        Kontostand = --a;
                        System.out.println("Dein Geld wird ausgezahlt.");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Das ist dein Kontostand");
                    System.out.println(e);
                    break;
            }
        }
        System.out.println("Programm wird beendet");
        System.exit(0);

    }

}


