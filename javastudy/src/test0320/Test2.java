package test0320;

import java.util.Scanner;

/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
  한개의 숫자를 입력받아 가위바위보 게임하기 
  
  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!

  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
*/

public class Test2 {

	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 3) + 1; // 시스템의 한 개 숫자 저장
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요 ");
		int num2 = scan.nextInt(); // 사용자에게 숫자 입력 받기

		if (num1 == 1) {
			if (num2 == 1)
				System.out.println("동점!");
			else if (num2 == 2)
				System.out.println("사용자 승리!");
			else if (num2 == 3)
				System.out.println("시스템 승리!");
		} else if (num1 == 2) {
			if (num2 == 1)
				System.out.println("시스템 승리!");
			else if (num2 == 2)
				System.out.println("동점!");
			else if (num2 == 3)
				System.out.println("사용자 승리!");
		} else if (num1 == 3) {
			// else{
			if (num2 == 1)
				System.out.println("사용자 승리!");
			else if (num2 == 2)
				System.out.println("시스템 승리!");
			else if (num2 == 3)
				System.out.println("동점!");
		}

		/*
		 *
		 * int mySrp = scan.nextInt(); boolean userwin = false; System.out.print("시스템:"
		 * + srp + ",사용자:" + mySrp);
		 * 
		 * if (mySrp == srp) System.out.println("\t비김.");
		 * 
		 * else { //승부판단 switch(srp) { case 1 : if(mySrp == 2) userwin = true; break;
		 * case 2 : if(mySrp == 3) userwin = true; break; case 3 : if(mySrp == 1)
		 * userwin = true; break; }
		 * 
		 * if (userwin) //userwin==true System.out.println(" \t사용자 승리!"); else
		 * System.out.println(" \t시스템 승리!");
		 */

	}

}
