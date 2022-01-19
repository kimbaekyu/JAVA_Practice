package Obj;

public class TvTest4 {
    public static void main(String[] args){
        //객체 배열 사용
        Tv[] tvArr=new Tv[3];   //길이가 3인 Tv 객체 배열

        //Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
        for(int i=0;i<tvArr.length;i++){
            tvArr[i]=new Tv();
            tvArr[i].channel=i+10;
        }

        for(int i=0;i<tvArr.length;i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel%n",i);
            tvArr[i].print();
        }
    }
}
