package DynamicProgramming;

import java.util.Scanner;

public class FloorConstruction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정수 N을 입력받기
        int n = sc.nextInt();

        // 바텀업
        int[] dp = new int[10001];
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 0 ; i < n+1 ; i++)
            dp[n] = 2*dp[n-2] + dp[n-1];


        // 출력
        System.out.println(dp[n]%796796);
    }
}
