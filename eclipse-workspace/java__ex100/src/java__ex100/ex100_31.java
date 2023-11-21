package java__ex100;
import java.util.Scanner;

public class ex100_31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		if(num >= 90 && num <= 100)
			System.out.println("A");
		else if(num >= 70 && num <= 89)
			System.out.println("B");
		else if(num >= 40 && num <= 69)
			System.out.println("C");
		else if(num >= 0 && num <= 39)
			System.out.println("D");
			
	}
}