package Ch01.practice;

public class sum99 {

    public static void main(String[] args) {
        System.out.println("셈표");
        System.out.printf("    |");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        System.out.println("");
        System.out.println("  --+---------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d |", i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i + j);
            System.out.println();
        }
    }
}
