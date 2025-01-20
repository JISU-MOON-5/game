package d0120;

public class Constructor {
	//public Constructor() {}  컴파일할때 자동 생성됨
	
	public  Constructor() {
		System.out.println("어? 내 메모리를 생성했구나~"); //메모리를 생성할 때 실행됨(그래서 총 2번 생성될 것)
	}
	public static void main(String[] args) {
		Constructor c = new Constructor(); //메모리 생성1
		c = new Constructor(); //메모리 생성2
	}

}
