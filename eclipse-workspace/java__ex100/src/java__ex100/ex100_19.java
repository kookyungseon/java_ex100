package java__ex100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex100_19 {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
	
		try {
			String num = br.readLine();
			int intNum = Integer.parseInt(num);
			byte byteNum = (byte)intNum;
			char ascii = (char)(byteNum & 0xff);
			
			
			bw.write(String.valueOf(ascii));
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
