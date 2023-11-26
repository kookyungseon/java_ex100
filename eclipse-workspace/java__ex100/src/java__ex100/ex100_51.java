package java__ex100;

import java.util.Scanner;
public class ex100_51 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num / 10;
        int num2 = num % 10 * 10;   
        int result = (num2 + num1) * 2;
        if(result >= 100) {
        	result -= 100;
        }
        System.out.println(result);
        if(result <= 50) System.out.println("GOOD");
        else System.out.println("OH MY GOD");
	}
}