import java.util.Scanner;

public class Main{
    
    static boolean palindrom_search(int value){
        String valString = Integer.toString(value);
        int cnt = 0;
        
        for(int i = 0; i <= valString.length()/2-1; i++){
            if(valString.charAt(i) == valString.charAt(valString.length()-1-i))
                cnt++;
        }
        
        if(cnt == valString.length()/2)
            return true;
        else 
            return false;
        
    }
    
    static boolean isPrime(int num){
        if(num <= 1)
            return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++)
            if(num % i == 0) return false;
        
       return true;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int i = N;
        while(true){
            if(palindrom_search(i) == true){
                if(isPrime(i) == true){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
        
    }
}