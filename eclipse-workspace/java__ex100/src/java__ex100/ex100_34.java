package java__ex100;
import java.util.Scanner;
import java.util.ArrayList;

public class ex100_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true) {
            int a = scan.nextInt();
            list.add(a);
            if (a == 0) {
                for(int i=0; i< list.size();i++) {
                     System.out.println(list.get(i));
                }
                break;
            }

        }

    }
}