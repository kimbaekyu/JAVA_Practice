public class sum_ex {
    public static void main(String[] args){
        int i=1;int sum=0;
        while(true){


            if((i%2)!=0) sum+=i;
            else sum-=i;
            if(sum>=100){
                System.out.printf("i:%d sum:%d%n",i,sum);
                break;
            }
            i++;

        }

    }
}
