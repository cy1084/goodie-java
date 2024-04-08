package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 연도와 월을 입력받아 연월의 1일과 마지막 일자의 요일 출력
 */
public class Exam7 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요.");
		int year = sc.nextInt();
		int month = sc.nextInt();

		// parse 메소드를 이용하여 Date 형으로 바꿔줘야 함
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date firstDay = sf1.parse(String.format("%4d-%02d-01", year, month));
		//System.out.println(firstDay);
		
		Date lastDay = sf1.parse(String.format("%4d-%02d-01", year, month+1)); //다음 달의 첫째 날
		lastDay.setTime(lastDay.getTime()-(1000*60*60*24));//다음 달의 첫째 날에서 하루를 빼면 이번 달의 마지막 날
		//System.out.println(lastDay);
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf2.format(firstDay));
		System.out.println(sf2.format(lastDay));
		

	}

}
