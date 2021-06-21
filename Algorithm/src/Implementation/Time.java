package Implementation;


import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        // 정수 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        // 문자열 만든 후 3이 있으면 개수 더하기
        for (int h = 0 ; h <= n ; h++)
            for (int m = 0 ; m < 60 ; m++)
                for (int s = 0 ; s < 60 ; s++){
                    String str = Integer.toString(h) + Integer.toString(m) + Integer.toString(s);
                    if (str.contains("3"))
                        count += 1;
                }


        System.out.print(count);

    }



}
