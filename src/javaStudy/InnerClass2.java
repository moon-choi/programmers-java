package javaStudy;

public class InnerClass2 {
	
	static class Cal{ //2. 정적 내부 클래스 
		int value = 0; //변수 
		public void plus() { //메소드 
			value++;
		}
	}
	public static void main(String[] args) {
		//스태틱이므로 바로 접근 가능 
		//InnerClass2 ic = new InnerClass2(); 할 필요없음. 

		InnerClass2.Cal cal = new InnerClass2.Cal(); 
		cal.plus();
		System.out.println(cal.value);

	}

}
