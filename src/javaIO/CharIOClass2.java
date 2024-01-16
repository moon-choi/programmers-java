package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOClass2 {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/javaIO/CharIOClass2.java"));
			pw = new PrintWriter(new FileWriter("test.txt")); //PrintWriter 단독으로도 파일 쓸 수 있음.
			String line = null;
			while( ( line = br.readLine() ) != null ) {
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