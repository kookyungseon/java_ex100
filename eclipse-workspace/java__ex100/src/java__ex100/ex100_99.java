package java__ex100;
import java.util.Scanner;

public class ex100_99 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int score = sc.nextInt();
	        printScore(score);
	  }
	        static void printScore(int score) {
    
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else if (score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("E학점");
        }
    }
	  }


     

   

    
