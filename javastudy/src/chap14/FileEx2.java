package chap14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File 클래스의 주요 메소드
 * - String getAbsolutePath(): 절대 경로
 * - boolean mkdir(): 한 개의 폴더 생성/ 성공: true, 실패: false
 * - boolean mkdirs(): 여러 단계의 폴더 생성/ 성공: true, 실패: false
 * - boolean createNewFile(): 파일 생성
 * - String getName(): 파일의 이름 전달
 * - long length(): 파일의 크기 전달
 * - boolean exists(): 폴더, 파일 존재 여부/ 존재: true
 * - boolean renameTo(File f): 현재 객체를 f 객체로 변경, 파일 이름 변경
 * - long lastModified(): 1970년부터 파일이 마지막 변경된 시간까지를 밀리초로 리턴
 * - boolean delete(): 현재 파일 제거/ 성공: true, 실패: false
 * - boolean isDirectory(): 현재 파일이 폴더? 
 * - boolean isFile(): 현재 파일이 파일?
 * - boolean isHidden(): 숨긴 파일? 
 * 
 *	 내용을 수정하거나 읽지는 못함
*/

public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성: %b\n", f1.getAbsolutePath(), f1.mkdir());

		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일 생성: %b\n", f2.getAbsolutePath(), f2.createNewFile());
		System.out.printf("파일 이름: %s, 파일 크기: %d\n", f2.getName(), f2.length());

		File f3 = new File("c:/temp1/test2.txt");
		if (f3.exists()) {
			System.out.println(f3.getName() + " 파일은 존재함");
		} else
			System.out.println(f3.getName() + " 파일은 없음");

		System.out.printf("%s-> %s 이름 변경: %b\n", f2.getName(), f3.getName(), f2.renameTo(f3));
		System.out.printf("%s 파일 최종 수정 시간: %s\n", f3.getName(), new Date(f3.lastModified()));
		System.out.printf("%s 파일 삭제: %b\n", f3.getName(), f3.delete());

	}

}
