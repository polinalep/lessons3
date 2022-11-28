package УК;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        String S;
        Scanner S1 = new Scanner(System.in);
        System.out.println("введите номер месяца:");
        S = S1.nextLine();
        int A = Integer.parseInt(S.trim());
        switch (A)
        {
            case 12,1,2:
                System.out.println("зима");
                break;
            case 3,4,5:
                System.out.println("весна");
                break;
            case 6,7,8:
                System.out.println("лето");
                break;
            case 9,10,11:
                System.out.println("осень");
                break;
            default:
                System.out.println("такого месяца не существует");
                break;

        }

    }
}
