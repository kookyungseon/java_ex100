package java__ex100;
import java.util.Scanner;

public class ex100_77 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int result=1;

        if(n>0 && n<=12){
            for(int i=n; i>0; i--){
                result=result*i;
            }
            System.out.println(result);
        }
    }
}