package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Grade implements Comparable<Grade>{

    private String name;
    private int score;

    public Grade(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Grade o) {
        if (this.score < o.score)
            return -1;
        else
            return 1;
    }
}

public class GradeSort {
    public static void main(String[] args) {

        // 개수 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 배열 입력 받기
        List<Grade> grades = new ArrayList<Grade>();

        for (int i = 0 ; i < n ; i++){
            String name = sc.next();
            int score = sc.nextInt();
            grades.add(new Grade(name,score));
        }

        Collections.sort(grades);

        for (int i = 0; i < grades.size(); i++)
            System.out.print(grades.get(i).getName() + " ");


    }

}
