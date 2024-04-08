package test0405;
/*
 * s1,s2 문자열을 분리하여 다음과 같이 결과가 나오도록 코딩하기
[결과] 
 HTML=>홍길동
 CSS=>김삿갓
 JavaScript=>이몽룡
 JAVA=>성춘향
 JSP=>임꺽정
 스프링=>향단이
*/

public class Test3 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JavaScript-JAVA-JSP-스프링";
		String s2 = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    ";
		String[] sarr1=s1.split("-");
		String[] sarr2=s2.split(",");
		
		for(int i=0;i<sarr1.length;i++) {
			System.out.println(sarr1[i]+"=>"+sarr2[i].trim());
		}
		
		
	}
}
