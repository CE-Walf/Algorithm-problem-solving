import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        getAnswer(0,n);
        System.out.println(sb);
    }

    public static void getAnswer(int output, int n) {
        if (n == 0) {
            if (isPrime(output)) {
                sb.append(output).append("\n");
                return;
            }
        }
        for (int i=0; i<10; i++) {
            int nextDigit = output*10+i;
            if (isPrime(nextDigit)) 
                getAnswer(nextDigit, n-1);
        }
    }
    
    
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++)
            if(num % i == 0)
                return false;
                
        return true;
    }
    
  
    
}