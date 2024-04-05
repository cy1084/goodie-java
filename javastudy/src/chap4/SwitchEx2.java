package chap4;

public class SwitchEx2 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10) + 1; // 1~10
		/*
		 * Math.random():x
		 * 0 <= x < 1.0 임의의 실수값 리턴
		 * 0 <= x*10 < 10.0 :0~0.9999999
		 * 0 <= (int)x*10 < 10 : 0~9 사이의 임의의 정수
		 * 1 <= (int)(x*10)+1 <= 10 : 1~10 사이의 임의의 정수
		 * 
		 * */
		System.out.println(num + ":");

		switch (num) {
		case 1:
			System.out.println("자전거 당첨");
			break;
		case 2:
			System.out.println("usb 당첨");
			break;
		case 3:
			System.out.println("마우스 당첨");
			break;
		default:
			System.out.println("다음 기회");
			break;
		}

	}

}
