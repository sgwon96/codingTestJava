package Ch03.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhyscData {

        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<Ch03.practice.PhysExamSearch.PhyscData> VISION_ORDER
                = new Ch03.practice.PhysExamSearch.PhyscData.VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<Ch03.practice.PhysExamSearch.PhyscData> {
            @Override
            public int compare(Ch03.practice.PhysExamSearch.PhyscData d1, Ch03.practice.PhysExamSearch.PhyscData d2) {
                return (d1.vision > d2.vision) ? 1 :
                        (d1.vision < d2.vision) ? -1 : 0;
            }
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ch03.practice.PhysExamSearch.PhyscData[] x = {
                new Ch03.practice.PhysExamSearch.PhyscData("이나령",162,0.3),
                new Ch03.practice.PhysExamSearch.PhyscData("유지훈", 168, 0.4),
                new Ch03.practice.PhysExamSearch.PhyscData("김한결", 169, 0.8),
                new Ch03.practice.PhysExamSearch.PhyscData("홍준기", 171, 1.5),
                new Ch03.practice.PhysExamSearch.PhyscData("유호연", 173, 0.7),
                new Ch03.practice.PhysExamSearch.PhyscData("이수현", 174, 1.2),
                new Ch03.practice.PhysExamSearch.PhyscData("전서현", 175, 2.0),
        };
        System.out.print("시력이 몇인 사람을 찾고 있나요 ? : ");
        double vision = sc.nextDouble();
        int idx = Arrays.binarySearch(
                x,
                new Ch03.practice.PhysExamSearch.PhyscData("", 0, vision),
                Ch03.practice.PhysExamSearch.PhyscData.VISION_ORDER
        );

        if ( idx < 0 )
            System.out.println("요소가 없습니다.");
        else {
            System.out.printf("X[%d]에 있습니다. \n", idx);
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
