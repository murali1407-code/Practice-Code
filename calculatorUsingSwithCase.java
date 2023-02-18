import java.util.*;

public class calculatorUsingSwithCase{
    public static void main (String[] args) {
        char operator;
        double num1, num2, result;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a First Value: ");
        num1 = sc.nextInt();
        System.out.print("Enter a Second Value: ");
        num2 = sc.nextInt();
        
        System.out.println("Enter a operator: +, -, *, /");
        operator = sc.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
} 