package javaStudy;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//일반적인 for
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i]; //값 꺼내기 
			System.out.println(x);
		}
		
		//forEach 문 - 타입, 변수이름: 꺼낼 대상 
		for(int y: arr) { //배열 길이만큼 돌 필요가 없음. 
			System.out.println(y);
		}

	}

}
