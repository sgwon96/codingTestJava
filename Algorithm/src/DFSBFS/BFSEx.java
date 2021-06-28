package DFSBFS;

import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSEx {

    // 그래프, 방문 배열 선언
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // BFS 함수 선언
    public static void bfs(int start){

        Queue<Integer> q = new LinkedList<Integer>();

        // 방문 선언
        visited[start] = true;
        // 큐에 방문 노드 삽입
        q.offer(start);

        // 큐에 원소가 없을 때까지 반복
        while (!q.isEmpty()){
            // 큐에서 원소 꺼내기
            int x = q.poll();
            System.out.printf("%d ",x);
            // 연결된 원소들 큐에 넣고 방문처리
            for (int i = 0; i < graph.get(x).size() ; i++){
                int y = graph.get(x).get(i);
                if (!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0 ; i < 9 ; i++)
            graph.add(new ArrayList<Integer>());

        // 노드에 연결된 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);

    }




}
