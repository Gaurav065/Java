abstract class vehical{
    public abstract void drive();
}

class car extends vehical{
    @Override
    public void drive(){
        System.out.println("Car selected");
    }

    public void drive(double speed){
        System.out.println("the speed of the car "+ speed);
    }
    public void drive(double speed, String car){
        System.out.println("The selected car is "+car+" The Max speed of the car "+speed);
    }
}


public class main_func {
    public static void main(String[] args) {
        vehical c = new car();


        c.drive();
        ((car)c).drive(60.45);
        ((car)c).drive(120, "Alto");

    }    
}
