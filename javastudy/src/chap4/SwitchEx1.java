package chap4;

public class SwitchEx1 {

	public static void main(String[] args) {
		int score = 100;
		String result = null;
		switch (score / 10) {
		case 10: // 100점인 경우
		case 9:
			result = "A학점";
			break;
		case 8:
			result = "B학점";
			break;
		default:
			result = "F학점";
			break;
		}
		System.out.println(score + ":" + result);

		// 60점 이상이면 pass, 아니면 fail
		switch (score / 10) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:
			result = "pass";
			break;
		default:
			result = "fail";
			break;
		}
		System.out.println(score + ":" + result);
	}

}
