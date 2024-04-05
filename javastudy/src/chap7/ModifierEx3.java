package chap7;

import chap7.test.Modifier2;

class Modifier3 extends Modifier2 { // 접근제한자 default
	public void method() {
		System.out.println("chap7.Modifier3.method");
		// System.out.println("v1="+v1); private 상속x
		// System.out.println("v2="+v2); default 상속x
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}
}

public class ModifierEx3 {

	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		m2.method();

		Modifier3 m3 = new Modifier3();
		m3.method();

	}

}
