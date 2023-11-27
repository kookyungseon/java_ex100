package java__ex100;
import java.util.Scanner;

public class ex100_71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int c = 0;
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			c = c + a[i];
		}
		System.out.println(c);
	}
}