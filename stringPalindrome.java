import java.util.*;

public class stringPalindrome{
    public static void main(String[] args){
        String str, revstr = "";
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        int strlen = str.length();
        for(int i=(strlen-1); i>=0; i--){
            revstr = revstr + str.charAt(i);
        }
        
        if(str.toLowerCase().equals(revstr.toLowerCase())){
        // if(str.equals(revstr)){
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}