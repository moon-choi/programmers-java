package javaStudy;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr1 = new int[100]; //배열 생성시에는 꼭 new 붙이고, 몇개 담을지 명시. 
		arr1[0] = 50;
		
		int[] arr2 = new int[] {1, 2, 3, 4}; 
		
		int[] arr3 = {1, 2, 3, 4}; //위와 같음.
		

		int value = arr3[1];
		
		System.out.println(Arrays.toString(arr3));
		arr3[0] = 9;
		System.out.println(Arrays.toString(arr3));
		
		System.out.println(value);
		
		//2차원 배열
		int[][] arr4 = new int[3][4]; //[1차원] [2차원] //4개씩 3배열 
		arr4[0][1] = 6; //1차원 배열에 2차원 배열의 한 원소 값 할당하기 
		
		arr4[1]= new int[] {7,8,9,9}; //1차원 배열에 2차원 값 할당하기****
		
		System.out.println(Arrays.toString(arr4[0])); //[0, 6, 0, 0]
		System.out.println(Arrays.toString(arr4[1])); //[7, 8, 9, 9]

		arr4[1][3] = 10;
		System.out.println(Arrays.toString(arr4[1])); //[7, 8, 9, 10]
		
		//2차원 배열의 갯수 모를 때  
		int[][] arr5 = new int [3][]; //n개로 이루어진 3배열
		
		//서로 길이가 다른 배열 만들어 줄 수도 있음.
		arr5[0] = new int[1];
		arr5[1] = new int[2];
		arr5[2] = new int[3];
		
		System.out.println(Arrays.toString(arr5[0])); //[0]
		System.out.println(Arrays.toString(arr5[1])); //[0, 0]
		System.out.println(Arrays.toString(arr5[2])); //[0, 0, 0]
		
		/* new 구문은 initialize. 이 때는 [0, 0, 0]으로 뜸.
		Array elements are initialized to;
		- Numeric type (int or double): 0 
		- boolean: false
		- String / object: null
		*/
		
		//초기화와 동시에 값 주기 
		int[][] arr6 = {{0}, {1, 2}, {3, 4, 5}};
		System.out.print(arr6[2][2]); //5
		
	}

}
