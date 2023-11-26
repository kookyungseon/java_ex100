package java__ex100;

import java.util.Scanner;

public class ex100_53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        float a= sc.nextFloat();
        float b= sc.nextFloat();

        float Addnum = a+b;
        float Minnum = a-b;
        float Mullnum = a*b;
        float Divnum = a/b;
        float max = 0;

        if(Addnum>=max){
            max = Addnum;
        } else if (Minnum>=max) {
            max = Minnum;
        } else if (Mullnum>=max) {
            max = Mullnum;
        }else if(Divnum>=max){
            max = Divnum;
        }

        System.out.printf("%f", max);


    }
}