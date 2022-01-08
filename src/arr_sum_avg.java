public class arr_sum_avg {
    public static void main(String[] args){
        int[] Score={100,88,100,100,90};
        int sum=0;
        float average=0f;

        for(int i=0;i<Score.length;i++)
            sum+=Score[i];

        average=sum/(float)Score.length;
        System.out.printf("Sum: %d, Average: %.1f",sum,average);
    }
}
