package Obj;

public class Tv {
    //tv 속성(멤버변수)
    String color;
    boolean power;
    int channel;
    //tv기능(메서드)
    void power()    {power=!power;}
    void channelUp()    {
        System.out.println("CH UP");
        ++channel;
    }
    void channelDown()  {
        System.out.println("CH DOWN");
        --channel;
    }

}
