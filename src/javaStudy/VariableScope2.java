package javaStudy;

public class VariableScope2{
    static int staticValue = 999;
    int value = 111;
    
    public static void main(String []args){
        VariableScope2 vs = new VariableScope2();  
        
        System.out.println(VariableScope2.staticValue);
        System.out.println(vs.value);
    }
}