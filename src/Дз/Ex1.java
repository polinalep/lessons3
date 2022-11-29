package Дз;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        int n;
        int t;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 0; i < n; i++){

        }
            t = a + b;
            a = b;
            b = t;
            System.out.print(t + " ");

    }



}