package javaStudy;

public class VariableScope {
	int globalScope = 10; //인스턴스 변수 (인스턴스 생성때마다 별도로 생김)
	static int staticVal = 7; //클래스 변수 

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
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope); //불가능 
		/*
		- main 메소드의 static 키워드 때문. 
		- static 한 메소드 안에서 static 하지 않은 필드는 쓸 수 없음.*** 
		
		- 모든 클래스는 인스턴스화하지 않고서는 사용할 수 없음.
		- 하지만 main 메소드 static 키워드 덕분에 클래스가 인스턴스화돼지 않아도 사용할 수 있음. 
		-> new 하지 않아도 main 메소드를 사용할 수 있음. 
		*/
		
		System.out.println(staticVal); //가능.
 	
		//globalScope는 [인스턴스 변수]: 인스턴스 생성시, globalScope 가 vs1, vs2용으로 별도로 생김.
		VariableScope vs1 = new VariableScope(); 
		VariableScope vs2 = new VariableScope();
		
		//레퍼런스 이름.인스턴스 변수
		vs1.globalScope = 20;
		vs2.globalScope = 30;
		
		System.out.println(vs1.globalScope); //20
		System.out.println(vs2.globalScope); //30
//		System.out.println(globalScope); //불가능. 인스턴스 변수는 인스턴스화해야 쓸 수 있음. 
		System.out.println(staticVal); //가능 
		
		//static한 필드는 인스턴스 생성시에 만들어지지 않고, 값을 저장하는 곳이 하나뿐임. (값을 공유함) 
		//staticVal은 [클래스 변수]
//		//클래스변수는 인스턴스가 생성돼지 않아도 사용가능하므로, 클래스 이름을 직접 사용해서 메소드. VariableScope.staticVal 
		System.out.println(VariableScope.staticVal); //oo
		
		vs1.staticVal = 50; //xx
		vs2.staticVal = 100; //xx
		System.out.println(vs1.staticVal); //100. 50이 아닌 이유는 static 클래스 변수라 값을 하나밖에 못 저장해서. 
		System.out.println(vs2.staticVal); //100
	}

}
