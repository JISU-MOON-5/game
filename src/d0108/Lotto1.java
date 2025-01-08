package d0108;

import java.util.Random;

public class Lotto1 {
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] nums = new int[6];
		
		//Array1을 참고해서 1~45까지의 난수를 nums의 각 방에 대입
				//출력하는 for문을 만들어라
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(45)+1;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		
     	}
	}
}
