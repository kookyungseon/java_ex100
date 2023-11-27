package java__ex100;
import java.util.Scanner;

public class ex100_79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			if((int)b[i] > 96 &&(int)b[i] < 123)b[i]-=32;
			else if((int)b[i] > 64 &&(int)b[i] < 91)b[i]+=32;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		}
	}