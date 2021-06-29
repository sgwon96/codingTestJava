package DFSBFS;

import java.util.Scanner;

public class DrinkingWater {

    // n,m, 그래프 선언
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    //dfs 함수
    public static boolean dfs(int x, int y){
        // 범위를 벗어나면 false
        if (x < 0 || x > n-1 || y < 0 || y > m-1)
            return false;

        // 방문하지 않았으면 방문하고 상,하,좌,우 dfs 호출
        if (graph[x][y] == 0){
            graph[x][y] = 1;
            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }

        // 이미 방문한 노드라면 false 반환
        return false;
    }

    public static void main(String[] args) {

        // n,m 입력 받기
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 제거

        // 그래프 입력 받기
        for (int i = 0 ; i < n ; i++){
            String str = sc.nextLine();
            for (int j = 0 ; j < m ; j++)
                graph[i][j] = str.charAt(j) - '0';
        }

        // result 값 선언
        int result = 0;
        // 모든 그래프 노드에 대해 dfs
        for (int i = 0 ; i < n ; i ++)
            for (int j = 0 ; j < m ; j++)
                if (dfs(i,j))
                    result += 1;

        System.out.println(result);
    }

}
