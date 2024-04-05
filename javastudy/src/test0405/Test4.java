package test0405;
/*
 * 소숫점이하 자리수까지 반올림하여 출력하기
 *  double  round(double 실수값,int 소숫점이하자리수)  
 * 소숫점이하 자리수에서 버림하여 출력하기
 *  double  truncate(double 실수값,int 소숫점이하자리수)  
 *  i=3
 *  "%3d" => "%"+i+"d" 
 */

public class Test4 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1));  //3.1
		System.out.println(round(3.1215,2));  //3.12
		System.out.println(round(3.1215,3));  //3.122
		System.out.println(truncate(3.15345,1));  //3.1
		System.out.println(truncate(3.15345,2));  //3.15
		System.out.println(truncate(3.15345,3));  //3.153
		System.out.println(truncate(3.15345,4));  //3.1534

	}
}
