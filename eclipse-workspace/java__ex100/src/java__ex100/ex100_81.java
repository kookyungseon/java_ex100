package java__ex100;

import java.util.Scanner;

public class ex100_81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int arr[] = {a,b,c,d,e};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println( max);
		System.out.println( min);

	}

}