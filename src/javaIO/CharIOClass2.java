package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class CharIOClass2 {

	public static void main(String[] args) {
		//BufferedReader는 1줄씩 입력받음.
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/javaIO/CharIOClass2.java")); //파일을 읽어서 한줄씩 읽어들임.
			pw = new PrintWriter(new FileWriter("char2.txt")); //PrintWriter 단독으로도 파일 쓸 수 있음.
//			pw = new PrintWriter("char2.txt"); //PrintWriter 생성자 자체가 파일을 받아들임.
			String line = null; 
			while( ( line = br.readLine() ) != null ) { //파일의 끝에서 null을 리턴하므로 null이 아닌동안 반복.
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pw.close(); //IO패키지는 열면 반드시 닫아줘야 함.
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}