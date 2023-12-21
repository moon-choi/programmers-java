package javaStudy;

public class For {

	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i = 1; i <= 100; i++) { //step 0. 초기화 (한번만 실행) //step1. 조건 // step3. 실
			//step2. 실행
			total += i;
		}
		System.out.println(total);
		
		int evenNumTotal = 0;
		for(int x = 0; x <= 100; x += 2) {
			evenNumTotal += x;
		}
		System.out.println(evenNumTotal);
		
		int evenTotal = 0;
		for(int y = 1; y <= 100; y++) {//step 0. //step 1. // step 3. 
			if(y % 2 != 0) {//step 2. if문 
				continue; //continue 는 다음 줄 실행시키지않고 바로 다음 실행해야 돼는 곳으로 감. 
						//그래서 위로 올라가서 y++ 시킴. 
			}
			evenTotal += y;
		}
		System.out.println(evenTotal);

	}

}
