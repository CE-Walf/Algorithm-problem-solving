import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int Array[] = new int[N];
		int primeCount = 0;
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i =0; i <N;i++)
			Array[i] = Integer.parseInt(st.nextToken());
		
		for(int i =0; i < N; i++) {
			int count = 0;
			for(int j = 1; j <=Array[i]; j++) {
				if(Array[i] % j == 0 )
					count++;
			}
			if(count == 2) primeCount++;
			
		}
		System.out.println(primeCount);
	}
}