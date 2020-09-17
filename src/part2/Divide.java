
package part2;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        int num1, num2, big, small,answer, remainder;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        num1 = s.nextInt();
        
        System.out.print("Enter the second number: ");
        num2 = s.nextInt();
        
        big = Math.max(num1, num2);
        small = Math.min(num1,num2);
        
        answer = big/small;
        remainder = big%small;
        
        System.out.format("%d divided by %d is %dr%d\n", big, small, answer, remainder);
               
    }
    
}
