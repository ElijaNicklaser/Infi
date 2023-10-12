package at.EN.Struktur;

import java.util.Random;

public class Augabe6While {

    public static void main(String[] args) {

        Random random = new Random();
        boolean isFinished = false;
        int summe = 0;

        while (!isFinished) {
            int randomNumber = random.nextInt(10, 30);
            summe = summe + randomNumber;

            if ((randomNumber == 15)||(randomNumber == 25)) {
            isFinished = true;
            }
        }
        System.out.println(summe);
        System.out.println("Finished");

    }
}
