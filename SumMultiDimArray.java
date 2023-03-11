import java.util.*;

public class SumMultiDimArray{
    public static void main (String[] args) {
        int rows, column, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows in the Array  : ");
        rows = sc.nextInt();
        System.out.print("Enter the Column in the Array: ");
        column = sc.nextInt();
        int[][] numArray = new int[rows][column];
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                numArray[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                sum += numArray[i][j];
            }
        }
            System.out.println("Array Sum Value is: " + sum);
    }
} 