package d0108;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100)+1; //1~100까지의 난수(컴은 0부터 읽으니까 1부터 표기하려면 +1을 꼭 해주기!)
		System.out.println(num);
	}

}
