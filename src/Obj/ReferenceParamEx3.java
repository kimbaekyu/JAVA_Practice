package Obj;

class ReferenceParamEx3 {
    //클래스 메서드 활용
    public static void main(String[] args){
        int[] arr={3,2,1,6,5,4};

        printArr(arr);  //배열의 모든 요소를 출력
        sortArr(arr);   //배열을 정렬
        printArr(arr);
        System.out.println("sum="+sumArr(arr)); //배열의 총합을 출력
    }
    static void printArr(int[] arr){
        System.out.printf("[");
        for(int i:arr){
            System.out.printf(i+",");
        }
        System.out.printf("]");
    }
    static void sortArr(int[] arr){

        int tmp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    static int sumArr(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
