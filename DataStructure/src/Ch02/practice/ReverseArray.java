package Ch02.practice;

import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        printArr(a);
        for (int i = 0; i<a.length/2; i++) {
            System.out.println("");
            System.out.printf("a[%d]와 a[%d]를 교환합니다.", i, a.length - i - 1);
            System.out.println("");
            swap(a, i, a.length - i - 1);
            printArr(a);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static void printArr(int[] a) {
        for (int i = 0 ; i < a.length ; i++)
            System.out.print(a[i] + " ");
    }

    static int sumOf(int[] a){
        int sum = 0;
        for (int i = 0 ; i < a.length ; i++)
            sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++ ){
            System.out.print(i+"번 째 요소 : ");
            arr[i] = sc.nextInt();
        }

        reverse(arr);
        System.out.println(sumOf(arr));


    }

}
