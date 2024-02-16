abstract class shape{
    abstract double area();
}

class circle extends shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    double area(){
        return radius*radius*Math.PI;
    }
}

class square extends shape{
    double side;
    square(double a){
        this.side = a;
    }
    double area(){
        return side*side;
    }
}


public class abstraction {

    public static void main(String[] args) {
        circle c = new circle(7);
        square s = new square(5);
        System.out.println(c.area());
        System.out.println(s.area());

    }
}