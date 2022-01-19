package Obj;

public class CardTest {
    public static void main(String[] args){
        //인스턴스 변수와 클래스 변수(static)의 차이: 저장공간 공유 유무
        System.out.println("Card.width ="+Card.width);
        System.out.println("Card.height="+Card.height);

        Card c1=new Card();
        c1.number=7;    c1.kind="Heart";    c1.objName="c1";
        c1.print();

        Card c2=new Card();
        c2.number=4;    c2.kind="Spade";    c2.objName="c2";
        c2.print();
        System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
        c1.width=50;    c1.height=80;
        c1.print();
        c2.print();

    }
}
