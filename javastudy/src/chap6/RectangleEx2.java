package chap6;

/*
 * Rectangle2 클래스를 이용하여
 * 가로, 세로 길이가 20~30 사이인 임의의 길이를 가진 사각형 5개 생성
 * 생성된 5개의 사각형의 정보 출력하기
 * 전체 사각형의 넓이의 합과 둘레의 합 출력하기
 * 
 * */
public class RectangleEx2 {
	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[5];
		int totArea = 0, totLen = 0; // 전체

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle2();
			arr[i].width = (int) (Math.random() * 11) + 20;
			arr[i].height = (int) (Math.random() * 11) + 20;
			arr[i].sNo = ++Rectangle2.cnt;

			System.out.println(arr[i]);

			totArea = totArea + arr[i].area();
			totLen = totLen + arr[i].length();
		}
		System.out.println("전체 사각형의 넓이의 합: " + totArea);
		System.out.println("전체 사각형의 둘레의 합: " + totLen);
	}

}
