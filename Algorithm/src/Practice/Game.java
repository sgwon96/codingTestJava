package Practice;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        // 입력 받기 - n,m,x,y,d
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();

        // 방향에 따른 이동 좌표 설정 URDL
        int turn_count = 0;
        int count = 1;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};


        // 입력 받기 - 맵 데이터
        int[][] arr = new int[n][m];
        int[][] visit = new int[n][m];
        visit[x][y] = 1;

        for (int i = 0 ; i < n ; i++)
            for (int j = 0 ; j < m ; j++)
                arr[i][j] = sc.nextInt();

        while (true){

            // 왼쪽 방향으로 회전
            d = (d == 0) ? 3 : d-1 ;


            // 앞에 가보지 않은 칸이면 한 칸 전진
            int tx = x + dx[d];
            int ty = y + dy[d];
            if (visit[tx][ty] == 0 && arr[tx][ty] == 0){
                x = tx;
                y = ty;
                count += 1;
                turn_count = 0;
                visit[x][y] = 1;
                continue;
            } else
                turn_count += 1;

            // 네 방향을 모두 가본 칸이나 바다일 경우 한칸 뒤로 못갈 경우 종료
            if (turn_count == 4){
                tx = x - dx[d];
                ty = y - dy[d];
                if (arr[tx][ty] == 1)
                    break;
                else{
                    x = tx;
                    y = ty;
                    turn_count = 0;
                }
            }
        };

        System.out.println(count);
    }
}
