package javaStudy;

public class AccessObj {
	
	/* 접근제한자
	 public > protected > default > private
	 - public: 전체공개
	 - protected: 같은 패키지인 경우 접근 허용. 다른 패키지는 상속 받은 경우 접근 허용. 
	 - default: 나와 같은 패키지만. 
	 - private: 나 자신만 접근 가능.
	 */
	
	public int _public = 3;
	protected int _protected = 4;
	int _default = 2;
	private int _private = 1;
	
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj._private); //가능 
	}
}
