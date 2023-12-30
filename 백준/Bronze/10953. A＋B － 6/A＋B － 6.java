import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수
        StringTokenizer st;
        String strAB;

        for(int i = 0; i < T; i++){
            strAB = sc.next();
            st = new StringTokenizer(strAB,",");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(A+B);
        }
    }
}