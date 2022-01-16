import java.util.Scanner;
public class arr_tictactoe {


    public static void main(String[] args){
        char[][] array=new char[3][3];
        Scanner scanner=new Scanner(System.in);
        int x,y,cnt=0;

        System.out.println("[Tic Tac Toe GAME]");
        System.out.println("===========<주의사항>===========\n# 위치를 입력해주세요.");

        //배열 초기화
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            array[i][j]=' ';
        }

        //현재상태 출력
        System.out.println("=========<게임판 위치>===========");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j%3==0)
                    System.out.printf("%n---------------------------------%n");
                System.out.printf("[%d][%d]\t|\t",i,j);
            }

        }

        System.out.println("\n===============================");
        System.out.println("");

        while(true){
        //입력

            if(cnt==9){
                System.out.println("========게임이 종료되었습니다.=============");
                break;
            }

                    if(cnt%2==0){
                        System.out.printf("<선공(O)차례입니다.> ");
                        x=scanner.nextInt();
                        y=scanner.nextInt();

                        if(array[x][y]!=' '){
                            System.out.println("다른 자리를 선택해주세요.");
                        }
                        else{
                           array[x][y]='o';
                           cnt++;

                            //출력부분
                            for(int i=0;i<3;i++){
                                for(int j=0;j<3;j++){
                                    if(j%3==0)
                                        System.out.printf("%n-----------%n");
                                    System.out.printf("%c |\t",array[i][j]);
                                }

                            }
                            System.out.printf("\n");
                        }
                        System.out.printf("\n");
                    }

                    else {
                        System.out.printf("<후공(X)차례입니다.> ");
                        x = scanner.nextInt();
                        y = scanner.nextInt();

                        if (array[x][y] != ' ') {
                            System.out.println("다른 자리를 선택해주세요.");
                        }
                        else{
                            array[x][y] = 'x';
                            cnt++;
                            //출력부분

                            for(int i=0;i<3;i++){
                                for(int j=0;j<3;j++){
                                    if(j%3==0)
                                        System.out.printf("%n-----------%n");
                                    System.out.printf("%c |\t",array[i][j]);
                                }

                            }
                            System.out.printf("\n");
                        }
                        System.out.printf("\n");
                    }




        }


        //검사부분
        //가로
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(array[i][j]=='o')
                    break;
            }
        }
        //세로
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(array[j][i]=='o')
                    break;
            }
        }
    }



}

