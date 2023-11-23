package java__ex100;
import java.util.Scanner;

public class ex100_48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String birth = sc.nextLine();
		int gen = sc.nextInt();
		int year=0;
		if(birth.substring(0, 1) == "0") {
			year = Integer.parseInt(birth.substring(1, 2));
		}else {
			year = Integer.parseInt(birth.substring(0, 2));
		}
	
		int age = 0;
		int nowyear = 2012;
		
		if(gen == 1 || gen == 2 ) {
			year += 1900;
			age = nowyear - year + 1;
		} else {
			year += 2000;
			if(year < nowyear) {
				age = nowyear - year + 1;
			} else {
				age = year - nowyear + 1;
			}
		}
		
		System.out.println(age);

	}

}