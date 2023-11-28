package java__ex100;

import java.util.Scanner;

public class ex100_94 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String str = sc.nextLine();
		String strArr[] = str.split("");
		int left = 0;
		int right = 0;
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].charAt(0) == '(') {
				left++;
			} else {
				right++;
			}
		}
		
		System.out.printf("%d %d\n", left, right);

	}

}