package java__ex100;

import java.util.Scanner;

public class ex100_95{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String s= sc.nextLine();
        
        
        for(int i=0; i<26; i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == i+97){
                    arr[i]++;
                }
            }
            System.out.println((char)(i+97)+":"+arr[i]);
        }
    }
}