package test0321;


import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			            
	8	7	6		 
5	4	3	2	1	

  
 
2
4
321

4
16 
151413
12111098
7654321

5
25
242322
212011817
16151413121110
987654321
 
 
 높이*높이
*/
public class Test4 {
	public static void main(String[] args) {
		/*
		 
	 답
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(); 
		int bottom = len * 2 - 1;
		int data = 0; //첫 번째 숫자 값 저장
		for(int i=bottom;i>=1;i-=2) {
			data += i;
		}
		int m = bottom/2;
		for(int i=0;i < len;i++) {
			for(int j=0;j<bottom;j++) {
				if(j>=m-i && j<=m+i)
					System.out.print(data--+"\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이: ");
		int h = sc.nextInt();
		int num=h*h;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < 2*h-1; j++) {
				if(j>=((2*h-1)/2-i) && j<=((2*h-1)/2+i)) {
					//숫자 역으로 출력
					//h*h
					System.out.print(num+"\t");
					num--;
					/*
					for(int num=h*h; num>=1; num--) {
						System.out.print(num);
					}
					*/
					
					//System.out.print("*");
				}
				else System.out.print(" ");
				}
			System.out.println();
			}
			
		}
	}
