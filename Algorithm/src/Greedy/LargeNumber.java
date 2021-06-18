package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // m,n,k 입력 받기
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 배열 입력 받기
        int[] arr = new int[m];
        for (int i = 0 ; i < m ; i++)
            arr[i] = sc.nextInt();

        // 배열 정렬 후 최대값, 두번째 최대값 찾기
        Arrays.sort(arr);
        int max = arr[m-1];
        int secondMax = arr[m-2];

        // 최대값을 n번 더하고 k번 에서는 두번째 최대값 더하기
        int result = 0;
        for (int i = 0 ; i < n ; i++)
            result += (i%k == 0 && i != 0) ? secondMax : max;

        // 수열을 사용하여 더해지는 횟수 구해서 구하기
        int result2 = 0;
        int count = (n / (k+1)) * k ;
        count += n%(k+1);
        result2 = count * max + (n-count) * secondMax;

        // 결과값 출력
        System.out.println(result);
        System.out.print(result2);

    }
}
