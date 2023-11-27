package java__ex100;
import java.util.Scanner;

public class ex100_66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int s = 0;
		
		for(int i = 0; i <= a; i++) {
			s += i;
			if(s >= a) {
				break;
				
			}
		}
		System.out.println(s);

	}

}