import java.util.Scanner;
public class arr_morse {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("문자를 모스부호로 변환하는 프로그램====%n");
        String source="";
        String[] morse={".-","-...","-.-.","-..",".","..-.","--."
                        ,"....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-"
                        ,"..-","...-",".--","-..-","-.--","--.."};
        String result="";
        System.out.printf("영어를 입력해주세요[대문자만]: ");
        source=scanner.nextLine();
        for(int i=0;i<source.length();i++){
            result+=morse[source.charAt(i)-'A'];
        }
        System.out.println("Source: "+source);
        System.out.println("Morse: "+result);
    }
}
