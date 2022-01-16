public class arr_cnt {
    public static void main(String[] args){
        int[] arr=new int[10];
        int[] count=new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10);
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(i+"의 갯수: "+count[i]);
        }
    }
}
