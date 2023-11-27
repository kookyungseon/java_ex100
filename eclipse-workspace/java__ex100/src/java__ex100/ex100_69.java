package java__ex100;
import java.util.Scanner;

public class ex100_69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int sum = a;
		
		for(int i = 2; i <= n; i++) {
			sum += d;
		}
		
		System.out.println(sum);

	}

}
