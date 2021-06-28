package DFSBFS;

import java.util.*;

public class DFSEx {

    // 그래프, 방문 array 선언
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // dfs 함수 선언
    public static void dfs(int x){
        visited[x] = true;
        System.out.println(x);

        for (int i = 0 ; i < graph.get(x).size() ; i++){
            int y = graph.get(x).get(i);
            if (!visited[y])
                dfs(y);
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

        dfs(1);
    }




}