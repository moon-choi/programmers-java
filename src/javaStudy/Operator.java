package javaStudy;

public class Operator {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1; //무변화 
		int i3 = -i1; //변화 
		
		System.out.println(i1); //-5
		System.out.println(i2); //-5;
		System.out.println(i3); //5
		
		int i4 = ++i3; //i3 = i3 + 1; i3에 먼저 더한 다음에 i5로 값을 대입해줌. 
		System.out.println(i4); //6	
		System.out.println(i3); //6
		
		int i5 = i3++; // i3 = i3 + 1; i5에 i3 값을 먼저 대입한 다음에 더해줌.
		System.out.println(i5); //6
		System.out.println(i3); //7
		
		int x = 5;
		int y = 2;
		System.out.println(x / y); //2.5 지만 정수타입이므로 2 리턴. 
		System.out.println(x / (double) y); //형변환 시켜서 2.5 리턴.
		System.out.println(x % y); // modulo 는 나머지 1을 리턴.
		
		int i = 10;
		i += 10; // i = i + 10; | -= | *=
		System.out.println(i); //20
		
		int a = 5;
		int b = 10;
		int c = 15;
		int d = 5;
		
		System.out.println(a > 5 && b > 5);
		System.out.println(++a - 5); //a = 6이고 1을 리턴함. 
		System.out.println(d++ - 5); //d = 5이고 0을 리턴함. 
		System.out.println(d); //d 연산이 끝났으므로 이제 d는 6을 리턴함.   
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 && b3); //true
		System.out.println(b1 || b2); //true
		System.out.println(b1 || b3); //true
		System.out.println(b2 || b4); //false***
		
		int score = 88;
		if (score <=100 && score >= 70) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		
		System.out.println(b1 ^ b3); //false
		System.out.println(b1 ^ b2); //true
		
		int z = (5 > 4) ? 50 : 40;
	}

}
