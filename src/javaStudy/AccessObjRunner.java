package javaStudy;
public class AccessObjRunner {
	public static void main(String[] args) {
		
		AccessObj obj = new AccessObj();
		
		/*
		만약 AccessObjRunner와 AccessObj가 다른 패키지에 존재할 때,
		AccessObjRunner extends AccessObj 하면 public, protected 까지 가능.
		*/
		
//		AccessObjRunner obj = new AccessObjRunner();
		
		System.out.println(obj._public);
		System.out.println(obj._protected);
		System.out.println(obj._default);
//		System.out.println(obj._private); //불가능 
	}

}
