package Циклы;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = s.nextInt();
        int t = 0;
            for (int i = 1; i<= x;i++){
                t+=i;
            }
        System.out.print("сумма: " +t);


    }
}
