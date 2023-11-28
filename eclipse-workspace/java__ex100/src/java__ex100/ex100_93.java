package java__ex100;

import java.util.Scanner;

public class ex100_93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[7];
		
		String tmp = sc.nextLine();
		arr = tmp.split(" ");

		try {
			Thread.sleep(5000);
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			
		}catch(Exception e) { }
		
		int num = sc.nextInt();
		String guess = sc.next();
		System.out.printf(arr[num-1]);
		
	}

}