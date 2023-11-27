package java__ex100;

import java.util.Scanner;

public class ex100_62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.next();
		String clas = sc.next();
		String num = sc.next();
		
		if(clas.length() <2) {
			clas = "0" + clas;
		}
		if(num.length()<3 & num.length() == 2) {
			num = "0" + num;
		} else if(num.length()<3 & num.length() == 1) {
			num = "00" + num;
		}
		
		System.out.println(grade+clas+num);

	}

}