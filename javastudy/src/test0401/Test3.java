package test0401;

//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기
interface Beta {
}

class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}

class Gamma implements Beta {
	String testIt() {
		return "Gamma";
	}
}

public class Test3 {
	static Beta getIt() {
		return new Alpha();
	}

	public static void main(String[] args) {
		Beta b = getIt();
		//Beta b=new Alpha();
		//System.out.println(b.testIt());
		System.out.println(new Alpha().testIt());
		System.out.println(((Alpha)b).testIt());
	}
}
