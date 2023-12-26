package javaStudy;

public class BizException extends RuntimeException {

	//생성자 선언하기 
	public BizException(String msg) {
		super(msg); //이미 부모 클래스가 같은 기능 가진 생성자가 있음.
					//부모 생성자에게 전달만 해주면 됌.
					//super로 부모 호출.
	}
	
	public BizException(Exception exc) {
		super(exc);
	}

}


/*
- Checked Exception: Exception을 상속받은 클래스들. (extends Exception)
오류처리를 하지 않으면 컴파일 에러 발생. 반드시 오류 처리해야.

- Unchecked Exception: Runtime Exception 을 상속받은 클래스들. (extends Runtime Exception)
오류처리 반드시 안해도 컴파일 에러는 발생 안함. 
*/
