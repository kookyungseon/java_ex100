package java__ex100;
import java.util.Scanner;

public class ex100_72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		int max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}