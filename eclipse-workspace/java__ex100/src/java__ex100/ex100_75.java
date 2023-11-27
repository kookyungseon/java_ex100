package java__ex100;
import java.util.Scanner;

public class ex100_75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				result = 1;
				
			}	
		}
		if(result == 0) {
			System.out.print("prime");
		} else {
			System.out.println("not prime");
		}
		

	}

}