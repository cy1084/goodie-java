package test0401;

/*
1. 인터페이스 내에 메서드를 적합하게 선언한 형태 2개를 고르시오. 
(1) void methoda(); 다 없으면 public abstract 생략
(2) public double methoda(); abstract 생략
(3) public final double methoda(); final 오류!- final은 오버라이딩 불가한다 인터페이스 메소드는 무조건 오버라이딩 해야 함
(4) static void methoda(double d1); static 오류!-> static은 구현부 필요(???다시) 
(5) protected void methoda(double d1); protected 오류!- public이어야 함

2. 2번째 줄과 동일한 의미를 갖는 문장 3개를 고르시오.

1. public interface Foo {  (1)(2)(3)
2. int k = 4;
3. }

(1) final int k = 4;      (2) public int k = 4;
(3) static int k = 4;   (4) abstract int k = 4;
(5) volatile int k = 4; (6) protected int k = 4;


4. 다음 소스를 보고 보기 중 16라인에 추가되면 
java.lang.ClassCastException을 발생시키는 문장을 선택하시오. (2) Foo-Alpha-Beta-Delta
10. interface Foo {}										
11. class Alpha implements Foo { } 
12. class Beta extends Alpha {} 
13. class Delta extends Beta { 
14. public static void main( String[] args) { 
15. Beta x = new Beta(); 
16. // insert code here 
17. } 
18. } 
(1). Alpha a = x; 
(2). Foo f= (Delta)x; 
(3). Foo f= (Alpha)x; 
(4). Beta b = (Beta)(Alpha)x; 

5. 다음 A 인터페이스를 상속 받아서 새로운 B 인터페이스를 생성하고
자 한다. 다음 보기 중 올바른 문장을 선택하시오.  (1) 인터페이스 간 상속 가능- extends
1. public interface A { 
2.    String DEFAULT_GREETING = “Hello World”; 
3.    public void method1(); 
4. } 
(1). public interface B extends A { } 
(2). public interface B implements A {} 
(3). public interface B instanceOf A {} 
(4). public interface B inheritsFrom A { }
 
*/