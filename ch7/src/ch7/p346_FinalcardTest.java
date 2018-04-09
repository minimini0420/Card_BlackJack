package ch7;

class Card4 {
	final int NUMBER;          // 상수지만 선언과 함께 초기화 하지 않고
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card4(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	Card4() {
		this("HEART", 1);
	}
//	@Override -> 오버라이딩을 했으면 써 줘야한다.
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class p346_FinalcardTest {
	public static void main(String args[]) {
		Card4 c = new Card4("HEART", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}
}
