public class MultiArrMatrix {
    public static void main(String[] args){
        int[][] m1={
                {1,2,3},
                {4,5,6}
        };
        int[][] m2={
                {1,2},
                {3,4},
                {5,6}
        };
        final int ROW=m1.length;    //m1 행 길이
        final int M1_COL=m1[0].length; //m1 열 길이
        final int M2_ROW=m2.length; //m2 행 길이
        final int COL=m2[0].length; //m2 열 길이

        int[][] m3=new int[ROW][COL];
        //행렬 m1 출력
        System.out.println("행렬 M1 출력");
        for(int i=0;i<ROW;i++){
            for(int j=0;j<M1_COL;j++){
                System.out.printf("%3d",m1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //행렬 m2 출력
        System.out.println("행렬 M2 출력");
        for(int i=0;i<M2_ROW;i++){
            for(int j=0;j<COL;j++){
                System.out.printf("%3d",m2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //행렬곱 m1 X m2 의 결과를 m3에 저장
        for(int i=0;i<ROW;i++){
            for(int j=0;j<ROW;j++){
                for(int k=0;k<M2_ROW;k++){
                    m3[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        //행렬 m3 출력
        System.out.println("행렬 곱 결과 출력");
        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                System.out.printf("%3d",m3[i][j]);
            }
            System.out.println();
        }
    }
}
