package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date: 날짜 표시 클래스
 * SimpleDateFormat: 형식화 클래스
 * 
 * HH:0~23시 표시
 * hh:1~12시 표시
 * EE: 요일
 * a: 오전/오후
 * 
 * 
 * 주요 메소드
 * String format(Date d): 날짜 d 값을 받아서 패턴에 맞는 문자열로 리턴
 * Date Parse(String sf): 형식에 맞는 문자열을 입력 받아 Date 객체로 리턴/ ParseException 예외 처리 필수 //깃
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(f.format(now));

		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date day = null;
		try {
			day = f2.parse("2024-12-24 10:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);

		// day로 2024년 12월 24일 요일 출력
		System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일 E요일").format(day));
		day = new Date(124, 11, 24, 10, 0, 0);
		System.out.println(day);

	}

}
