public class arr_change {
    public static void main(String[] args){
        int[] numArr={0,1,2,3,4,5,6,7,8,9};
        System.out.printf("섞기 전 numArr:\t");
        for(int i=0;i<numArr.length;i++)
            System.out.printf("%d",numArr[i]);

        for(int i=0;i<100;i++){
            int n=(int)(Math.random()*10);//0-9 사이 인덱스
            int tmp=numArr[0];
            numArr[0]=numArr[n];
            numArr[n]=tmp;
        }

        System.out.printf("%n섞은 후 numArr:\t");
        for(int i=0;i<numArr.length;i++)
            System.out.printf("%d",numArr[i]);
    }
}
