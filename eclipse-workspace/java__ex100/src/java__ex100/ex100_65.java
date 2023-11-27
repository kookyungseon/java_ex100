package java__ex100;
import java.util.Scanner;

public class ex100_65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			char tmp = Integer.toString(i).charAt(Integer.toString(i).length()-1);
			if(tmp =='3' || tmp == '6' || tmp == '9') {
				System.out.printf("%c ", 'X');
			} else {
				System.out.printf("%d ", i);
			}
			
		}

	}

}
