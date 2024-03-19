import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            BigInteger num = new BigInteger("0");
            int numLength = 0;

            while(true){
                numLength++;
                num = num.multiply(new BigInteger("10")).add(new BigInteger("1"));
                if(num.mod(new BigInteger(String.valueOf(n))).equals(new BigInteger("0"))){
                    System.out.println(numLength);
                    break;
                }
            }
        }


    }
}