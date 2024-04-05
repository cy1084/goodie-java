package chap6;

/*
 * 재귀함수: Recursive call-> 함수 내에서 자신의 함수를 호출하는 함수
 * 
 * */
public class FactorialEx1 {

	public static void main(String[] args) {
		System.out.println("4!=" + factorial(4));
		// 만약 아래 함수에서 static을 뺀다면
		// System.out.println("4!="+new FactorialEx1().factorial(4));
		// 이렇게 인스턴스화 해야 함

	}

	private static int factorial(int i) { // static 빼면 인스턴스화 시켜야 하기 때문에 9라인에서 에러남
		return (i == 1) ? 1 : factorial(i - 1) * i;
	}

}
