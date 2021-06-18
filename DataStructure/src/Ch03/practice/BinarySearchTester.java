package Ch03.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[]x = new int[num];

        System.out.println("오름차순으로 입력하시오. ");

        System.out.print("X[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1 ; i < num; i++){
            do{
                System.out.printf("X[%d] : ", i);
                x[i] = sc.nextInt();
            } while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x,key);

        if (idx < 0)
            System.out.printf("그 값의 요소가 없지만 X[%d]에 삽입됩니다.", -idx-1);
        else
            System.out.printf("%d는 X[%d]에 있습니다.", key, idx);
    }
}
