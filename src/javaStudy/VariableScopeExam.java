package javaStudy;

public class VariableScopeExam{
    static int staticValue = 999;
    int value = 111;
    
    public static void main(String []args){
        VariableScopeExam vs = new VariableScopeExam();  
        
        System.out.println(VariableScopeExam.staticValue);
        System.out.println(vs.value);
    }
}