import java.util.*;

public class sumPrimeNumbers{
    
    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        for(int i=2; i<=num/2; i++){
            if(isPrime(i)){
                if(isPrime(num - i)){
                    System.out.println((num - i) + " + " + i + " = " + num);
                }
            }
        }
        
    }
}