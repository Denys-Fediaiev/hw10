public class Mars extends Planet implements PlanetInterface {
    private boolean water;

    @Override
    public void printdata() {
        System.out.println("Name of planet: " + getName("m") + ".\nRadius is " + getRadius(1) + ". \nSize is " + getSize(1) + "\nTemperature is " + getTemperature(1) + "\nWater here? " + water);
    }
    public Mars(String name, double size, double radius,int temperature,double acceleration,boolean water){
        super(name, size, radius, temperature,acceleration);
        this.water = water;
    }
    @Override
    public  void accelerationOfGravity(){
        System.out.println("acceleration Of Gravity is" + getAcceleration(111));
    }
}
