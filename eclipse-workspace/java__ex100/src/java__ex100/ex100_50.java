package java__ex100;
import java.util.Scanner;

public class ex100_50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bmi = sc.nextInt();
		
		if(bmi > 23) {
			System.out.println("과체중");
		} else if( bmi >=18.5 && bmi<=23) {
			System.out.println("정상체중");
		}else {
			System.out.println("저체");
		}

	}

}