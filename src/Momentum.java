
import java.util.Scanner;


public class Momentum {

    public static void main(String[] args) {
        
        double momentum, mass, velocity;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the object's mass in kg >");
        mass = s.nextDouble();
        
        System.out.print("Enter the object's velocity in m/s >");
        velocity = s.nextDouble();
        
        momentum = mass * velocity;
        
        System.out.println(String.format("The object's momentum is %.2f kg * m/s", momentum));
    }
    
}
