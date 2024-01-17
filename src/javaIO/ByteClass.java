package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteClass { //파일로부터 1바이트씩 읽어들여서 1바이트씩 써내는 프로그램 

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null; //파일로부터 읽어들이는 객체 선언
		FileOutputStream fos = null; //파일을 쓸 수 있는 객체 선언 
		
		try { //인스턴스화.
			fis = new FileInputStream("src/javaIO/ByteClass.java");
			fos = new FileOutputStream("byte.txt"); //아무 경로 안주면 프로젝트 밑에 생성됌.
			
			int readCount = -1;
			//read 메소드는 한 바이트씩 읽을 수 있음. 리턴은 정수. 
			//읽어들일 것이 있으면 항상 양수.
			while( ( readCount = fis.read() ) != -1 ) { //파일 읽기 다 끝내면 -1 리턴해줌. -1 아닌 동안 계속 반복.
				fos.write(readCount);
			}
		} catch (Exception e) { //파일이 없을수도 있을 때를 대비한 에러.
			e.printStackTrace();

		} finally {
			try {
//				fos.flush();
				fos.close(); //io의 모든 객체들은 인스턴스화한 뒤 반드시 닫아주어야함.
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close(); //io의 모든 객체들은 인스턴스화한 뒤 반드시 닫아주어야함.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

}
