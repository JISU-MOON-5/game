package d0103;

public class DataType2 {
	
	public static void main(String[] args) {
		int i = 1;
		byte b = (byte)i;
		i = b; // i=(int)b; 와 같다
		
		String str1 = i + "";
		System.out.println(str1);
		
		i = Integer.parseInt(str1);
		System.out.println(i);
	}

}
