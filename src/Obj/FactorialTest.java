package Obj;

public class FactorialTest {
    static int Factorial(int n){
        if(n==1) return 1;
        return n*Factorial(n-1);
    }
    public static void main(String[] args){
        int result=0;
        result=Factorial(4);
        System.out.println(result);
    }
}
