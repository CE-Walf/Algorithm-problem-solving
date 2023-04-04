import java.util.Arrays;
import java.util.Scanner; 

public class Main {
   public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      
     int T = scanner.nextInt();
     int Array[] = new int[10];
     
     for(int i = 0; i < T; i++) {
    	 for(int j =0; j < 10; j++) {
    		 Array[j] = scanner.nextInt();
    	 }
    	 Arrays.sort(Array);
    	 System.out.println(Array[7]);
     }
     
   }
}