package chap2;

public class VarEx2 {

	public static void main(String[] args) {
		System.out.println("홍길동\n김삿갓");
		System.out.println("홍길동\t김삿갓");
		System.out.println("홍길동이 말했습니다 \"안녕\"");
		char ch = '\'';
		System.out.println(ch);

		String s = "D:\\20240318\\setup\\jdk-17";
		System.out.println(s);
		System.out.println("D:\\20240318\\setup\\jdk-17");

		ch = '\u0041';

		System.out.println(ch); // A
		char g = ' ';
		System.out.println(g);
		String h = "";
		System.out.println(h);
		String h1 = " 1";
		System.out.println(h1);

		byte var1 = 127;
		short var2 = 128;
		System.out.println(var1);
		System.out.println(var2);
	}

}
