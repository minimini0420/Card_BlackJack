package ch7;
class Tv {
	boolean power;    // 전원상태(on/off)
	int channel;      // 채널
	
	Tv() {
//		System.out.println("Constructor Tv");
	}
	
	Tv(boolean power) {
//		System.out.println("Constructor Tv (power)");
		this.power = power;
	}
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}

class CaptionTv extends Tv {
	boolean caption;
	
	CaptionTv() {
		super();                 // 부모 클래스에서 다른 생성자를 선택하고 싶을때 super를 사용하여 다른 생성자를 불러오게 만든다.
//		System.out.println("Constructor CaptionTv");
	}
	void displayCaption(String text) {
		if (caption) { // 캡션상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class p315_CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello World");
		ctv.caption = true;  // 캡션 기능을 켠다.
		ctv.displayCaption("Hello World");
	}
}
