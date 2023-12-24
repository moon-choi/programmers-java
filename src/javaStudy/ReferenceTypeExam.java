package javaStudy;

import java.util.Arrays;

class ReferenceTypeExam {
    public static void main(String []args) {
        ReferenceTypeExam exam = new ReferenceTypeExam();
        
        //기본형 변수value1을 addOne에 전달합니다.
        int value = 10;
        exam.addOne(value);
        System.out.println(value);
        System.out.println("기본형 변수의 값을 다른 메소드에서 변경한 결과: " + value);
        
        //참조형 변수arr을 addOne에 전달합니다.
        int []arr = {10};
        exam.addOne(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("참조형 변수의 값을 다른 메소드에서 변경한 결과: " + arr[0]);
    }
    
    
    public void addOne(int value) {
        value++;
    }
    
    public void addOne(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i]++;
        }
    }
}