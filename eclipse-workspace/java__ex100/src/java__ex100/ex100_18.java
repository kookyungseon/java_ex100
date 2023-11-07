package java__ex100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex100_18 {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			char alphabet = br.readLine().charAt(0);
			// 아스키코드로 변환하기 위해선 문자열이아니라 문자로 받아야합니다.
			int ascii = (int)alphabet;
			// 형변환을 하면 문자는 자동으로 아스키코드로 받아옵니다.
			
			bw.write(Integer.toString(ascii));
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}