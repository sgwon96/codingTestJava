package Ch01.practice;

import java.util.Scanner;

public class gauss {

    static int sumof(int a, int b){
        int result = b*(b+1)/2-a*(a-1)/2;
        if (result > 0)
            return result;
        else
            return -1 * result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 부터 n까지의 합을 구합니다.");
        System.out.println("n을 입력하시오");
        int n = sc.nextInt();
        int sum = (n+1)*n/2;
        System.out.println(sum);
        System.out.println(sumof(3,5));
        System.out.println(sumof(6,4));
    }
}
