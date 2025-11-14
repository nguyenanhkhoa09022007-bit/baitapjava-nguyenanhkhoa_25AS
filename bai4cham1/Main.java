
package bai4cham1;

public class Main {
    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder :"
        +" radius="+c1.getRadius()
        +", height="+c1.getHeight()
        +", color="+c1.getcolor()
        +", base area="+c1.getArea()
        +", volume="+c1.getVolume());   
        
        Cylinder c2 = new Cylinder(2.0);
        System.out.println("Cylinder :"     
        +" radius="+c2.getRadius()
        +", height="+c2.getHeight()
        +", color="+c2.getcolor()
        +", base area="+c2.getArea()
        +", volume="+c2.getVolume());

        Cylinder c3 = new Cylinder(2.0,5.0);
        System.out.println("Cylinder :"
        +" radius="+c3.getRadius()
        +", height="+c3.getHeight()
        +", color="+c3.getcolor()
        +", base area="+c3.getArea()
        +", volume="+c3.getVolume());
        }
}
    
