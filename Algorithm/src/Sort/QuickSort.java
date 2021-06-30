package Sort;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end){

        // 원소가 1개인 경우 종료
        if (start >= end) return;
        // pivot, left, right 설정
        int pivot = start;
        int left = start+1;
        int right = end;

        while (left <= right){
            // 왼쪽에서 pivot 보다 큰 원소 찾기
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // 오른쪽에서 pivot 보다 작은 원소 찾기
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 엇갈리면 피벗과 작은 원소 교환
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 left 원소와 right 원소 교환
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 오른쪽, 왼쪽에서 각각 퀵정렬 실행
        quickSort(arr, start, right-1);
        quickSort(arr, right + 1, end);

    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(arr, 0, n - 1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
