package УК;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String S;
        Scanner S1 = new Scanner(System.in);
        System.out.println("введите номер месяца:");
        S = S1.nextLine();
        int A = Integer.parseInt(S.trim());
        if ((A == 12)||(A == 1)||(A == 2)) {
            System.out.println("зима");

        }
        else
        if ((A == 3)||(A == 4)||(A == 5)) {
            System.out.println("весна");

        }
        else
        if ((A == 6)||(A == 7)||(A == 8)) {
            System.out.println("лето");

        }
        else
        if ((A == 9)||(A == 10)||(A == 11)) {
            System.out.println("осень");

        }
        else {
            System.out.println("такого месяца не существует");
        }
    }
}
