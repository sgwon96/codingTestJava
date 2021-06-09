package Ch03.exercise;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] a, int key){
        int index = 0 ;
        for (int item : a){
            if(item == key){
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i  = 0 ; i < len ; i++){
            System.out.printf("X[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int target = sc.nextInt();

        int index = seqSearch(arr,target);



        System.out.printf(index == -1 ? "그 값의 요소가 없습니다." : "%d는 x[%d]에 있습니다", target, seqSearch(arr,target));

    }
}
