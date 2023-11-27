package java__ex100;


import java.util.Scanner;

public class ex100_80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String[] originalAlphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                                      "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] shiftedAlphabet = {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                                     "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"};

        String result = "";

        for (char c : inputString.toCharArray()) {
            String currentChar = String.valueOf(c).toUpperCase();

            int index = -1;

            for (int i = 0; i < originalAlphabet.length; i++) {
                if (originalAlphabet[i].equals(currentChar)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                result += shiftedAlphabet[index].toLowerCase();
            } else {
                result += currentChar;
            }
        }

        System.out.println(result);
    }
}


