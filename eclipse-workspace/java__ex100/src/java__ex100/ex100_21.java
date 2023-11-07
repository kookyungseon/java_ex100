package java__ex100;

import java.util.Scanner;

public class ex100_21 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
     
      
    
        int a = scanner.nextInt();

        if (a < 0 || a > 10) {
            System.out.println("a는 0 이상 10 이하의 값이어야 합니다.");
          
        }

     
        int b = scanner.nextInt();

       
        if (b < 0 || b > 10) {
            System.out.println("b는 0 이상 10 이하의 값이어야 합니다.");
       
        }

        int result = a * (int) Math.pow(2, b);
        System.out.println(result);

        scanner.close();
    }
}