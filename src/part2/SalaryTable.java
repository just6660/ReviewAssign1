
package part2;

import java.util.Scanner;
import java.text.NumberFormat;


public class SalaryTable {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        
        int oldsalary = 40000, newsalary = 0, raise = 0, year = 0;
        
        
        System.out.format("YEAR\t\tOLD SALARY\t\tRAISE\t\t\tNEW SALARY\n");
        System.out.println("====\t\t==========\t\t=====\t\t\t==========");
        
        for (int i = 1; i < 11; i++) {
            year = i;
            if(year==1){
                System.out.format("%d\t\t------\t\t\t$40,000\t\t\t$40,000\n",year);
            }
            else{
                raise = (int) (oldsalary*0.03); 
                
                newsalary = oldsalary+raise;
                System.out.format("%d\t\t$%s\t\t\t$%s\t\t\t$%s\n",year,nf.format(oldsalary),nf.format(raise),nf.format(newsalary));
                oldsalary = newsalary;
                
            }
            
            
        }
        
        
    }
    
}
