package javaIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteClass3 {

	//try-with-resource: 자동으로 io객체 close시킴.
	public static void main(String[] args) {
		try( //괄호안에 io객체 선언.			
			DataOutputStream out = new DataOutputStream(new FileOutputStream("byte3.txt"));	
									//DataOutputStream은 장식하는 클래스.
		){							
			out.writeInt(100); //4바이트 차지  
			out.writeBoolean(true); //1바이트 차지  
			out.writeDouble(50.5); //8바이트 차지 
			//byte3.txt -> properties: size는 13 bytes 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
