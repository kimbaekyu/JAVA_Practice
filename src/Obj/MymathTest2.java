package Obj;
class MyMath2{
    long a,b;   //a,b는 인스턴스 변수
    long add(){ return a+b;}
    long subtract(){ return a-b;}
    long multiply(){ return a*b;}
    long divide(){ return a/b;}

    static long add(long a, long b){ return a+b;}   //a,b는 지역변수
    static long subtract(long a, long b){ return a-b;}
    static long multiply(long a, long b){ return a*b;}
    static double divide(double a, double b){ return a/b;}


}
class MymathTest2 {
    public static void main(String[] args){
        //클래스 메서드 호출, 인스턴스 생성없이 호출가능
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200.0,100.0));

        MyMath2 mm=new MyMath2();
        mm.a=200L;
        mm.b=100L;
        //인스턴스 메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
