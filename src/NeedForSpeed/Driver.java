
package NeedForSpeed;
public class Driver {
    private String name;
    private Vehicle car;
    
    public Driver(String name, Vehicle car){
        this.name = name;
        this.car = car;
    }
        
    public void drive(){
        System.out.println("I am "+name);
        System.out.println("My vehicle is "+car.getCarType());
        System.out.println(car.pushClutch());
        System.out.println(car.pushAxelerate());
        System.out.println(car.shiftGear());
        System.out.println(car.turnWeel());
        System.out.println(car.pushBreak());
        
    }
}
