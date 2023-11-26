package java__ex100;

import java.util.Random;
import java.util.Scanner;

public class ex100_60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        if(170<a){
            if (170<b) {
                if (170<c) {
                    System.out.println("PASS");
                }else {
                    System.out.println("CRASH "+c);
                }
            }else {
                System.out.println("CRASH "+b);
            }
        } else {
            System.out.println("CRASH "+a);
        }

    }
}