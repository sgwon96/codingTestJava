package Implementation;

import java.util.Scanner;

public class Knight {

    public static void main(String[] args) {

        // 좌표 입력 받기
        Scanner sc = new Scanner(System.in);
        String location = sc.nextLine();
        char charX = location.charAt(0);
        char charY = location.charAt(1);

        // 좌표를 int로 바꾸기
        int x = 0, y =0;
        char[] xLocate = {'a','b','c','d','e','f','g','h'};
        for (int i = 0 ; i < xLocate.length ; i++)
            if (xLocate[i] == charX)
                x = i+1;
        y = charY - '0';

        // 이동 방향 설정
        int[] dx = {2,2,-2,-2,1,-1,1,-1};
        int[] dy = {1,-1,1,-1,2,2,-2,-2};
        int count = 0;

        // 이동 후 체스판을 벗어나지 않으면 경우의 수 추
        for (int i = 0 ; i < dx.length ; i++){
            int tx = x + dx[i];
            int ty = y + dy[i];
            if ( 0 < tx && tx < 9 && 0 < ty && ty < 9)
                count += 1;
        }

        // 경우의 수 출력
        System.out.print(count);

    }
}
