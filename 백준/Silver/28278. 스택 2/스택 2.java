import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    int X = Integer.parseInt(st.nextToken());
                    stack.push(X);
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? -1 : stack.pop());
                    sb.append("\n");
                    break;
                case 3:
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0);
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek());
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}