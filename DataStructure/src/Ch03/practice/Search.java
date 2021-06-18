package Ch03.practice;

import java.util.Scanner;

public class Search {

    static int seqSearch(int[] arr, int key){
      for(int i = 0 ; i < arr.length ; i++)
          if (arr[i] == key)
              return i;
      return -1;
    };

    static int binSearch(int[] arr, int key){
        int startIndex = 0 ;
        int endIndex = arr.length-1 ;

        do {
            int middleIndex = (startIndex + endIndex)/2 ;
            if (arr[middleIndex] == key)
                return middleIndex;
            else if( arr[middleIndex] > key)
                endIndex = middleIndex - 1;
            else
                startIndex = middleIndex + 1;
        } while (startIndex <= endIndex);

        return -1;
    }

    static int searchIdx(int[] a, int n, int key, int[] idx){

        int cnt = 0;
        for (int i = 0 ; i < n ; i++)
            if (a[i] == key)
                idx[cnt++] = i;
        return cnt;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int[] arridx = new int[len];

        for (int i = 0 ; i < len ; i++){
            System.out.printf("X[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int target = sc.nextInt();

        System.out.println("Sequential Search");
        int index = binSearch(arr,target);
        System.out.printf( index == -1 ? "그 값의 요소가 없습니다. ":"%d는 X[%d]에 있습니다. \n", target, index);

        System.out.println("Binary Search");
        int binIndex = seqSearch(arr,target);
        System.out.printf( binIndex == -1 ? "그 값의 요소가 없습니다. ":"%d는 X[%d]에 있습니다. \n", target, index);

        System.out.println("searchIdx");
        int searchIndex = searchIdx(arr,arr.length,target,arridx);
        System.out.printf( binIndex == 0 ? "그 값의 요소가 없습니다. ":"%d는 %d개 있습니다. \n", target, index);

        for ( int i = 0 ;i < searchIndex ; i++)
            System.out.println(arridx[i]);

    }

}
