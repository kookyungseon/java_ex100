package java__ex100;
import java.util.Scanner;

public class ex100_30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		if(num > 0)
			System.out.println("plus");
		else
			System.out.println("minus");
		
		if(num%2== 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}