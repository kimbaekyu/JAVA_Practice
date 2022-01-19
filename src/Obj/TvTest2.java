package Obj;

public class TvTest2 {
    public static void main(String[] args){
        Tv t1=new Tv();
        Tv t2=new Tv();
        System.out.println("T1");
        t1.print();
        System.out.println("T2");
        t2.print();

        t1.channel=7;
        System.out.println("T1");
        t1.print();
        System.out.println("T2");
        t2.print();
    }
}
