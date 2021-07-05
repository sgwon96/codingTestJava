package DynamicProgramming;

import java.util.Scanner;

public class AntWarrior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n,arr 입력 받기
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        // 바텀업
        int[] dp = new int[10000];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for (int i = 2 ; i < n ; i ++)
            dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]);

        // 결과 출력
        System.out.println(dp[n-1]);


    }
}
