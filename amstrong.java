import java.util.*;

public class amstrong{
    
    public static int countFunc(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }
    
    public static void main (String[] args) {
        int num, cnt, temp, ans = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        cnt = countFunc(num);
        while(temp > 0){
            int rem = temp % 10;
            ans += Math.pow(rem,cnt);
            temp /= 10;
        }
        
        if(num == ans)
            System.out.println(num + " is a Amstrong Number ");
        else
            System.out.println(num + " is not a Amstrong Number");
    }
}
