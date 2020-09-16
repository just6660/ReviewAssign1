package part1;


import java.util.Scanner;


public class PizzaCost1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        final double labour = 1.5;
        final double heat = 0.75;
        double basicprice, size, toppingprice, total;
        int toppings;
        
        System.out.print("Enter the size of your pizza in inches > ");
        size = s.nextDouble();
        basicprice =  size * 0.5;
        
        System.out.print("Enter the number of toppings >");
        toppings = s.nextInt();
        toppingprice = toppings * 0.75;
        
        total = toppingprice + basicprice + labour + heat;
        
        System.out.println(String.format("The price of your pizza is $%.2f.", total));
    }
    
}
