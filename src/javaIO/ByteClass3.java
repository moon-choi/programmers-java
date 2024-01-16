package javaIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteClass3 {

	public static void main(String[] args) {
		try( 
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));	
		){
			out.writeInt(100); //4바이트 차지  
			out.writeBoolean(true); //1바이트 차지  
			out.writeDouble(50.5); //8바이트 차지 
			//data.txt -> properties: size는 13 bytes 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
