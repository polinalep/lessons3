package УК;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int t;
        Scanner k = new Scanner(System.in);
        System.out.println("Введите число:");
        t = k.nextInt();
        if (t % 2 == 0) {
            System.out.println("чётное число");
        }
        else {
            System.out.println("нечётное число");
        }
    }
}
