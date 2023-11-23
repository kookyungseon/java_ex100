package java__ex100;

import java.util.Scanner;
import java.math.*;

public class ex100_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d=b*b-4*a*c;
		
		float x,y;
		x = (-b +(float) Math.sqrt(d))/ 2*a;
		y = (-b -(float)Math.sqrt(d))/2*a;
		if(d==0) {
			
			System.out.printf("방정식의 해는 %.2f", x);
		
		}else if (d<0) {
			System.out.printf("실근이 없습니다.");
			
		}else {
			System.out.printf("방정식의 해는 %.2f \n방정식의 해는 %.2f ",x,y);
		}
	}

}
