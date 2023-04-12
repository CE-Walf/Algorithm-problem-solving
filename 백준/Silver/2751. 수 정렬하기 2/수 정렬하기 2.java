import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arrlist= new ArrayList<>();
		
		for(int i = 0; i < N ; i++) 
			arrlist.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(arrlist);

		for(int i : arrlist)
			sb.append(i).append('\n');
		
		System.out.println(sb);
	}
}