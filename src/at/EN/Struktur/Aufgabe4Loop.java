package at.EN.Struktur;

public class Aufgabe4Loop {

    public static void main(String[] args) {

        int summe = 0;

        for (int i = 1; i <= 100; i++) {
            summe = summe + i;
            System.out.println(summe);
        }
        System.out.println(summe);
    }
}
