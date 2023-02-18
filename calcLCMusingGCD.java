import java.util.*;

public class calcLCMusingGCD{
    public static void main(String[] args){
        int n1, n2, gcd = 1, lcm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First value: ");
        n1 = sc.nextInt();
        System.out.print("Enter a Second Value: ");
        n2 = sc.nextInt();
        
        for(int i=1; i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0)
                gcd = i;
        }
        System.out.println("GCD value is: " + gcd);
        lcm = (n1*n2) / gcd;
        System.out.println("LCM value is: " + lcm);
    }
}