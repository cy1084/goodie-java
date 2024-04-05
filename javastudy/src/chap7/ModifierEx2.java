package chap7;

import chap7.test.Modifier2;

public class ModifierEx2 {
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		// m2.v1=10;
		// m2.v2=20;
		// m2.v3=30;
		m2.v4 = 40; // 얘만 가능- public
		m2.method(); // public

	}

}
