public class Planet {
    private String name;
    private double size;
    private double radius;
    private int temperature;
    private double acceleration;


    public Planet(String name, double size, double radius,int temperature,double acceleration){
        this.name = name;
        this.radius = radius;
        this.size = size;
        this.temperature = temperature;
        this.acceleration = acceleration;
    }
    public String getName(String name){return name;}
    public void setName(String name){
        this.name = name;
    }
    public double getSize(double size){return size;}
    public void setSize(double size){
        this.size = size;
    }
    public double getRadius(double radius){return radius;}
    public void setRadius(double radius){
        this.radius = radius;
    }
    public int getTemperature(int temperature){return temperature;}
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public double getAcceleration(double acceleration){return acceleration;}
    public void setAcceleration(double acceleration){
        this.acceleration = acceleration;
    }
    public void printdata(){
        System.out.println("Name of planet: " + name + ".\nRadius is " + radius + ". \nSize is " + size + "\nTemperature is " + temperature + "\nAcceleration is " + acceleration);
    }

}
