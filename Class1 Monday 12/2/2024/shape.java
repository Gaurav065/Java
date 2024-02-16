abstract class Shape {

    abstract double area();
}

class circle extends Shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    double area(){
        return radius*radius*3.14;
    }
}


class sqaure extends Shape{
    double side;
    sqaure(double side){
        this.side =side;

    }
    double area(){
        return side*side;
    }
}

class  Main{

    public static void main(String[] args) {
        circle c = new circle(6.31);
        sqaure s = new sqaure(4);
        System.out.println("Circle: "+ c.area());
        System.out.println("Square: "+ s.area());
    }
}