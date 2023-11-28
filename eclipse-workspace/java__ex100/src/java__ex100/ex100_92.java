package java__ex100;

import java.util.Scanner;

public class ex100_92 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[11];

        System.out.println();
        for (int i = 1; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }
        
        try {
			Thread.sleep(3000);
			
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

        

        int kNum = sc.nextInt();

        System.out.print("k번째 숫자는 ? : " + intArr[kNum]);

    }
}