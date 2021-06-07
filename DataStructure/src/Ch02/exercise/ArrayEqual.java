package Ch02.exercise;

import java.util.Scanner;

public class ArrayEqual {

    static boolean equals(int[] a, int[] b){

        if (a.length != b.length)
            return false;

        for (int i = 0 ; i < a.length ; i++){
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열 arrA의 요솟수 : ");
        int n = sc.nextInt();

        int[] arrA = new int[n];

        for (int i = 0 ; i < arrA.length ; i++){
            System.out.print(i + "번 째 요소 : ");
            arrA[i] = sc.nextInt();
        }

        System.out.print("배열 arrB의 요솟수 : ");
        int nb = sc.nextInt();

        int[] arrB = new int[nb];

        for (int i = 0 ; i < arrB.length ; i++){
            System.out.print(i + "번 째 요소 : ");
            arrB[i] = sc.nextInt();
        }

        System.out.println("배열 A와 배열 B는 같습니까 ?");
        System.out.println(equals(arrA,arrB) ? "같습니다" : "다릅니다");

    }
}
