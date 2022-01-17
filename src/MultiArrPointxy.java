import java.util.Scanner;
public class MultiArrPointxy {
    public static void main(String[] args){
        //이 코드에서 사용된 알고리즘 ->좌표입력받음->shipboard[x-1][y-1]에 좌표있으면 O,없으면 X를
        //board[x][y]에 정보를 저장(초기에 board는 공백임)
        final int SIZE=10;
        int x=0, y=0;

        char[][] board=new char[SIZE][SIZE];
        byte[][] shipBoard={
                //1 2 3 4 5 6 7 8 9
                {0,0,0,0,0,0,1,0,0}, //1
                {1,1,1,1,0,0,1,0,0}, //2
                {0,0,0,0,0,0,1,0,0}, //3
                {0,0,0,0,0,0,1,0,0}, //4
                {0,0,0,0,0,0,0,0,0}, //5
                {1,1,0,1,0,0,0,0,0}, //6
                {0,0,0,1,0,0,0,0,0}, //7
                {0,0,0,1,0,0,0,0,0}, //8
                {0,0,0,0,0,1,1,1,0} //9
        };
        //1행에 행번호를, 1열에 열번호를 저장
        for(int i=0;i<SIZE;i++){
            board[0][i]=board[i][0]=(char)(i+'0');
        }
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.printf("좌표를 입력하세요.(종료는 00)>");
            String input=scanner.nextLine();

            if(input.length()==2){
                x=input.charAt(0)-'0';
                y=input.charAt(1)-'0';

                if(x==0&&y==0)
                    break;
            }

            if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            //실제 shipboard의 좌표와 board좌표간의 차이 고려
            board[x][y]=shipBoard[x-1][y-1]==1?'O':'X';

            //배열 board의 내용을 화면에 출력한다.
            for(int i=0;i<SIZE;i++){
                System.out.println(board[i]);//char형이라 출력가능

            }
            System.out.println();

        }
    }
}
