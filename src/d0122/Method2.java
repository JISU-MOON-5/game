package d0122;

public class Method2 {
		
	int add(int n1, int n2) {
		return n1+n2;
	}
	void add() {
		
	}
	String add(String s, int n) {
		return s+ n;
	}
		
	public static void main(String[] args) {
		Method2 m = new Method2();
		int sum = m.add(0, 0); //6라인 호출
		m.add(); //8라인 호출 but,void라는 데이터타입은 없어서 값은 없음.
		String str = m.add("1",1); //11라인 호출
		System.out.println(str); // == System.out.println(m.add("1",1));
	}

}
