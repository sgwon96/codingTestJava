package Ch01.practice;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");
        int line = sc.nextInt();
        for (int i = 0; i < line ; i++) {
            for (int j = 0; j < line; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
