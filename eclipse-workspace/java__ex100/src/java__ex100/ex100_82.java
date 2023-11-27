package java__ex100;

import java.util.Scanner;

public class ex100_82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}

