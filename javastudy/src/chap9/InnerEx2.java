package chap9;
/*
	내부 클래스에서 외부 클래스의 private 멤버에 접근
 */

class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;

	class InstanceInner {
		int iiv = outeriv; // 내부 클래스에서 외부 클래스의 private 멤버에 접근
		int iiv2 = outercv;

		/*
		 * 지역내부클래스의 멤버 메소드에서 외부메소드 method(int pv)의 지역변수는 상수화 되어야 접근 가능(변경x) 외부 메소드의
		 * 지역변수가 변경이 없으면 상수로 판단 외부 메소드의 지역변수가 변경이 있으면 내부클래스의 멤버메소드에서 오류 발생
		 */
	}

	static class StaticInner {
		// static int siv=outeriv; 에러 static 변수와 static이 아닌 변수끼리 만남- 객체화 필요
		static int siv = new Outer2().outeriv;
		int siv2 = outercv;
	}

	void method(int pv) {
		class LocalInner { // 지역 내부 클래스
			int liv = outeriv;
			int liv2 = outercv;

			void method(int num) {
				num++;
				System.out.println("outeriv= " + outeriv);
				System.out.println("outercv= " + outercv);
				System.out.println("liv= " + liv);
				System.out.println("liv2= " + liv2);

				// pv++; 에러- 상수화 필요
				System.out.println("pv= " + pv);
				System.out.println("num= " + num);
			}
		}

		LocalInner li = new LocalInner();
		li.method(3);
	}
}

public class InnerEx2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		// System.out.println(out.outeriv); //private 멤버 InnerEx2 클래스에서 접근 불가
		// System.out.println(Outer2.outercv);

		// InstanceInner, StaticInner 객체 생성하여 모든 멤버값 출력
		Outer2.InstanceInner ii = out.new InstanceInner();
		Outer2.StaticInner si = new Outer2.StaticInner();

		System.out.println(ii.iiv);
		System.out.println(ii.iiv2);
		System.out.println(si.siv);
		System.out.println(si.siv2);

		out.method(100);
		int lv = 100;
		// lv++; 에러- 매부클래스 객체 상수화 필요
		Runnable r = () -> {
			System.out.println(lv);
		};
		r.run();

	}

}
