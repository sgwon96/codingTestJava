package ShortestPath;

import java.util.Scanner;

public class FutureCity {

    public static final int INF = (int) 1e9;
    public static int n,m,x,k;
    public static int[][] graph = new int[501][501];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n,m 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();

        // 거리 그래프 INF로 초기화
        for (int i = 1 ; i < 501 ; i++){
            for (int j = 1 ; j < 501 ; j++){
                graph[i][j] = INF;
            }
        }

        // 자기 자신에 대한 거리 0으로 초기화
        for (int i = 0; i<= n ; i++){
            graph[i][i] = 0;
        }

        //거리, 간선에대한 정보를 입력받아 그래프에 삽입
        for (int i = 0 ; i < m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        // x,k 입력 받기
        x = sc.nextInt();
        k = sc.nextInt();

        // 플로이드 워셜 알고리즘 수행
        for (int k = 1 ; k <= n ; k++)
            for (int i = 1 ; i<=n ; i++)
                for (int j = 1 ; j<=n ; j++)
                    graph[i][j] = Math.min(graph[i][j],graph[i][k]+graph[k][j]);

        // 결과값 출력
        int distance = graph[1][k] + graph[k][x];
        if (distance >= INF)
            System.out.println(-1);
        else {
            System.out.println(distance);
        }
    }
}
