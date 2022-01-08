import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=0;
        String tmp;
        System.out.printf("두자리 정수를 하나 입력해주세요:");
        tmp=scanner.nextLine();
        num=Integer.parseInt(tmp);
        System.out.println("입력내용: "+tmp);
        System.out.printf("num=%d%n",num);
    }
}
