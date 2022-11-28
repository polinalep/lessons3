package УК;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int a = s.nextInt();
        if (a > -5) {
            System.out.println("тепло");
        }
        else if (a <= -20)
            System.out.println("холодно");
        else{
         System.out.println("нормально");
        }
    }

}
