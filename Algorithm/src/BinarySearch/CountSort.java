package BinarySearch;

import java.util.Scanner;

public class CountSort {
    public static final int MAX_VALUE = 1000001;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 부품 입력 받기
        int n = sc.nextInt();
        int[] parts = new int[MAX_VALUE];
        for (int i = 0 ; i < n ; i++)
            parts[sc.nextInt()] = 1;

        // 견적서 입력 받기
        int m = sc.nextInt();
        int[] orders = new int[m];
        for (int i = 0 ; i < m ; i++)
            orders[i] = sc.nextInt();

        // 탐색 후 출력
        for (int i = 0 ; i < m ; i++){
            if (parts[orders[i]] == 1)
                System.out.print("yes ");
            else
                System.out.print("no ");
        }


    }
}
