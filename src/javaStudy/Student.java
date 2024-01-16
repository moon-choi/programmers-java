package javaStudy;

import java.util.Objects;


//equals()나 hashCode()는 보통 오버라이딩해서 씀.
public class Student {
	String name;
	String number;
	int birthYear;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.number = "5678";
		s2.birthYear = 1996;
		
		if(s1.equals(s2)){
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");		
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s2.toString()); //Source > Generate toString()하면 메소드가 추가돼고, s1과 s1.toString()의 println 결과가 같아짐.
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthYear, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return birthYear == other.birthYear && Objects.equals(number, other.number);
	}
}
