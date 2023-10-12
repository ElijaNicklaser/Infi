package at.EN.Struktur;

public class Aufgabe5Loop {

    public static void main(String[] args) {

        int zahl = 1000;
        int summe = 0;

        for (int i = 1; i < zahl/4; i++) {
            summe = summe + 1000;
        }
        summe = summe + 500;
        System.out.println(summe);
    }
}
