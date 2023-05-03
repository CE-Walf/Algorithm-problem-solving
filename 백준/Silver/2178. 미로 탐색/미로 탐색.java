import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int N;
    static int M;
    static int maze[][];
    static boolean visited[][];
    static int[] goX = {0, -1, 1, 0} ;
    static int[] goY = {1, 0, 0, -1};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        M = scanner.nextInt();
        maze = new int[N][M];
        visited = new boolean[N][M];
        visited[0][0] = true;
        
        for(int i = 0; i < N; i++){
            String mazeLine = scanner.next();
            for(int j = 0; j < M; j++)
                maze[i][j] = mazeLine.charAt(j) - '0';
        }
        bfs(0,0);
        System.out.println(maze[N-1][M-1]);
        
    }
    
    static void bfs(int a, int b){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {a, b});
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            
            for(int i = 0 ; i < 4; i++){
                int nextX = nowX + goX[i];
                int nextY = nowY + goY[i];
                
                if(nextX == -1 || nextX >= N || nextY == -1 || nextY >= M)
                    continue;
                if(visited[nextX][nextY] || maze[nextX][nextY] == 0)
                    continue;
                
                q.add(new int[] {nextX, nextY});
                maze[nextX][nextY] = maze[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
                
            }
            
        }
        
    }
}