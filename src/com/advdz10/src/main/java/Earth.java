class Earth extends Planet implements PlanetInterface{
    private double people;
    @Override
    public void printdata(){
        System.out.println("Name of planet: " + getName("e") + ".\nRadius is " + getRadius(1) + ". \nSize is " + getSize(1) + "\nTemperature is " + getTemperature(1) + "\nPeople " + people);
    }
    public Earth(String name, double size, double radius, int temperature, double acceleration, double people) {
        super(name, size, radius, temperature,acceleration);
        this.people = people;
    }
    @Override
    public void accelerationOfGravity(){
        System.out.println("acceleration Of Gravity is" + getAcceleration(999));
    }

}
