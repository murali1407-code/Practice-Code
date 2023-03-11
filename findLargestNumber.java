import java.util.*;

public class findLargestNumber{
    public static void main(String[] args){
        int n, len, largest;
        System.out.print("Enter the number of Array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        len = num.length;
        largest = num[0];
        for(int number : num){
            if(largest < number){
                largest = number;
            }
        }
        System.out.println("The Largest is: " + largest);
    }
}