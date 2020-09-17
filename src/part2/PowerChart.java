
package part2;

import java.util.Scanner;

public class PowerChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int exponent, answer = 0;
        
        System.out.print("Enter a number between 0 and 10: ");
        exponent = s.nextInt();
        
        
        System.out.println("X\t\t2^X");
        System.out.println("=\t\t====");
        
        for (int i = 0; i <= exponent; i++) {
            answer = (int)Math.pow(2,i);
            System.out.format("%d\t\t%d\n",i,answer);
            
        }
        
        
        
    }
    
}
