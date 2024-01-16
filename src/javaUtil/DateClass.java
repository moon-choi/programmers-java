package javaUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(sdf.format(date));
		
		System.out.println(date.getTime());
		
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today - date.getTime()); //걸린 시간 
	}	

}
