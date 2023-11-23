package java__ex100;
import java.util.Scanner;

public class ex100_43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int num = sc.nextInt();

  
        String korean = readKorean(num);
        System.out.println(korean);
    }

        public static String readKorean(int num) {
        
        String numStr = Integer.toString(num);
       
        int size = numStr.length();
     
        String result = "";

                for (int i = 0; i < size; i++) {
            int idx = size - i;
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

                        if (digit != 0) {
                result += convert(digit, idx);
            }
        }

                return result;
    }

        public static String convert(int digit, int idx) {
        return dig(digit) + unit(idx);
    }

        public static String dig(int digit) {
        switch (digit) {
            case 1:
                return "일";
            case 2:
                return "이";
            case 3:
                return "삼";
            case 4:
                return "사";
            case 5:
                return "오";
            case 6:
                return "육";
            case 7:
                return "칠";
            case 8:
                return "팔";
            case 9:
                return "구";
          
            default:
                return "";
        }
    }

  
    public static String unit(int idx) {
        switch (idx) {
            case 1:
                return "";
            case 2:
                return "십";
            case 3:
                return "백";
            case 4:
                return "천";
            
            default:
                return "만";
        }
    }
}


