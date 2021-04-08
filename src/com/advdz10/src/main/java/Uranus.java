public class Uranus extends Planet implements PlanetInterface {
    private int incline;
    @Override
    public void printdata(){
        System.out.println("Name of planet: " + getName("u") + ".\nRadius is " + getRadius(1) + ". \nSize is " + getSize(1) + "\nTemperature is " + getTemperature(1) + "\nIncline is " + incline);
    }
    public Uranus(String name, double size, double radius,int temperature,double acceleration,int incline){
        super(name,size,radius,temperature,acceleration);
        this.incline = incline;
    }
    @Override
    public void accelerationOfGravity(){
        System.out.println("acceleration Of Gravity is" + getAcceleration(129));
    }

}
