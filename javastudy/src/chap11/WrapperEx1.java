package chap11;

/*
 * Wrapper(포장) 클래스 : 8개의 기본자료형을 객체화하기 위한 클래스 통칭
 *          => 8개의 클래스를 통칭
 *          
 *     기본자료형      Wrapper 클래스
 *     boolean      Boolean
 *     char         Character
 *     byte         Byte
 *     short        Short
 *     int          Integer
 *     long         Long
 *     float        Float
 *     double       Double
 *     
 *  참조자료형 기본자료형간에 형변환 불가
 *     String str = 'A'; (x)
 *  단 기본자료형을 담당하는 Wrapper 클래스와 자동변환 가능함
 *     Character ch1 = 'A'; auto Boxing됨
 *     char ch2 = new Character('A');  // auto unBoxing 됨  
 */
public class WrapperEx1 {
	public static void main(String[] args) {
//		String str = 'A'; //String <= char 형변환 불가
		Character ch1 = 'A'; // 참조자료형 <- 기본자료형. auto Boxing됨
		
		char ch2 = new Character('A'); // 기본자료형 <- 참조자료형 auto unBoxing
	}
}
