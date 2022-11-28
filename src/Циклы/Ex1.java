package Циклы;

public class Ex1 {
    public static void main(String[] args){
        int i;
        int a = 1;
        for (i = 1; i <= 99; i++){
            if ( a % 2 == 1 ){
                System.out.print(a+" ");
            }
            a++;
        }
    }
}
