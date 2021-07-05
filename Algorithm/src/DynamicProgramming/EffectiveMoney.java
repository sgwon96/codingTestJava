package DynamicProgramming;

import java.util.*;


public class EffectiveMoney {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // n,m 화폐 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0 ; i < n ; i++)
            coins[i] = sc.nextInt();

        // 바텀업
        int[] dp = new int[m + 1];
        Arrays.fill(dp, 10001);

        dp[0] = 0;
        for (int i = 0; i < n; i++)
            for (int j = coins[i]; j <= m; j++)
                if (dp[j - coins[i]] != 10001)
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);

        // 결과 출력 방법이 없으면 -1
        if (dp[m] == 10001)
            System.out.println(-1);
        else
            System.out.println(dp[m]);


    }
}
