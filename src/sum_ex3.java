public class sum_ex3 {
    public static void main(String[] args){
        int res=0; int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
            res+=sum;

        }
        System.out.printf("res:%d%n",res);
    }
}
