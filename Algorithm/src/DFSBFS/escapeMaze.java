package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

public class escapeMaze {
    // n,m, 그래프 선언
    public static int n,m;
    public static int[][] graph = new int[200][200];

    // 상,하,좌,우로 이동하는 좌표 설정
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};

    // bfs
    public static int  bfs(int x, int y){
        // 큐 선언
        Queue<Node> q = new LinkedList<Node>();

        // 시작 노드 큐에 넣기
        q.offer(new Node(x,y));

        // 큐가 빌 때 까지
        while (!q.isEmpty()){
            // 큐에서 노드를 꺼내 현재 좌표 확인
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            // 4방향 모두 확인
            for (int i = 0 ; i < 4 ; i++){

                // 다음 좌표
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위에서 벗어나면 무시
                if (nx < 0 || nx > n-1 || ny < 0 || ny > m-1)
                    continue;
                // 괴물이 있으면 무시
                if (graph[nx][ny] == 0)
                    continue;

                // 괴물이 없으면 이전 노드까지의 거리 + 1 , 큐에 넣기
                if (graph[nx][ny] == 1){
                    graph[nx][ny] = graph[x][y] + 1;
                   q.offer(new Node(nx,ny));
                }
            }

        }
        // 마지막 칸 거리 반환
        return graph[n-1][m-1];
    }

    public static void main(String[] args) {
        // 입력 받기
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

        // 결과 값 출력
        System.out.println(bfs(0,0));

    }
}
