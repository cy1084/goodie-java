package chap11;

import java.util.Random;

/*
 * 난수 발생
 * - Math.random() 메소드
 * - Random 클래스
 * 
 * 자료형 별로 난수 발생 가능
 * - nextInt(): 정수형 난수
 * - nextInt(n): 0~n-1 사이의 정수형 난수
 * - nextDouble(): 0<=x<1.0
 * - nextBoolean(): true/false
 * 
 * seed 값 설정 가능 //항상 고정 값
 * - 난수의 복원 가능
 * - seed 값이 변경되면 더 랜덤한 값을 가져올 수 있다
 * 
 * 
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand1=new Random();
		rand1.setSeed(System.currentTimeMillis()); //seed 값이 계속 바뀜 
		
		for(int i=0;i<5;i++) {
			System.out.println(i+": "+rand1.nextInt(10));
		}

	}

}
