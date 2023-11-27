package java__ex100;

import java.util.Scanner;

public class ex100_84 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();


        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}