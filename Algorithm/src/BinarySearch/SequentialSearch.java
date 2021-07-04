package BinarySearch;


import java.util.Scanner;

public class SequentialSearch {

    public static int sequential_search(int n, String target, String[] arr){
        // 각 원소를 하나씩 확인하여 값을 찾으면 인덱스 반환
        for (int i = 0 ; i < n ; i++)
            if (arr[i].equals(target))
                return i+1;

        // 못 찾으면 -1 반환
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("생성할 원소 개수를 입력한 다음 한 칸은 띄고 찾을 문자열을 입력하세요. ");
        int n = sc.nextInt();
        String target = sc.next();
        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세여. 구분은 띄어쓰기 한 칸으로 합니다");

        String[] arr = new String[n];

        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.next();

        System.out.println(sequential_search(n,target,arr));


    }

}
