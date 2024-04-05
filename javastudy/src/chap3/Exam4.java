package chap3;

public class Exam4 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		char ch = 'A';
		ch += 2;
		float f = (float) (3.0 / 2.0);
		// float f=3f/2;
		long l = (long) 3000 * 3000 * 3000;
		// long l = 3000L * 3000 * 3000;
		float f2 = (float) 0.1;
		// float f2=0.1f;
		double d = (float) 0.1;
		boolean result = d == f2;
		System.out.println("c= " + c); // c=30
		System.out.println("ch= " + ch); // ch=C
		System.out.println("f= " + f); // f=1.5
		System.out.println("l= " + l); // 27000000000
		System.out.println("result= " + result); // true
	}

}
