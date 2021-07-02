package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UptoDown {

    public static void main(String[] args) {

        // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Integer[] arr = new Integer[n];

        for (int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0 ; i < n ; i++)
            System.out.print(arr[i]+" ");

    }
}
