package javaStudy;

public class AccessObjRunner extends AccessObj{

	public static void main(String[] args) {
		
		AccessObj obj = new AccessObj();
		
		//AccessObjRunner와 AccessObj가 다른 폴더에 있을 때,
		// 만약 extends AccessObj 하면 public, protected 까지 가능.
//		AccessObjRunner obj = new AccessObjRunner();
		System.out.println(obj.pub);
		System.out.println(obj.prot);
		System.out.println(obj.def);
//		System.out.println(obj.priv); //불가능 
	}

}
