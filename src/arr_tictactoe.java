import java.util.Scanner;
import java.util.Arrays;
public class arr_tictactoe {


    public static void main(String[] args){
        String[][] array=new String[3][3];
        Scanner scanner=new Scanner(System.in);
        int x,y,turnCnt=0;//x좌표, y좌표,선후결정,게임판종료여부
        //가로 저장
        String[] xArr1=new String[3];String[] xArr2=new String[3];String[] xArr3=new String[3];//가로 저장
        //세로 저장
        String[] yArr1=new String[3];String[] yArr2=new String[3];String[] yArr3=new String[3];//세로 저장
        //대각선 저장
        String[] dArr1=new String[3];String[] dArr2=new String[3];
        //3개 일치여부판단
        boolean xcheck1=false;boolean xcheck2=false;boolean xcheck3=false;
        boolean ycheck1=false;boolean ycheck2=false;boolean ycheck3=false;
        boolean dcheck1=false;boolean dcheck2=false;


        System.out.println("[Tic Tac Toe GAME]");
        System.out.println("===========<주의사항>===========\n# 위치를 입력해주세요.");

        //배열 초기화
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            array[i][j]=" ";
        }

        //현재상태 출력
        System.out.printf("=========<게임판 위치>===========");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j%3==0)
                    System.out.printf("%n---------------------------------%n");
                System.out.printf("[%d][%d]\t|\t",i,j);
            }

        }

        System.out.printf("\n===============================");
        System.out.println();

        while(true){
        //입력

            if(turnCnt==9){
                System.out.println("========게임이 종료되었습니다.=============");
                break;
            }

            else if(turnCnt%2==0){
                System.out.printf("<선공(O)차례입니다.> ");
                x=scanner.nextInt();
                y=scanner.nextInt();

                if(array[x][y]!=" "){
                    System.out.println("다른 자리를 선택해주세요.");
                }
                else{
                    array[x][y]="o";
                    turnCnt++;

                    //출력부분
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(j%3==0)
                                System.out.printf("%n-----------%n");
                            System.out.printf("%s |\t",array[i][j]);
                        }

                    }
                    System.out.printf("\n");

                System.out.printf("\n");
                //검사부분
                //가로
                for(int i=0;i<3;i++){
                    xArr1[i]=array[0][i];
                    xArr2[i]=array[1][i];
                    xArr3[i]=array[2][i];
                }
                //세로
                for(int i=0;i<3;i++){
                    yArr1[i]=array[i][0];
                    yArr2[i]=array[i][1];
                    yArr3[i]=array[i][2];
                }
                //대각선
                for(int i=0;i<3;i++){
                    dArr1[i]=array[i][i];
                    dArr2[i]=array[i][2-i];
                }
                //검사: 저장된 값과 비교
                //가로 검사


                for(int i=0;i<2;i++){
                    if(xArr1[i]!=" "){
                        String tmp=xArr1[i];
                        if(tmp==xArr1[i+1]){
                            xcheck1=true;

                        }
                        else{
                            xcheck1=false;
                            break;
                        }
                    }
                    else{
                        xcheck1=false;
                        break;
                    }

                }
                //System.out.println("xArr1:"+xcheck1);


                for(int i=0;i<2;i++){
                    if(xArr2[i]!=" "){
                        String tmp=xArr2[i];
                        if(tmp==xArr2[i+1]){
                            xcheck2=true;
                        }
                        else{
                            xcheck2=false;
                            break;
                        }
                    }
                    else{
                        xcheck2=false;
                        break;
                    }
                }
                //System.out.println("xArr2:"+xcheck2);

                for(int i=0;i<2;i++){
                    if(xArr3[i]!=" "){
                        String tmp=xArr3[i];
                        if(tmp==xArr3[i+1]){
                            xcheck3=true;
                        }
                        else{
                            xcheck3=false;
                            break;
                        }
                    }
                    else{
                        xcheck3=false;
                        break;
                    }
                }
                //System.out.println("xArr3:"+xcheck3);

                //세로 검사


                for(int i=0;i<2;i++){
                    if(yArr1[i]!=" "){
                        String tmp=yArr1[i];
                        if(tmp==yArr1[i+1]){
                            ycheck1=true;
                        }
                        else{
                            ycheck1=false;
                            break;
                        }
                    }
                    else{
                        ycheck1=false;
                        break;
                    }
                }
                //System.out.println("yArr1:"+ycheck1);

                for(int i=0;i<2;i++){
                    if(yArr2[i]!=" "){
                        String tmp=yArr2[i];
                        if(tmp==yArr2[i+1]){
                            ycheck2=true;
                        }
                        else{
                            ycheck2=false;
                            break;
                        }
                    }
                    else{
                        ycheck2=false;
                        break;
                    }
                }
                //System.out.println("yArr2:"+ycheck2);

                for(int i=0;i<2;i++){
                    if(yArr3[i]!=" "){
                        String tmp=yArr3[i];
                        if(tmp==yArr3[i+1]){
                            ycheck3=true;
                        }
                        else{
                            ycheck3=false;
                            break;
                        }
                    }
                    else{
                        ycheck3=false;
                        break;
                    }
                }
                //System.out.println("yArr3:"+ycheck3);
                //대각선 검사
                for(int i=0;i<2;i++){
                    if(dArr1[i]!=" "){
                        String tmp=dArr1[i];
                        if(tmp==dArr1[i+1]){
                            dcheck1=true;
                        }
                        else{
                            dcheck1=false;
                            break;
                        }
                    }
                    else{
                        dcheck1=false;
                        break;
                    }
                }
                //System.out.println("dArr1:"+dcheck1);

                for(int i=0;i<2;i++){
                    if(dArr2[i]!=" "){
                        String tmp=dArr2[i];
                        if(tmp==dArr2[i+1]){
                            dcheck2=true;
                        }
                        else{
                            dcheck2=false;
                            break;
                        }
                    }
                    else {
                        dcheck2=false;
                        break;
                    }
                }
                //System.out.println("dArr2:"+dcheck2);

                if(xcheck1||xcheck2||xcheck3||ycheck1||ycheck2||ycheck3||dcheck1||dcheck2==true){
                    System.out.println("================");
                    System.out.println("O가 승리하였습니다.");
                    System.out.println("================");
                    break;
                }
                }
            }

            else{
                System.out.printf("<후공(X)차례입니다.> ");
                x = scanner.nextInt();
                y = scanner.nextInt();

                if (array[x][y] != " ") {
                    System.out.println("다른 자리를 선택해주세요.");
                }
                else{
                    array[x][y] = "x";
                    turnCnt++;
                    //출력부분

                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            if(j%3==0)
                                System.out.printf("%n-----------%n");
                            System.out.printf("%s |\t",array[i][j]);
                        }

                    }
                    System.out.printf("\n");

                System.out.printf("\n");
                    //검사부분
                    //가로
                    for(int i=0;i<3;i++){
                        xArr1[i]=array[0][i];
                        xArr2[i]=array[1][i];
                        xArr3[i]=array[2][i];
                    }
                    //세로
                    for(int i=0;i<3;i++){
                        yArr1[i]=array[i][0];
                        yArr2[i]=array[i][1];
                        yArr3[i]=array[i][2];
                    }
                    //대각선
                    for(int i=0;i<3;i++){
                        dArr1[i]=array[i][i];
                        dArr2[i]=array[i][2-i];
                    }
                    //검사: 저장된 값과 비교
                    //가로 검사


                    for(int i=0;i<2;i++){
                        if(xArr1[i]!=" "){
                            String tmp=xArr1[i];
                            if(tmp==xArr1[i+1]){
                                xcheck1=true;

                            }
                            else{
                                xcheck1=false;
                                break;
                            }
                        }
                        else{
                            xcheck1=false;
                            break;
                        }

                    }
                    //System.out.println("xArr1:"+xcheck1);


                    for(int i=0;i<2;i++){
                        if(xArr2[i]!=" "){
                            String tmp=xArr2[i];
                            if(tmp==xArr2[i+1]){
                                xcheck2=true;
                            }
                            else{
                                xcheck2=false;
                                break;
                            }
                        }
                        else{
                            xcheck2=false;
                            break;
                        }
                    }
                    //System.out.println("xArr2:"+xcheck2);

                    for(int i=0;i<2;i++){
                        if(xArr3[i]!=" "){
                            String tmp=xArr3[i];
                            if(tmp==xArr3[i+1]){
                                xcheck3=true;
                            }
                            else{
                                xcheck3=false;
                                break;
                            }
                        }
                        else{
                            xcheck3=false;
                            break;
                        }
                    }
                    //System.out.println("xArr3:"+xcheck3);

                    //세로 검사


                    for(int i=0;i<2;i++){
                        if(yArr1[i]!=" "){
                            String tmp=yArr1[i];
                            if(tmp==yArr1[i+1]){
                                ycheck1=true;
                            }
                            else{
                                ycheck1=false;
                                break;
                            }
                        }
                        else{
                            ycheck1=false;
                            break;
                        }
                    }
                    //System.out.println("yArr1:"+ycheck1);

                    for(int i=0;i<2;i++){
                        if(yArr2[i]!=" "){
                            String tmp=yArr2[i];
                            if(tmp==yArr2[i+1]){
                                ycheck2=true;
                            }
                            else{
                                ycheck2=false;
                                break;
                            }
                        }
                        else{
                            ycheck2=false;
                            break;
                        }
                    }
                    //System.out.println("yArr2:"+ycheck2);

                    for(int i=0;i<2;i++){
                        if(yArr3[i]!=" "){
                            String tmp=yArr3[i];
                            if(tmp==yArr3[i+1]){
                                ycheck3=true;
                            }
                            else{
                                ycheck3=false;
                                break;
                            }
                        }
                        else{
                            ycheck3=false;
                            break;
                        }
                    }
                    //System.out.println("yArr3:"+ycheck3);
                    //대각선 검사
                    for(int i=0;i<2;i++){
                        if(dArr1[i]!=" "){
                            String tmp=dArr1[i];
                            if(tmp==dArr1[i+1]){
                                dcheck1=true;
                            }
                            else{
                                dcheck1=false;
                                break;
                            }
                        }
                        else{
                            dcheck1=false;
                            break;
                        }
                    }
                    //System.out.println("dArr1:"+dcheck1);

                    for(int i=0;i<2;i++){
                        if(dArr2[i]!=" "){
                            String tmp=dArr2[i];
                            if(tmp==dArr2[i+1]){
                                dcheck2=true;
                            }
                            else{
                                dcheck2=false;
                                break;
                            }
                        }
                        else {
                            dcheck2=false;
                            break;
                        }
                    }
                    //System.out.println("dArr2:"+dcheck2);

                    if(xcheck1||xcheck2||xcheck3||ycheck1||ycheck2||ycheck3||dcheck1||dcheck2==true){
                        System.out.println("================");
                        System.out.println("X가 승리하였습니다.");
                        System.out.println("================");
                        break;
                    }
                }
            }




        }
        /*
        //검사부분
        //가로
        for(int i=0;i<3;i++){
            xArr1[i]=array[0][i];
            xArr2[i]=array[1][i];
            xArr3[i]=array[2][i];
        }
        //세로
        for(int i=0;i<3;i++){
            yArr1[i]=array[i][0];
            yArr2[i]=array[i][1];
            yArr3[i]=array[i][2];
        }
        //대각선
        for(int i=0;i<3;i++){
            dArr1[i]=array[i][i];
            dArr2[i]=array[i][2-i];
        }
        //검사: 저장된 값과 비교
        //가로 검사


        for(int i=0;i<2;i++){
            if(xArr1[i]!=" "){
                String tmp=xArr1[i];
                if(tmp==xArr1[i+1]){
                    xcheck1=true;
                }

            }
            else{
                xcheck1=false;
                break;
            }
        }
        System.out.println("xArr1:"+xcheck1);


        for(int i=0;i<2;i++){
            if(xArr2[i]!=" "){
                String tmp=xArr2[i];
                if(tmp==xArr2[i+1]){
                    xcheck2=true;
                }

            }
            else{
                xcheck2=false;
                break;
            }
        }
        System.out.println("xArr2:"+xcheck2);

        for(int i=0;i<2;i++){
            if(xArr3[i]!=" "){
                String tmp=xArr3[i];
                if(tmp==xArr3[i+1]){
                    xcheck3=true;
                }

            }
            else{
                xcheck3=false;
                break;
            }
        }
        System.out.println("xArr3:"+xcheck3);

        //세로 검사


        for(int i=0;i<2;i++){
            if(yArr1[i]!=" "){
                String tmp=yArr1[i];
                if(tmp==yArr1[i+1]){
                    ycheck1=true;
                }

            }
            else{
                ycheck1=false;
                break;
            }
        }
        System.out.println("yArr1:"+ycheck1);

        for(int i=0;i<2;i++){
            if(yArr2[i]!=" "){
                String tmp=yArr2[i];
                if(tmp==yArr2[i+1]){
                    ycheck2=true;
                }

            }
            else{
                ycheck2=false;
                break;
            }
        }
        System.out.println("yArr2:"+ycheck2);

        for(int i=0;i<2;i++){
            if(yArr3[i]!=" "){
                String tmp=yArr3[i];
                if(tmp==yArr3[i+1]){
                    ycheck3=true;
                }

            }
            else{
                ycheck3=false;
                break;
            }
        }
        System.out.println("yArr3:"+ycheck3);
        //대각선 검사
        for(int i=0;i<2;i++){
            if(dArr1[i]!=" "){
                String tmp=dArr1[i];
                if(tmp==dArr1[i+1]){
                    dcheck1=true;
                }

            }
            else{
                dcheck1=false;
                break;
            }
        }
        System.out.println("dArr1:"+dcheck1);

        for(int i=0;i<2;i++){
            if(dArr2[i]!=" "){
            String tmp=dArr2[i];
                if(tmp==dArr2[i+1]){
                    dcheck2=true;
                }
            }
            else {
                dcheck2=false;
                break;
            }
        }
        System.out.println("dArr2:"+dcheck2);

        if(xcheck1||xcheck2||xcheck3||ycheck1||ycheck2||ycheck3||dcheck1||dcheck2==true){
            break;
        }

        가로세로대각선 정보저장 출력
        System.out.println("xArr");
        System.out.println(Arrays.toString(xArr1));
        System.out.println(Arrays.toString(xArr2));
        System.out.println(Arrays.toString(xArr3));
        System.out.println("yArr");
        System.out.println(Arrays.toString(yArr1));
        System.out.println(Arrays.toString(yArr2));
        System.out.println(Arrays.toString(yArr3));
        System.out.println("dArr");
        System.out.println(Arrays.toString(dArr1));
        System.out.println(Arrays.toString(dArr2));
        */

    }



}

