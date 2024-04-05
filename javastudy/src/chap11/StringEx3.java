package chap11;

/*
 * String-> 한번 만들어진 값은 변경x 
 * 변경 값을 다시 대입해야 변경 가능
 */

public class StringEx3 {

	public static void main(String[] args) {
		String str="ABC123";
		System.out.println("main: "+str); //ABC123
		//change(str);
		str=change(str); //변경 값을 다시 str에 대입
		System.out.println("change 후: "+ str); //ABC123 - 1번함수로 하면 변경x

	}
/* 1번 함수
	private static void change(String str) {
		str += "456";
		System.out.println("change: "+str); //ABC123456
		
	}
*/
	//2번 함수로 해야 메인에서도 변경 가능
	private static String change(String str) {
		str += "456";
		System.out.println("change: "+str); //ABC123456
		return str;
		
	}

}
