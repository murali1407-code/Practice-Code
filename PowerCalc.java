import java.util.*;

public class PowerCalc{
    public static void main(String[] args){
        int base, expo, ans = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base Value: ");
        base = sc.nextInt();
        System.out.print("Enter a Exponent Value: ");
        expo = sc.nextInt();
        
        while(expo > 0){
            ans *= base; 
            --expo;
        }
        System.out.println("Answer is " + ans);
    }
}
