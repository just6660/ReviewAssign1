
package part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        final double wage = 15.00;
        final double overtime = 22.50;
        int reghours, overtimehours, totalhours;
        double totalpay, overtimepay, regpay;
        double totalreg = 0, totalovertime = 0, grandtotal = 0;
        
        for (int i = 1; i < 6; i++) {
            while(true){
                System.out.format("Enter hours worked for Employee %d:", i);
            
                try{
                    totalhours = s.nextInt();  
                }catch(Exception e){
                    System.out.println("Enter a whole number");
                    return;               
                }
            
                if(totalhours<=70 && totalhours >=1)break;   
                else
                    System.out.println("Enter a whole number between 1 and 70");
            }
        
            overtimehours = totalhours - 40;
            if(overtimehours < 0) overtimehours = 0;
            reghours = totalhours - overtimehours;
        
            overtimepay = overtimehours * overtime;
            totalovertime += overtimepay;
            regpay = reghours * wage;
            totalreg += regpay;
        
            totalpay = overtimepay + regpay; 
        
            System.out.format("Regular Pay:\t$%.2f\n", regpay);
            System.out.format("Overtime Pay:\t$%.2f\n", overtimepay);
            System.out.format("Total Pay:\t$%.2f\n", totalpay);
            System.out.println("------------------------------------------");
            
        }
        
        grandtotal = totalovertime + totalreg;
        
        System.out.format("Regular Pay Total:\t$%.2f\n", totalreg);
        System.out.format("Overtime Pay Total:\t$%.2f\n", totalovertime);
        System.out.format("Grand Total:\t$%.2f\n", grandtotal);
        
        
        
        
        
        
        
        
        
    }
    
}
