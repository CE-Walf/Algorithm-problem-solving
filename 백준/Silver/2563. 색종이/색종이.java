import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 색종이의 수
        int n = scanner.nextInt();

        // 색종이의 왼쪽 아래 꼭짓점 값을 입력 받자.
        // 그리고 가장 큰 가로값, 세로값을 흰 도화지의 길이로 할 것이다.
        int[][] colorPaper = new int[n][2];
        int maxX = 0, maxY = 0;
        for (int i = 0; i < n; i++){
            colorPaper[i][0] = scanner.nextInt();
            colorPaper[i][1] = scanner.nextInt();
            if (colorPaper[i][0] > maxX) maxX = colorPaper[i][0];
            if (colorPaper[i][1] > maxY) maxY = colorPaper[i][1];
        }

        // boolean 배열로, 도와지 배열을 만들자. 초기값은 false일 것이다.
        maxX = maxX + 10;
        maxY = maxY + 10;
        boolean[][] Paper = new boolean[maxX][maxY];

        // 삼중 반복문으로, 검정색으로 색칠된 부분만 true로 바꾸어주자.
        for (int i = 0; i < n; i++){
            for (int j = colorPaper[i][0]; j < colorPaper[i][0] + 10; j++){
                for(int k = colorPaper[i][1]; k < colorPaper[i][1] + 10; k++){
                    Paper[j][k] = true;
                }
            }
        }

        // true인 부분만 출력하면, 그것이 곧 검정 색종이의 넓이이다.
        int area = 0; // 검정색 색종이 넓이
        for (int i = 0; i < maxX; i++){
            for (int j = 0; j < maxY; j++){
                if(Paper[i][j]){
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}