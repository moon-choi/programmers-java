package javaStudy;

public class AccessObjRunner {
	public static void main(String[] args) {
		
		AccessObj obj = new AccessObj();
		
		/*
		만약 AccessObjRunner와 AccessObj가 다른 패키지에 존재할 때,
		AccessObjRunner extends AccessObj 하면 public, protected 까지 가능.
		*/
		
//		AccessObjRunner obj = new AccessObjRunner();
		
		System.out.println(obj.pub);
		System.out.println(obj.prot);
		System.out.println(obj.def);
//		System.out.println(obj.priv); //불가능 
	}

}
