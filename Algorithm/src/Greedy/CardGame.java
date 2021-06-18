package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {

        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0 ; i < m ; i++)
            for (int j = 0 ; j < n ; j++)
                arr[i][j] = sc.nextInt();

        // 각 줄마다 최소값을 뽑은후 큰 값 저장
        int min = 0;
        for (int i = 0 ; i < m ; i ++){
            Arrays.sort(arr[i]);
            if (arr[i][0] > min)
                min = arr[i][0];
        }

        // 최대값 출력
        System.out.print(min);
    }
}
