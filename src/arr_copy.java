public class arr_copy {
    public static void main(String args[]){
        int[] arr=new int[5];
        int[] newArr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(i+1);
            System.out.printf("arr[i] %d\t",arr[i]);
        }
        System.out.println();
        for(int i=0;i<newArr.length;i++)
            System.out.printf("newArr[i] %d\t",newArr[i]);
        System.out.println();
        System.arraycopy(arr,0,newArr,0,arr.length);

        System.out.println("After-------------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[i] %d\t",arr[i]);
        }
        System.out.println();
        for(int i=0;i<newArr.length;i++)
            System.out.printf("newArr[i] %d\t",newArr[i]);

    }

}
