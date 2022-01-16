public class arr_lotto {
    public static void main(String[] args){
        int[] ball=new int[45];
        for(int i=0;i<ball.length;i++){
            ball[i]=i+1;
        }
        int tmp=0;//임시
        int j=0;//랜덤 인덱스 저장

        for(int i=0;i<6;i++){//앞부분부터 총 6개 변경
            j=(int)(Math.random()*45);
            tmp=ball[i];
            ball[i]=ball[j];
            ball[j]=tmp;
        }
        System.out.printf("추첨 번호: ");
        for(int i=0;i<6;i++){//앞부분부터 총 6개 변경
            System.out.printf("%2d ",ball[i]);
        }
    }
}
