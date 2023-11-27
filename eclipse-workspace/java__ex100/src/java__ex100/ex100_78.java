package java__ex100;

import java.util.Scanner;

public class ex100_78 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        int a=sc.nextInt();
        String cal = sc.next();
        int b = sc.nextInt();
        String cal2 = sc.next();
        int c =sc.nextInt();

        int result=0;

        switch (cal){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
        }
        
        
        switch (cal2){
        case "+":
            result+=c;
            break;
        case "-":
            result-=c;
            break;
        case "*":
            result*=c;
            break;
        case "/":
            result/=c;
            break;

    }
        System.out.println(result);
    
}
}

//3+3-3까지만, 3+3-3*3/3=3은 추후에 수정 