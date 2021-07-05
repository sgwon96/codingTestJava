package DynamicProgramming;

import java.util.Scanner;

public class MakeOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // x 입력 받기
        int x = sc.nextInt();

        // Bottom Up
        int[] dp = new int[10000];
        for (int i = 2 ; i <= x ; i ++){
            // x에서 1을 뺀다
            dp[i] = dp[i-1] + 1 ;
            // x가 2로 나누어 떨어짐
            if (i%2 == 0)
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            // x가 3으로 나누어 떨어짐
            if (i%3 == 0)
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            // x가 5로 나누어 떨어짐
            if (i%5 == 0)
                dp[i] = Math.min(dp[i],dp[i/5]+1);
        }

        // 결과값 출력
        System.out.println(dp[x]);

    }
}
