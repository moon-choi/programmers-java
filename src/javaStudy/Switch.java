package javaStudy;

public class Switch {

	public static void main(String[] args) {
		//switch, case, default, break
		
		int value = 6;
		
		switch(value) { //케이스문의 성질: 맞는 곳부터 끝까지 순차적으로 모두 리턴해주므로 break 반드시 넣어야. 
			case 1:
				System.out.println("1");
				break;
			case 2: 
				System.out.println("2");
				break;
			case 3: 
				System.out.println("3");
				break;
			default: System.out.println("other number");
		}
		String str = "g";
		switch(str) {
			case "a":
				System.out.println("a");
				break;
			case "b": 
				System.out.println("b");
			default: System.out.println("other character");
		}
	}

}
