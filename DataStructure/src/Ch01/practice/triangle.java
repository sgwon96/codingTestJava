package Ch01.practice;

import java.util.Scanner;

public class triangle {

    static void triangleLB(int a){
        for (int i=1 ; i <= a ; i++){
            for (int j=0 ; j < i ; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

    static void triangleLU(int a){
        for (int i=1 ; i <= a ; i++){
            for (int j=i ; j <= a ; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

    static void triangleRU(int a){
        for (int i=0 ; i < a ; i++){
            for (int j=0 ; j < i ; j++)
                System.out.print(" ");
            for (int k=i ; k < a ; k++)
                System.out.print("*");
            System.out.println("");
        }
    }

    static void triangleRB(int a){
        for (int i=0 ; i < a ; i++){
            for (int j=0 ; j <= i ; j++)
                System.out.print("*");
            for (int k=i ; k < a ; k++)
                System.out.print(" ");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("triangleLb");
        triangleLB(5);
        System.out.println("");

        System.out.println("triangleLu");
        triangleLU(5);
        System.out.println("");

        System.out.println("triangleRu");
        triangleRU(5);
        System.out.println("");

        System.out.println("triangleRB");
        triangleRB(5);
        System.out.println("");
    }
}
