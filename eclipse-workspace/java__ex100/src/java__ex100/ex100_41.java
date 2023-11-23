package java__ex100;

import java.util.Scanner;
public class ex100_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=30 && a<=40 || a>=60 && a<=70){
            System.out.println("win");
        
        }else{
            System.out.println("lose");
        }



    }
}