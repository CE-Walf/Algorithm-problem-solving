import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int nArray[] = new int[n];
		for(int i =0; i < n; i++)
			nArray[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(nArray);
		
		for(int i : nArray)
			sb.append(i).append('\n');
		
		System.out.println(sb);
	}
}