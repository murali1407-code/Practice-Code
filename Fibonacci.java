import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        int num; 
        int firstTer = 0; 
        int secondTer = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(firstTer < num){
            System.out.print(firstTer + ", ");
            
            int nextTer = firstTer + secondTer;
            firstTer = secondTer;
            secondTer = nextTer;
        }
        
    }
}
