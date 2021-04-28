
import java.util.Scanner;
import java.util.StringTokenizer;

public class scanPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1010
        int n = sc.nextInt();
        System.out.println(n);

        // 1011
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        // 1012
        float f = sc.nextFloat();
        String str = String.format("%.6f", f);
        System.out.println(str);

        // 1013
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a + " " + b);

        // next()는 공백으로 구분 nextLine()은 줄바꿈으로 구분
        // 1015
        float f1 = sc.nextFloat();
        float f2 = Math.round(f1*100)/(float)100;
        String str = String.format("%.2f", f2);
        System.out.println(str);

        //1017
        int n = sc.nextInt();
        System.out.println(n + " " + n + " " + n);

        //1018
        String time = sc.nextLine();
        System.out.println(time);

        //1019
        String ymd = sc.nextLine();
        StringTokenizer st = new StringTokenizer(ymd,".");

        int[] arr = new int[3];
        int i=0;
        while(st.hasMoreTokens()) {
            arr[i]=Integer.parseInt(st.nextToken());
            i+=1;
        }
        String year = String.format("%04d", arr[0]);
        String month = String.format("%02d", arr[1]);
        String day = String.format("%02d", arr[2]);
        System.out.println(year+"."+month+"."+day);

        //1020
        String number = sc.nextLine();
        String front = number.substring(0, 6);
        String back = number.substring(7);
        System.out.println(front+back);

    }
}
