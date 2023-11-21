package java__ex100;
import java.util.Scanner;

public class ex100_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a%2==0) System.out.println("even");
		else if(a%2 == 1)
		System.out.println("odd");
	
		if(b%2 == 0)
			System.out.println("even");
		else if(b%2 == 1)
			System.out.println("odd");
		
		if(c%2 == 0)
			System.out.println("even");
		else if(c%2 == 1)
			System.out.println("odd");

	}

}
