package java__ex100;
import java.util.Scanner;

public class ex100_90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 9; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+ "");
            
        }
        System.out.println();
    }
}
