package ShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node>{

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Node o) {
        if(this.distance < o.distance) {
            return -1;
        } else
            return 1;
    }
}

public class PQDijkstra {

    // 노드의 개수 n , 간선의 개수 m, 시작 노드 번호 start
    public static int n,m,start;
    // 각 노드에 연결되어 있는 노드 정보를 받는 그래프 선언
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    // 최단거리를 담는 그래프 선언
    public static int d[] = new int[10001];
    // 무한을 의미하는 값으로 10억 설정
    public static final int INF = (int) 1e9;

    public static void pqdijsktra(int start){
        // 시작 노드로 가기 위한 최단 경로는 0으로 설정하여, 큐에 삽입
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        d[start] = 0;
        // 큐에서 최단거리를 지닌 노드를 꺼내며 확인
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int dist = node.getDistance();
            int now = node.getIndex();
            // 한번 처리된 노드라면 무시
            if (d[now] < dist)
                continue;
            // 현재 노드와 연결된 다른 노드들을 확인
            for (int i = 0 ; i < graph.get(now).size() ; i++){
                int cost = d[now] + graph.get(now).get(i).getDistance();
                if (cost < d[graph.get(now).get(i).getIndex()]){
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n,m,start 입력
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        // 모든 간선 정보를 입력받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b, c));
        }

        // 최단 거리 테이블을 모두 무한으로 초기화
        Arrays.fill(d, INF);

        // 다익스트라 알고리즘을 수행
        pqdijsktra(start);

        // 모든 노드로 가기 위한 최단 거리를 출력
        for (int i = 1; i <= n; i++) {
            // 도달할 수 없는 경우, 무한(INFINITY)이라고 출력
            if (d[i] == INF) {
                System.out.println("INFINITY");
            }
            // 도달할 수 있는 경우 거리를 출력
            else {
                System.out.println(d[i]);
            }
        }
    }
}
