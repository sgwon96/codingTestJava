package Ch01.practice;

import java.util.Scanner;

public class sum {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 부터 n까지의 합을 구합니다.");
        System.out.println("n을 입력하시오");
        int n = sc.nextInt();
        int sum = 0;
        String result = "";

        for (int i = 1 ; i <= n ; i ++){
            sum += i;
            result += i+" + ";
        }


        System.out.println(result+" = "+sum);

    }
}
