package chap14;

import java.io.File;

/*
 * c:/windows 폴더의 하위 폴더 개수, 파일의 개수, 파일의 총 크기 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		String filePath = "c:/windows";
		File f1 = new File(filePath);
		int folderCnt = 0;
		int fileCnt = 0;
		float sum = 0;

		String[] files = f1.list();

		for (String f : files) {
			File f2 = new File(filePath, f);
			// =File f2 = new File(f1, f);
			// f2: f1 중 파일 하나를 관리

			if (f2.isDirectory()) {
				folderCnt++;
			} else {
				fileCnt++;
				sum = sum + f2.length();
			}
		}

		System.out.println("폴더의 개수: " + folderCnt);
		System.out.println("파일의 개수: " + fileCnt);
		System.out.printf("파일의 총 크기: %,.3fbyte", sum);

	}
}
