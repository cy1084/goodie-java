package test0321;


import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */


/*
 int len = scan.nextInt();
 int bottom = len * 2 - 1;
 int m = bottom/2;
	for(int i=0;i<len;i++) {
			for(int j=0;j<bottom - i;j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
  
 */
//아직
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이: ");
		int h = sc.nextInt();
		
		for (int i = 0; i < h; i++) {
			for (int j = 2*h-1; j >= 0; j--) {
				if(j>=((2*h-1)/2-i) && j<=((2*h-1)/2+i)) {
					System.out.print("*");
				}
				else System.out.print(" ");
				}
			System.out.println();
			}
}
	}