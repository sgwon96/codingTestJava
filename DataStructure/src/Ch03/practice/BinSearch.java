package Ch03.practice;

public class BinSearch {

    static int binSearch(int[] arr, int target){

        int startidx = 0;
        int endidx = arr.length-1;
        int mididx = (startidx+endidx)/2;

        System.out.print("   |");
        for ( int i = 0 ; i < arr.length; i++  )
            System.out.printf("%3d", i);
        System.out.println("");
        System.out.println("---+--------------------");

        do {
            String[] rangeStr = new String[endidx+1];
            for (int i = 0 ; i < rangeStr.length ; i++)
                rangeStr[i] = "";
            rangeStr[startidx] = "<-";
            rangeStr[endidx] = "->";
            rangeStr[mididx] = "+";

            System.out.print("   |");
            for (String str : rangeStr)
                System.out.printf("%3S", str);
            System.out.println("");

            System.out.printf(" %d |", mididx);
            for (int item : arr)
                System.out.printf("%3d",item);
            System.out.println("");

            if (arr[mididx] == target)
                return mididx;
            else if (arr[mididx] > target){
                endidx = mididx - 1 ;
                mididx = (startidx+endidx)/2;
            } else {
                startidx = mididx + 1 ;
                mididx = (startidx+endidx)/2;
            }
        } while (startidx <= endidx);

        return -1;

    }

    static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                do {
                    if (a[pc-1] != key)
                        return pc;
                } while (pc > pl);
                return pc;

            }
            else if(a[pc] < key)
                pl = pc + 1 ;
            else
                pr = pc -1 ;
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,9};
        int target = 6;
        int targetIdx = binSearch(arr, target);
        System.out.printf( targetIdx == -1 ?" 값을 찾을 수 없습니다. ":"%d는 X[%d]에 있습니다. \n", target, targetIdx);

        int[] arr2 = {1,3,5,7,7,7,8,9};
        int key = 7;
        int keyIdx = binSearchX(arr2, arr.length, key);
        System.out.printf( keyIdx == -1 ?" 값을 찾을 수 없습니다. ":"%d는 X[%d]에 있습니다. \n", key, keyIdx);

    }

}
