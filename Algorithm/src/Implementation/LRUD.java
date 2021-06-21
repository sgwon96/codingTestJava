package Implementation;

import java.util.Scanner;

public class LRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력 받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] plans = sc.nextLine().split(" ");
        int x = 1 , y = 1;

        // L,R,U,D에 따른 이동 방향 설정
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        char[] move_types = {'L','R','U','D'};

        // 이동계획을 하나씩 확인 후 공간을 벗어나지 않으면 적
        for (String direction : plans ){

            char d = direction.charAt(0);
            int tx = x ,ty = y;

            for (int i = 0 ; i < move_types.length ; i++)
                if (move_types[i] == d){
                    tx += dx[i];
                    ty += dy[i];
                }

            if (0 < tx && tx < n+1 && 0 < ty && ty < n ){
                x = tx;
                y = ty;
            }

        }

        // 결과값 출력
        System.out.printf("%d %d",x,y);
    }
}
