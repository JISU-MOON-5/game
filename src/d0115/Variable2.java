package d0115;

import java.util.Random;
import java.util.Scanner;

public class Variable2 {
	int i;
	String str;
	
	public static void main(String[] args) {
		
		String str = new String("adf");
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Variable2 v= new Variable2();
		System.out.println(v.i); // 초기화 안 했기 때문에 0 , 밑에는 null
		System.out.println(v.str);
	}

}
