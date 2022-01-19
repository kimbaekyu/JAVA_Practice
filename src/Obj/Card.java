package Obj;

public class Card {
    static int width=100;
    static int height=250;
    String kind;
    String objName;
    int number;
    void print(){
        System.out.printf("%s은(는) %s, %d이며 크기는 (%d, %d)%n",objName,kind,number,width,height);
    }


}
