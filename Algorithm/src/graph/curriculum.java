package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class curriculum {

    // 노드 v, 간선 e, 진입 차수 indegree, 연결된 간선정보 graph
    public static int v ;
    public static int e ;
    public static int[] indegree =  new int[10001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void topologySort(){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // 처음 시작할 때 진입 차수가 0인 노드를 큐에 삽입
        for (int i = 0 ; i < v ; i ++){
            if (indegree[i] == 0){
                q.offer(i);
            }
        }

        // 큐가 빌 때까지 반복
        while (!q.isEmpty()){
            int now = q.poll();
            result.add(now);
            for (int i = 0 ; i < graph.get(now).size() ; i++){
                indegree[graph.get(now).get(i)] -= 1;
                // 새롭게 진입차수가 0이 되는 노드를 큐에 삽
                if (indegree[graph.get(now).get(i)] == 0) {
                    q.offer(graph.get(now).get(i));
                }
            }
        }

        // 위상 정렬을 수행한 결과 출력
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }


}
