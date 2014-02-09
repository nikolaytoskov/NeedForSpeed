
package NeedForSpeed;
public class Truck extends Vehicle{
    private String truckType;
    
    public Truck(String truckType){
        this.truckType = truckType;
}

    @Override
    public String getCarType() {
        return truckType;
    }

    public void setCarType(String truckType) {
        this.truckType = truckType;
    }
    
    @Override
    public String pushBreak(){
        return "The truck stops";
    }
    @Override
    public String pushClutch(){
        return "Change truck shift";
    }
    @Override
    public String pushAxelerate(){
        return "The truck axelerate";
    }
    @Override
    public String turnWeel(){
        return "Turn truck left or right";
    }
    @Override
    public String shiftGear(){
        return "Change truck gear";
        
    }
}
