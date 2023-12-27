package javaStudy;

public class For {
	public static void main(String[] args) {
		
		int total = 0;
		for(int i = 1; i <= 100; i++) { //step 0. 초기화 (한번만 실행) //step1. 조건 // step3. 실
			//step2. 실행
			total += i;
		}
		System.out.println(total);
		
		//짝수의 합 구하기 
		//solution 1.
		int evenNumTotal = 0;
		for(int x = 0; x <= 100; x += 2) {
			evenNumTotal += x;
		}
		System.out.println(evenNumTotal);
		
		//solution 2.
		int evenNumTotal2 = 0;
		for(int y = 1; y <= 100; y++) {//step 0. //step 1. // step 3. 
			if(y % 2 != 0) {//step 2. if문 
				continue; //continue 는 다음 줄 실행시키지않고 바로 다음 실행해야 돼는 곳으로 감. 
						//그래서 위로 올라가서 y++ 시킴. 
			}
			evenNumTotal2 += y;
		}
		System.out.println(evenNumTotal2);
		//continue문은 해당 조건문 블록을 탈출하여 아래 명령문은 실행하지 않고, 다음 반복문 실행절차를 수행.
		
		//solution 3.
		int evenNumTotal3 = 0;
		for(int z = 1; z <= 100; z++) {
			if(z % 2 == 0) {
				evenNumTotal3 += z;	
			}
		}
		System.out.println(evenNumTotal3);

	}

}
