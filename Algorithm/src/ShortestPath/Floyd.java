package ShortestPath;

import java.util.Arrays;
import java.util.Scanner;

public class Floyd {

   public static final int INF = (int) 1e9;
   public static int n,m;
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
            int c = sc.nextInt();
            graph[a][b] = c;
        }

        // 플로이드 워셜 알고리즘 수행
        for (int k = 1 ; k <= n ; k++)
            for (int i = 1 ; i<=n ; i++)
                for (int j = 1 ; j<=n ; j++)
                    graph[i][j] = Math.min(graph[i][j],graph[i][k]+graph[k][j]);

        // 수행된 결과를 출력
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                // 도달할 수 없는 경우, 무한(INFINITY)이라고 출력
                if (graph[a][b] == INF) {
                    System.out.print("INFINITY ");
                }
                // 도달할 수 있는 경우 거리를 출력
                else {
                    System.out.print(graph[a][b] + " ");
                }
            }
            System.out.println();
        }
    }
}
