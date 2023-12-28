package javaStudy;

public class TypeCasting {//기본형의 타입변환 

	// byte < short, char < int < long < float < double
	public static void main(String[] args) {
		int x = 50000;
		long y = x; //묵시적 형변환
					//형변환이 일어남. (작은것 int를 큰것 long에 담음)
		
		long z = 5;
//		int w = z; //형변환 안일어남. (큰것 long을 작은것 int에 담음) 
		int w = (int) z; //강제 형변환
	}

}
