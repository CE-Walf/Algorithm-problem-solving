import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());

        String word = br.readLine();

        long answer = 0;

        for (int i = 0; i < word.length(); i++){
            int intVal = word.charAt(i) - 'a' + 1;
            answer += (long) (intVal * Math.pow(31, i));
        }

        System.out.println(answer);

    }
}