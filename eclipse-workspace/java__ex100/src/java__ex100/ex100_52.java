package java__ex100;
import java.util.Scanner;

public class ex100_52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        if(num>=1 && num<=99){
            switch(num%10){
                case 1:
                    if(num/10==1) System.out.printf("%dth", num);              // 11, 12, 13은 th로 출력한다.
                    else System.out.printf("%dst", num);
                    break;
                case 2:
                    if(num/10==1) System.out.printf("%dth", num);
                    else System.out.printf("%dnd", num);
                    break;
                case 3:
                    if(num/10==1) System.out.printf("%dth", num);
                    else System.out.printf("%drd", num);
                    break;
                default:
                    System.out.printf("%dth", num);
            }
        }


    }
}