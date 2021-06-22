package Practice;

import java.util.Scanner;

public class LRUD {

    public static void main(String[] args) {

        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 제거
        String[] plan = sc.nextLine().split(" ");

        // 좌표 이동 거리 설정 (LRUD)
        int x = 1, y = 1;
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        char[] move_types = {'L','R','U','D'};

        // plan 에서 하나씩 공간에서 벗어나는지 안벗어나는지 확인 후 이동
        for (String move : plan){

            int tx = 0 , ty = 0;
            char moveDirection = move.charAt(0);

            for (int i = 0; i < move_types.length ; i++){
                if (moveDirection == move_types[i]){
                    tx = x + dx[i];
                    ty = y + dy[i];
                }
            }

            if (0 < tx && tx < n+1 && 0 < ty && ty < n+1){
                x = tx;
                y = ty;
            }

        }

        // 결과 값 출력
        System.out.printf("%d %d",x,y);


    }

}
