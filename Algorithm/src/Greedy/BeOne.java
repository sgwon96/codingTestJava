package Greedy;

import java.util.Scanner;

public class BeOne {

    public static void main(String[] args) {

        //입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while ( n != 1){
            count += 1;
            if (n%k == 0)
                n /= k;
            else
                n -= 1;
        }

        System.out.print(count);
    }
}
