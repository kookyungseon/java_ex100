package java__ex100;

import java.util.Scanner;

public class ex100_61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char op = sc.next().charAt(0);
		int b = sc.nextInt();
	
		int num =0;
		switch (op) {
			case '+' : {
				num = a+b ;
				System.out.println(num);
				break;
			}
			case '-' : {
				num = a-b;
				System.out.println(num);
				
				break;
			}
			case '*' : {
				num=a*b;
				System.out.println(num);
				
				break;
			}
			case '/' : {
				num=a/b;
				System.out.println(num);
				
				break;
			}
		}

	}

}