import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> roster = new HashSet<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            roster.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (roster.contains(name)) {
                answer.add(name);
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for (String s : answer) {
            System.out.println(s);
        }
    }
}