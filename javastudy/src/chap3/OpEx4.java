package chap3;

public class OpEx4 {

	// 관계(비교)연산자-> 결과 무조건 boolean
	public static void main(String[] args) {
		String str = null;
		if (str == null || str.equals("")) { // 앞에서 이미 걸러지기 때문에 에러 안남(순서 중요)
			System.out.println("str 변수에 값 없음");
		}
		if (str.equals("") || str == null) { // 값이 없는데 왜 비교를 해-> 에러
			System.out.println("str 변수에 값 없음");
		}

	}

}
