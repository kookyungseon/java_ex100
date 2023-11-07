package java__ex100;

import java.util.Scanner;
public class ex100_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();    
        double avg = (a+b+c)/3f;
        System.out.printf("%d\n%.1f", a+b+c, avg);
    } 
}
