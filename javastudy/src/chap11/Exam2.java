package chap11;

//count("문자열","찾는 문자열"): 문자열에서 찾는 문자열의 개수 리턴하는 메소드 

public class Exam2 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB45AB", "12"));// 2
		System.out.println(count("12345AB12AB45AB", "AB"));// 3
		System.out.println(count("12345", "AB"));// 0
		
		//System.out.println("개수는: "+cnt);

	}

	private static int count(String s1, String s2) {
		int cnt=0;
		int index=0;
		
		while(true) {
			index=s1.indexOf(s2,index); //s2의 인덱스 값 전달
			if(index<0) {
				break; //종료
			}
			cnt++;
			index++; 
		} 
		return cnt;
		
		/*
		int cnt = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.equals(b)==a.charAt(i)) {
				cnt++;
			}
		}
		return cnt;
		*/
	}

}
