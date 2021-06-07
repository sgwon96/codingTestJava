package Ch02.practice;

import java.util.Scanner;

public class CopyArray {

    static void copy(int[] a, int[] b){
        for (int i = 0 ; i < a.length ; i++){
            a[i] = b[i];
        }
    }

    static void rcopy(int[] a, int[] b){
        for (int i = 0 ; i < a.length ; i++){
            a[i] = b[b.length-i-1];
        }
    }

    static void printArr(int[] a) {
        for (int i = 0 ; i < a.length ; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("배열 arrA의 요솟수 : ");
        int n = sc.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];
        int[] arrC = new int[n];

        for (int i = 0 ; i < arrA.length ; i++){
            System.out.print(i + "번 째 요소 : ");
            arrA[i] = sc.nextInt();
        }

        copy(arrB,arrA);
        rcopy(arrC,arrA);

        printArr(arrA);
        printArr(arrB);
        printArr(arrC);

    }
}
