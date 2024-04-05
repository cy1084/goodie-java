package test0326;
/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 * [결과]
   90   80   70  240
   95   85   75  255
   70   80   75  225
   75   70   85  230
   70   75   80  225
  400  390  385   ....
  
 */
public class Test1 {
	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		};
		int[][] result=new int[6][4];
		
		
		//result=score; 얕은 복사-> score을 바꾸면 result도 바뀜
		
		
		System.out.println("================result 배열================");
		for (int i = 0; i < result.length; i++) { // 행
			for (int j = 0; j < result[i].length; j++) { // 열
				System.out.print("score[" + i + "][" + j + "]=" + result[i][j] + ",");
			}
			System.out.println();
			}
		
		System.out.println();
		
		
		for (int i = 0; i < result.length; i++) { 
			for (int j = 0; j < result[i].length; j++) { 
				result[i][j]=score[i][j]; // 깊은 복사 score 바껴도 result 안바뀜
				result[i][result[i].length] = result[i][result[i].length] + score[i][j];
				result[result.length][j] = result[result.length][j] + score[i][j];
				
				}
			}
		
		
		for (int i = 0; i < result.length; i++) { 
			for (int j = 0; j < result[i].length; j++) { 
				System.out.printf("%d",result[i][j] );
				}
			}
		
			}
		
		}

