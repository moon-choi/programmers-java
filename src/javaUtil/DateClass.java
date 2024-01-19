package javaUtil;

import java.util.Date;
import java.text.SimpleDateFormat;

/*현재시간 나타내는 법: 
- Calendar.getInstance().getTime() 
- new Date()
- System.currentTimeMillis() 
*/

public class DateClass {
	//Date는 localization 안돼있음. (단점보완하는 클래스: Calendar)
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString()); //Wed Jan 17 09:13:05 KST 2024

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz"); 
		System.out.println(sdf.format(date)); //2024.01.17 at 09:13:05 AM KST
		
		System.out.println(date.getTime());//.getTime()은 Date를 밀리세컨드로 변환해서 long형 숫자 데이터로 반환.
		
		long now = System.currentTimeMillis();
		System.out.println(now);
				
		System.out.println(now - date.getTime()); //수행하는데 걸린 시간 

	}	

}
