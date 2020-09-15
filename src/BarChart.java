import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class BarChart {
    
    
    static SketchPadWindow win = new SketchPadWindow(500,100);
    static Pen p = new StandardPen(win);

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int value1, value2, value3, value4, highest = 0; 
        
        System.out.print("Enter value 1 of 4 > ");
        value1 = s.nextInt();
        
        System.out.print("Enter value 2 of 4 > ");
        value2 = s.nextInt();
        
        System.out.print("Enter value 3 of 4 > ");
        value3 = s.nextInt();
        
        System.out.print("Enter value 4 of 4 > ");
        value4 = s.nextInt();
        
        if (highest > 400){
            System.out.println("Error - number must be less than 400");
            return;
        }
        
        if(value1 >= value2)
            highest = value1;
        if(value2 > value1)
            highest = value2;
        if (highest < value3)
            highest = value3;
        if(highest < value4)
            highest = value4;

        
        win.setSize(500, highest * 2 + 200);
                
        
        p.setColor(Color.black);
        p.setWidth(5);
        p.up();
        p.move(-250,highest/-2 -7);
        p.down();
        p.move(250,highest/-2 -7);
        p.home();
        
        makeBar(p,-90,highest/-2,value1,Color.blue);
        makeBar(p,-30,highest/-2,value2,Color.red);
        makeBar(p,30,highest/-2,value3,Color.green);
        makeBar(p,90,highest/-2,value4,Color.black);
        
        
    }
    
    public static void makeBar(Pen p, int xloc, int yloc, int length, Color col){
        p.setWidth(10);
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(15);
        p.down();
        p.drawString(length + "");
        
    }
    
}
