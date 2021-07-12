package graph;

import java.util.Scanner;

public class DisjointSet {

    // 노드의 개수(v), 간선의 개수(e), 부모 노드(parent)
    public static int v;
    public static int e;
    public static int[] parent = new int[100001];

    // find 연산
    public static int find(int x){
        if (parent[x] == x){
            return x;
        } else {
            return parent[x] = find(parent[x]);
        }
    }

    // Union 연산
    public static void union(int x, int y){
        x = find(x);
        y = find(y);
        if (x < y){
            parent[y] = x;
        } else{
            parent[x] = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // v,e 입력 받기
        v = sc.nextInt();
        e = sc.nextInt();

        // 자기 자신으로 부모 노드 초기화
        for (int i = 1 ; i <= v ; i++){
            parent[i] = i;
        }

        // 노드를 입력 받은 후 Union 연산을 각각 실행
        for (int i = 0 ; i < e ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a,b);
        }

        // 각 원소가 속한 집합 출력
        System.out.print("각 원소가 속한 집합: ");
        for (int i = 1 ; i <= v ; i++){
            System.out.printf("%d ", find(i));
        }

        System.out.println("");

        // 부모 테이블 출력
        System.out.print("부모 테이블: ");
        for (int i = 1 ; i <= v ; i++){
            System.out.printf("%d ", parent[i]);
        }


    }








}
