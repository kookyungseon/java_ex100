package java__ex100;
import java.util.Scanner;

public class ex100_39 {
	public static void main(String args []) {
	
      
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min=0;

		min = a;
		if ( a < b ) {
			if ( a < c ) {
				min = a;
			} else {
				min = c;
			}
		}
		if ( b < a ) {
			if ( b < c ) {
				min = b;
			} else {
				min = c;
			}
		}
			System.out.println(min);
	}
}