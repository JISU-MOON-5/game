package d0113;

import java.util.Random;

public class Array3 {
	
	public static void main(String[] args) {
		String[] strs = new String[3];
		//1~5까지의 난수를 strs에 대입하시오
		Random r = new Random();
		for(int i=0;i<strs.length;i++) {
		strs[i] = r.nextInt(5)+1 + "";
	} 
  }
}