package java__ex100;

import java.util.Scanner;

public class ex100_57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int a= sc.nextInt();
        int b= sc.nextInt();



        int sum=0;

        switch (a){
            case 1:
                sum+=400;
                break;
            case 2:
                sum+=340;
                break;
            case 3:
                sum+=170;
                break;
            case 4:
                sum+=100;
                break;
            case 5:
                sum+=70;
                break;
            default:
                break;
        }
        switch (b){
            case 1:
                sum+=400;
                break;
            case 2:
                sum+=340;
                break;
            case 3:
                sum+=170;
                break;
            case 4:
                sum+=100;
                break;
            case 5:
                sum+=70;
                break;
            default:
                break;
        }

        if(sum>500){
            System.out.println("angry");
        }else {
            System.out.println("no angry");
        }

    }
}