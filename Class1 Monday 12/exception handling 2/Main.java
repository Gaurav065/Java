abstract class Shape{
	abstract double calculateArea();
	public void displayInfo(){
		System.out.println("This is Shape-base class");	
	}
}  



class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea(){
		return length*width;
	}
	@Override
	public void displayInfo(){
		System.out.println("This is RECTANGLE Shape class");	
	}
}


class Circle extends Shape{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double calculateArea(){
		return Math.PI*radius*radius;
	}
	@Override
	public void displayInfo(){
		System.out.println("This is CIRCLE Shape Class");	
	}
}

public class Main {
    public static void main(String[] args) {
        Object length = 5;
        Object width = 4;
        char radius = 'a';

        try {
            Rectangle obj1 = createRectangle(length, width);
            Circle obj2 = createCircle(radius);

            System.out.println("Area of Rectangle: " + obj1.calculateArea());
            System.out.println("Area of Circle: " + obj2.calculateArea());
            obj1.displayInfo();
            obj2.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Incompatible Types: Arguments should be int/double type");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static Rectangle createRectangle(Object length, Object width) {
        double parsedLength = parseObjectToDouble(length);
        double parsedWidth = parseObjectToDouble(width);
        return new Rectangle(parsedLength, parsedWidth);
    }

    private static Circle createCircle(Object radius) {
        double parsedRadius = parseObjectToDouble(radius);
        return new Circle(parsedRadius);
    }

    private static double parseObjectToDouble(Object value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        } else {
            throw new IllegalArgumentException("Incompatible Type: Argument should be int/double type");
        }
    }
}