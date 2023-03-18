import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        String nBinary = "";
        for(int i = 0; i < T; i++){
            int n = scanner.nextInt();
            nBinary = Integer.toBinaryString(n);
            
            for(int j = 0; j < nBinary.length(); j++){
                if(nBinary.charAt(nBinary.length()-j-1) == '1')
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}