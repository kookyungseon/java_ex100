package java__ex100;
import java.util.Scanner;

public class ex100_49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min>=30) {
			min = min-30;
		}else {
			
		if(hour>0) {
			hour =hour-1;
			min= min-30+60;
		}else {
			hour =23;
			min= min-30+60;
		}
		
		}
		
		System.out.printf("%d %d\n", hour, min);

	}

}