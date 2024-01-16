import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		long x = 500000000;
		int y = (int) x;
		
	    int a = 5; 
        System.out.println(++a - 5); //1	 
        System.out.println(a); //6
        
	    int b = 5; 
        System.out.println(b++ - 5); //0
        System.out.println(b); //6
        
        System.out.println(true&&true); // true
        System.out.println(true&&false); //false
        
        System.out.println(true||true); //true
        System.out.println(true||false); //true
        
        System.out.println(true^false); //true
        System.out.println(true^true); //false
        
        int value = 'a';
        
        switch(value) {
        case 'a': 
        	System.out.println('a');
        	break;
        case 1:
        	System.out.println(1);
        	break;
        default: 
        	System.out.println("default");
        	
        }
        
        int i = 0;  //while에서 사용할 변수를 선언

        while(i < 3){
            System.out.println("before: " + i);
            i++; //조건문을 원하는 만큼만 반복하고 빠져나가기 위한 부분 
            System.out.println("after: " + i);
        }
        System.out.println("outside while: " + i);
        
        int val = 0;

        // Scanner는 java.util 패키지에 있는 클래스로써 키보드로 부터 값을 입력받는다던지 할 때 유용하게 사용할 수 있는 클래스입니다.
        Scanner scan = new Scanner(System.in);
        //위 처럼 작성하시면 키보드로부터 값을 입력받을 수 있는 Scanner객체가 생성됩니다. 

        do{
            val = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
            System.out.println("입력받은 수 : " + val);  
        } while(val != 10);  // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.

        System.out.println("반복문 종료");
        
	}

}
