package javaStudy;

public class StringExam {
	/* 
	== 연산자는 문자열 변수를 비교할 때 변수의 레퍼런스를 비교합니다. 
	우리는 변수의 레퍼런스를 비교하고 싶은 게 아니라, 변수가 저장하는 문자열이 같은지 확인하고 싶습니다.
	두 문자열이 같은 값인지는 equals 메소드를 사용합니다
	 */
	
	public static void main(String[] args) {
        String str1 = new String("Hello world");
        String str2 = new String("Hello world");
        
        if(str1 == str2){
            System.out.println("str1과 str2는 같은 인스턴스를 참조합니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 인스턴스를 참조합니다.");
        }
        
        if( str1.equals(str2) ){
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }
    }
}
