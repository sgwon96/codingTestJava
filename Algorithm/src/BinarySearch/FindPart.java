package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindPart {

    public static int binary_search(int[] arr, int target, int start, int end){
        if (start > end) return -1;
        int mid = (start+end)/2;
        if (arr[mid] == target) return mid;
        else if(arr[mid] < target) return binary_search(arr,target,mid+1,end);
        else return binary_search(arr,target,start,mid-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 부품 입력 받기
        int n = sc.nextInt();
        int[] parts = new int[n];
        for (int i = 0 ; i < n ; i++)
            parts[i] = sc.nextInt();

        // 견적서 입력 받기
        int m = sc.nextInt();
        int[] orders = new int[m];
        for (int i = 0 ; i < m ; i++)
            orders[i] = sc.nextInt();

        // 이진 탐색을 수행하기 위해 사전에 정렬 수행
        Arrays.sort(parts);

        // 탐색 후 출력
        for (int i = 0 ; i < m ; i++){
            if (binary_search(parts,orders[i],0,n) == -1)
                System.out.print("no ");
            else
                System.out.print("yes ");
        }
    }

}
