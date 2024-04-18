package chap15;

//깃
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * 1부터 100까지 임의의 수 10개를 IntStream에 저장하고
 * 저장된 수의 총합, 평균, 짝수의 평균, 홀수의 평균, 짝수의 개수, 홀수의 개수 출력 
 */

public class Exam2 {
	public static void main(String[] args) {
		/*
		int[] arr3 = new Random().ints(10, 1, 101).toArray();
		int sum=0;
		
		for (int i : arr3) {
			System.out.print(i+", ");
			sum +=i;
		}
		System.out.println();
		System.out.println("총합: "+ sum);
		System.out.println("평균: "+(double)sum/10);
		
		*/
		
		int[] arr3 = new Random().ints(10, 1, 101).toArray();
		int sum=0, esum=0, osum=0, ecnt=0, ocnt=0;
		
		for(int i:arr3) {
			sum+=i;
			
			if(i%2==0) {
				esum+=i;
				ecnt++;
			}else {
				osum+=i;
				ocnt++;
			}
		}
		System.out.println("총합: "+Arrays.stream(arr3).sum());
		System.out.println("평균: "+Arrays.stream(arr3).average().getAsDouble());
		System.out.println("짝수 평균: "+Arrays.stream(arr3).filter(i -> i % 2 == 0).average().getAsDouble());
		System.out.println("홀수 평균: "+Arrays.stream(arr3).filter(i -> i % 2 == 1).average().getAsDouble());
		System.out.println("짝수 개수: "+Arrays.stream(arr3).filter(i -> i % 2 ==0).count());
		System.out.println("홀수 개수: "+Arrays.stream(arr3).filter(i -> i % 2 ==1).count());
		
		
		
	}

}
