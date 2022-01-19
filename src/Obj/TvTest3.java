package Obj;

public class TvTest3 {
    public static void main(String[] args){
        Tv t1=new Tv();
        Tv t2=new Tv();
        System.out.println("T1");
        t1.print();
        System.out.println("T2");
        t2.print();
        t2=t1;//t1이 저장하고 있는 값(주소)을 t2에 저장

        t1.channel=7;
        System.out.println("T1");
        t1.print();
        System.out.println("T2");
        t2.print();
    }
}
