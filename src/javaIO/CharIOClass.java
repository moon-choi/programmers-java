package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Reader, Writer로 끝나면 Char단위로 입력/출력함.
public class CharIOClass { //문자열로 입력을 받는 프로그램.

	public static void main(String[] args) { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //데코레이터 패턴 
		//^한 줄씩 입력받을 수 있음										//^키보드 입력값 받음.

		//InputStreamReader는 Reader의 자손. InputStream받아들일 수 있음.
		
		String line = null;
		try {
			line = br.readLine(); //키보드로 입력받은 값을 line에 넣어줌.
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println(line);
	}

}

/*
1. Sysetem.in은 키보드 입력값을 받는데, .in의 타입은 InputStream임. 
2. 하지만 BufferedReader의 생성자는 Reader객체만 받아들일 수 있음. 
3. 그래서 System.in을 Reader의 형태로 바꿔줘야 함. 
4. 이 일을 하는 클래스가 InputStreamReader임. 


- System.in 은 사용자 입력 데이터를 바이트 스트림으로 받는다.
- InputStreamReader는 바이트를 문자열로 변경해주는 기능을 가진 클래스이다.
- BufferedReader 는 Reader를 생성자 파라미터로 받기 때문에 InputStream을 사용하는 System.in은 생성자로 사용될 수 없다.***
- InputStream을 Reader로 변환해주는 InputStreamReader를 통해 사용한다.
- BufferedReader는 변환된 문자열을 한 줄 단위로 출력한다.
*/