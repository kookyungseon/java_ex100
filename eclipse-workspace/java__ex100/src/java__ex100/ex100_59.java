package java__ex100;


import java.util.Scanner;

public class ex100_59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] lottoNum = new int[7];
        for (int i = 0; i < 7; i++) {
            lottoNum[i] = sc.nextInt();
        }

       
        int[] inputNum = new int[6];
        for (int i = 0; i < 6; i++) {
            inputNum[i] = sc.nextInt();
        }

        int sameNum =0 ;

        if (sameNum == 0) {
            System.out.println("0 꽝!");
        } else {
            switch (sameNum) {
                case 6: {
                    System.out.println("1등");
                    break;
                }
                case 8: {
                    System.out.println("2등");
                    break;
                }
                case 5: {
                    System.out.println("3등");
                    break;
                }
                case 4: {
                    System.out.println("4등");
                    break;
                }
                case 3: {
                    System.out.println("5등");
                    break;
                }
                default: {
                    System.out.println("꽝");
                    break;
                }
            }
        }

     
     
        }

    }


    



