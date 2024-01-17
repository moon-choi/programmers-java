package javaIO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteClass4 {

	public static void main(String[] args) {
		try( //괄호안에 io객체 선언.
			DataInputStream in = new DataInputStream(new FileInputStream("byte3.txt"));
			//DataInputStream: 다양한 데이터타입으로 읽어들이는 객체.
		){
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
