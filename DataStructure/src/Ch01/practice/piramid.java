package Ch01.practice;

public class piramid {

    static void spira(int n){
        for (int i=1 ; i <= n ; i++){
            for (int j=i ; j <n ; j++)
                System.out.print(" ");
            for (int k=0 ; k < (i-1)*2+1 ; k++)
                System.out.print("*");
            System.out.println("");
        }
    }

    static void npira(int n){
        for (int i=1 ; i <= n ; i++){
            for (int j=i ; j <n ; j++)
                System.out.print(" ");
            for (int k=0 ; k < (i-1)*2+1 ; k++)
                System.out.print(i%10);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("spira");
        spira(5);
        System.out.println("");

        System.out.println("npira");
        npira(5);
    }
}
