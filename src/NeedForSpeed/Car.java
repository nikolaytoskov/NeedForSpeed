
package NeedForSpeed;

public class Car extends Vehicle {
    private String carType;
    
    public Car(String carType){
        this.carType = carType;
}

    @Override
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    
    @Override
    public String pushBreak(){
        return "The car stops";
    }
    @Override
    public String pushClutch(){
        return "Change shift";
    }
    @Override
    public String pushAxelerate(){
        return "The car axelerate";
    }
    @Override
    public String turnWeel(){
        return "Turn left or right";
    }
    @Override
    public String shiftGear(){
        return "Change gear";
        
    }
}
