package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOClass {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //데코레이터 패턴 
		//키보드로부터 한줄씩 입력받을 수 있음 ^
		String line = null;
		try {
			line = br.readLine(); //키보드로 입력받은 값을 line에 넣어줌.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(line);
	}

}
