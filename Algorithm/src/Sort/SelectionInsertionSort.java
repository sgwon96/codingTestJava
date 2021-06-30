package Sort;

public class SelectionInsertionSort {

    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++){
            int min_index = i; // 가장 작은 원소 인덱스
            for (int j = i+1 ; j < arr.length ; j++ )
                if (arr[j] < arr[min_index])
                    min_index = j;
            // 스왑
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void InsertionSort(int[] arr){
        for (int i = 1 ; i < arr.length ; i ++){
            for (int j = i ; j > 0 ; j--){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                // 자기보다 작은 데이터를 만나면 멈춤
                else break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,5,9,0,3,1,6,2,4,8};
        int[] arr2 = {7,5,9,0,3,1,6,2,4,8};
        SelectionSort(arr);
        InsertionSort(arr2);
        for (int i = 0 ; i < arr.length ; i++)
            System.out.printf("%d ", arr[i]);
        System.out.println("");
        for (int i = 0 ; i < arr2.length ; i++)
            System.out.printf("%d ", arr2[i]);
    }
}