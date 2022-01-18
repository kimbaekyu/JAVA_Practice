import java.util.Scanner;
public class MultiArrBingo_me {
    public static void main(String[] args){
        //입력받은 숫자의 위치를 user배열을 이용해 빙고판을 맞췃을 때 V로 보여주게 수정
        final int SIZE=5;
        int x=0,y=0,num=0;
        char[][] user=new char[SIZE][SIZE];
        int[][] bingo=new int[SIZE][SIZE];
        Scanner scanner=new Scanner(System.in);

        //배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                bingo[i][j]=i*SIZE+j+1;
            }
        }

        //배열에 저장된 값을 뒤섞는다.(shuffle)
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                x=(int)(Math.random()*SIZE);
                y=(int)(Math.random()*SIZE);
                //bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
                int tmp=bingo[i][j];
                bingo[i][j]=bingo[x][y];
                bingo[x][y]=tmp;
            }
        }
        //초기빙고판 출력
        System.out.println("랜덤 빙고판 답지================");
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                System.out.printf("%2d|",bingo[i][j]);
            }
            System.out.println();
        }
        System.out.println("================================");

        do{
            System.out.println("유저 빙고판");
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    System.out.printf("%2c|",user[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>",SIZE*SIZE);
            String tmp=scanner.nextLine(); //입력받은 내용을 tmp에 저장
            num=Integer.parseInt(tmp); //입력받은 문자열(tmp)를 숫자로 변환

            //입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
            outer://2중 반복문을 벗어나기위한 장치
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    if(bingo[i][j]==num){
                        user[i][j]='V';
                        break outer;//2중 반복문을 벗어난다.
                    }
                }
            }

        }while(num!=0);
    }
}
