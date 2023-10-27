package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Podaj liczbę");
            a = scanner.nextInt();
            if (a < 100) {
                System.out.println("Twoja licza jest za mała");
            } else if (a > 200) {
                System.out.println("Twoja liczba jest za duża");
            } else if (a % 3 != 0) {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            } else if (a % 3 == 0) {
                System.out.println("Twoja liczba jest ok");
            }
        } while (a % 3 != 0 || (a < 100) || a > 200);
    }
}
