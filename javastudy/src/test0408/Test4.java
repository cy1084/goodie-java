package test0408;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도를 입력받아 매월 1일과 마지막 일자의 요일을 출력하기
 * [결과]
 * 년도를 입력하세요
 * 2024
 * 2024-01-01 월요일, 2024-01-31 수요일
 * 2024-02-01 목요일, 2024-02-29 목요일
 * 2024-03-01 금요일, 2024-03-31 일요일
 * 2024-04-01 월요일, 2024-04-30 화요일
 * 2024-05-01 수요일, 2024-05-31 금요일
 * ....
 * 2024-12-01 일요일, 2024-12-31 화요일
 */
public class Test4 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		int year = sc.nextInt();
		int month1=1;
		int month2=1;


		for (int i = 1; i <=12; i++) {
			SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
			Date firstDay = sf1.parse(String.format("%4d-%02d-01", year, month1));
			month1++;
			
			Date lastDay=sf1.parse(String.format("%4d-%02d-01", year, month2+1));
			month2++;
			lastDay.setTime(lastDay.getTime()-(1000*60*60*24));

			SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
			System.out.println(sf2.format(firstDay)+",  "+sf2.format(lastDay));
			
		}

	}
}
