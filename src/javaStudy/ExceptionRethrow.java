package javaStudy;

public class ExceptionRethrow {

	public static void main(String[] args) { //main 실행부
		try {
			method1(); //4. 예외 발생
			
		} catch (Exception e) {
			System.out.println("예외처리 in main()"); //5. 예외 처리 
		}

	}
	
	static void method1() throws Exception{ //메소드 선언부 
		try {
			throw new Exception(); //1. 예외 발생 
		} catch (Exception e) {
			System.out.println("예외처리 in method1()"); //2. 예외 처리 
			throw e; //3. 위의 method1()로 예외 던짐. 만약 이부분 없으면 예외처리 in main 안 일어남.
		}
	}

}

/*
1. method1의 catch블럭에서 예외 처리 
2. throw를 통해 다시 예외 발생 시킴 
3. main에서 한번 더 예외처리 

만약 method 리턴값이 void 아니면 catch문에도 return 있어야함. 
return 대신 throw도 사용 가능. 
*/