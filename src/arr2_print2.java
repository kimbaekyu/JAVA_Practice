public class arr2_print2 {
    public static void main(String[] args){
        int[][] score={
                {100,100,100}
                ,{20,20,20}
                ,{30,30,30}
                ,{40,40,40}
                ,{50,50,50}
        };
        int korTotal=0,engTotal=0,mathTotal=0,sum=0;
        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("===============================");
        for(int i=0;i<score.length;i++){
            korTotal+=score[i][0];
            engTotal+=score[i][1];
            mathTotal+=score[i][2];
            for(int j=0;j<score[i].length;j++){

            }
        }
        for(int i=0;i<score.length;i++){
            System.out.printf("%3d  ",i+1);
            for(int j=0;j<score[i].length;j++){
                System.out.printf("%3d  ",score[i][j]);

                sum+=score[i][j];
            }
            System.out.printf("%3d  %3.1f%n",sum,(float)sum/score[i].length);
            sum=0;
        }
        System.out.printf("총점: %3d  %3d  %3d",korTotal,engTotal,mathTotal);


    }
}
