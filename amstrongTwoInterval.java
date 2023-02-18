import java.util.*;

public class amstrongTwoInterval{
    public static void main (String[] args) {
        int start, end;
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        while(start <= end){
            int digit = 0;
            int ans = 0;
            int num = start;
            while(num > 0){
                num /= 10;
                digit++;
            }
            num = start;
            while(num > 0){
                int rem = num % 10;
                ans += Math.pow(rem,digit);
                num /= 10;
            }
            if(start == ans)
                System.out.print(ans + " ");
            
            start++;
        }
    }
}
