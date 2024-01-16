package javaIO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteClass4 {

	public static void main(String[] args) {
		try(
			DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
				
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
