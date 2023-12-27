package javaStudy;

public class BizService {

	public static void main(String[] args) {
		BizService bs = new BizService();
		bs.bizMethod(5); 
		//bizService 클래스의 bizMethod에 숫자 담아서 실행 

		try {
			bs.bizMethod(-3); //에러 발생 가능한 코드 담는 구간 
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e);
		}

	}

	public void bizMethod(int i) throws BizException{ 
										//메세지나 에러 보내주는 클래스 
		System.out.println("business method begins");

		if(i < 0) {
			throw new BizException("i must be greater than 0"); 
			//이 메세지를 Exception msg에 넘겨줌.
		}
		System.out.println("business method ends");
	}
}