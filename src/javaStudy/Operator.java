package javaStudy;

public class Operator {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1; //무변화 
		int i3 = -i1; //변화 
		
		System.out.println(i1); //-5
		System.out.println(i2); //-5;
		System.out.println(i3); //5
		
		int i4 = ++i3; //i3에 먼저 1을 더한 다음, i4로 값을 대입해줌.***
		System.out.println(i4); //6	
		System.out.println(i3); //6
		
		int i5 = i3++; //i5에 i3 값을 먼저 대입한 다음, i3에 1을 더해줌.***
		System.out.println(i5); //6
		System.out.println(i3); //7
		
		int x = 5;
		int y = 2;
		System.out.println(x / y); //2.5 지만 정수타입이므로 2 리턴. 
		System.out.println(x / (double) y); //형변환 시켜서 2.5 리턴.
		System.out.println(x % y); // modulo 는 나머지 1을 리턴.
		
		int i = 10;
		i += 10; // i = i + 10;
		System.out.println(i); //20
		
		int a = 5;
		int b = 10;
		int c = 5;
		
		System.out.println(a > 5 && b > 5);
		System.out.println(++a - 5); //a = 6이고 1을 리턴함. 
		System.out.println(c++ - 5); //c = 5이고 0을 리턴함.*** 
		System.out.println(c); //c 연산이 끝났으므로 이제 c는 6을 리턴함.***
		
		System.out.println(true && false); //false
		System.out.println(true && true); //true
		System.out.println(true || false); //true
		System.out.println(true || true); //true
		System.out.println(false || false); //false***
		
		int score = 88;
		if (score <=100 && score >= 70) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		
		//논리연산자 ^: 다르면 true, 같으면 false
		System.out.println(true ^ true); //false 
		System.out.println(true ^ false); //true
		
		int z = (5 > 4) ? 50 : 40;
		System.out.println(z);
	}

}
