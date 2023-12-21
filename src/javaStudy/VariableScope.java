package javaStudy;

public class VariableScope {
	int globalScope = 10;
	static int staticVal = 7;

	//메소드 생성
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		
		System.out.println(globalScope);
//		System.out.println(localScope); //불가능 
//		System.out.println(value); //불가능  
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope); //불가능 
		//static 때문. 모든 클래스는 인스턴스화하지 않고서는 사용할 수 없음.
		//static 키워드 덕분에 클래스가 인스턴스화돼지 않아도 사용할 수 있음.  
		System.out.println(staticVal); //가능	 //7
		
		//인스턴스 생성시, globalScope 가 v1, v2용으로 별도로 생김.
		//"인스턴스 변수"
		
		VariableScope vs1 = new VariableScope(); 
		VariableScope vs2 = new VariableScope();
		
		//레퍼런스 이름.인스턴스 변수
		vs1.globalScope = 10;
		vs2.globalScope = 20;
		
		System.out.println(vs1.globalScope); //10
		System.out.println(vs2.globalScope); //20
		
		//static한 필드는 인스턴스 생성시에 만들어지지 않고, 값을 저장하는 곳이 하나뿐임. (값을 공유함) 
		//"클래스 변수"
		//클래스변수는 인스턴스가 생성돼지 않아도 사용가능하므로, 클래스 이름을 직접 사용해서 메소드.
		//VariableScope.staticVal //oo
		
		vs1.staticVal = 50; //xx
		vs2.staticVal = 100; //xx
		System.out.println(vs1.staticVal); //100 
		System.out.println(vs2.staticVal); //100
	}

}
