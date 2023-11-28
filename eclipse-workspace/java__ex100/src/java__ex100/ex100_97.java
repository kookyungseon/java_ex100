package java__ex100;
import java.util.Scanner;

public class ex100_97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int b = sc.nextInt();
        int[] a = new int[s];
        int temp =0;
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] < a[j]) {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 1; i <= s; i++) {
            System.out.print(a[i-1]+" ");
            if(i%b == 0) {
                System.out.println();
            }
        }
      
    }
}