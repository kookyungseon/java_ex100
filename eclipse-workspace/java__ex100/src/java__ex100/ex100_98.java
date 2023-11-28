package java__ex100;
import java.util.Scanner;

public class ex100_98 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] board = new int[10][10];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("X: ");
           int x = sc.nextInt();

            System.out.print("Y: ");
            int y = sc.nextInt();

            board[x - 1][y - 1] = 1;
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

	}

}