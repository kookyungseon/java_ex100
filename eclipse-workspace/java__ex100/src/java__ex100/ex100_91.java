package java__ex100;
import java.util.Scanner;

public class ex100_91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) 
		arr[i] = sc.nextInt();

		

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int k = 0; k < n-1; k++) {
			for(int i = 0; i < 1; i++) {
				int tmp = arr[0];
				for(int j = 0; j < arr.length -1; j++) {
					arr[j] = arr[j+1];
				}
				arr[ arr.length -1] = tmp;
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
				
			}
			System.out.println();
		}
		
		

	}

}