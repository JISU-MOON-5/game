package d0120;

public class Method {
	
	static int i = 1; //
	
	void test() {
		System.out.println(i); //같은 non static(or static)영역에서 사용 가능 // 5번 라인 i
		int i=2; //변수명 i 사용 가능
		System.out.println(i); // 9번 라인 i
	}
	int i() { //데이터 타입은 달라도 method i이기 때문에 사용 가능
		// int test(int i) 가능
		return 1;
	}
}
