package java__ex100;

import java.util.Scanner;

public class ex100_56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();

        int sum=a+b+c+d;

        switch (sum){
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
            default:
                break;
        }


    }
}