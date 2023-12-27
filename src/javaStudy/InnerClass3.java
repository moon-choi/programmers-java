package javaStudy;

public class InnerClass3 {

	public void exec() {
		class Cal{ //3. 메소드 안의 로컬 클래스 
			int value = 0; //변수 
			public void plus() { //메소드 
				value++;
			}
		}
		//메소드 안에서만 객체 생성 가능 
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}//메소드 끝
	
	public static void main(String[] args) {
		InnerClass3 ic = new InnerClass3();
		ic.exec();

	}

}
