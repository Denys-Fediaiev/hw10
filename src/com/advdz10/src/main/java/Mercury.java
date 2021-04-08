public class Mercury extends Planet implements PlanetInterface{
    private boolean atmosphere;
    @Override
    public void printdata() {
        System.out.println("Name of planet: " + getName("mer") + ".\nRadius is " + getRadius(1) + ". \nSize is " + getSize(1) + "\nTemperature is " + getTemperature(1) + "\nAtmosphere here? " + atmosphere);
    }
    public Mercury(String name, double size, double radius,int temperature,double acceleration,boolean atmosphere){
        super(name, size,radius,temperature,acceleration);
        this.atmosphere = atmosphere;
    }
    @Override
    public void accelerationOfGravity(){
        System.out.println("acceleration Of Gravity is" + getAcceleration(1901));
    }

}
