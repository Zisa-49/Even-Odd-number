
package practice2;
import java.util.Scanner;
public class Odd_Even_number {
    public static void main(String[]args){
        System.out.print("Enter the integer:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        
        if (num % 2 == 0)
            System.out.print(num+ " is even number.");
        else
            System.out.print(num+ " is odd number");
    }
    
}
