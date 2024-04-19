package chap9;

/*
 * 내부클래스 객체에서 사용되는 this
 */

class Pouter{
	int iv=0;
}
class Outer3 extends Pouter{
	int iv=10;
	int iv2=20;
	
	class InstanceInner{ //부모클래스는 Pouter가 아닌 Object
		int iv=100;
		void method() {
			int iv=300;
			/*
			 * 변수 접근 우선순위
			 * 1. 지역변수
			 * 2. 내부클래스의 멤버변수
			 * 3. 외부클래스의 멤버변수
			 * 4. 외부클래스의 부모클래스의 멤버변수
			 */
			
			System.out.println("iv= "+iv);
			System.out.println("iv2= "+iv2);
			System.out.println("this.iv= "+this.iv);
			
			/*
			 * this
			 * - InstanceInner 내부 클래스의 객체를 참조하는 참조변수/ 외부 클래스의 멤버 접근 불가
			 */
			
			
			//System.out.println("super.iv= "+super.iv); //Object엔 iv 변수 없으므로 에러
			
			//System.out.println("this.iv2= "+this.iv2);
			//외부 클래스 멤버인 iv2 변수는 this로 접근 불가
			
			System.out.println("Outer3.this.iv= "+Outer3.this.iv); //10
			//외부클래스 멤버 접근: 외부클래스명.this.멤버명
			
			System.out.println("Outer3.super.iv= "+Outer3.super.iv); //0
			//외부클래스의 상위클래스 멤버 접근: 외부클래스명.super.멤버명
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();

	}

}
