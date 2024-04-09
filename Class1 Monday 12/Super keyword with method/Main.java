class Parent {
    public void displayMessage() {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent {
    @Override
    public void displayMessage() {
        System.out.println("Message from Child class");

        super.displayMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.displayMessage();
    }
}



Create a base class called Shape with the following methods:
- calculateArea(): double (abstract method to calculate the area of the shape)
- displayInfo(): void (method to display information about the shape)

Create two derived classes - Circle and Rectangle, both extending the Shape class.

In the Circle class:
- Implement the calculateArea() method to calculate the area of a circle using the formula: area = π * radius^2
- Implement a constructor to initialize the radius of the circle
- Override the displayInfo() method to display information about the circle

In the Rectangle class:
- Implement the calculateArea() method to calculate the area of a rectangle using the formula: area = length * width
- Implement a constructor to initialize the length and width of the rectangle
- Override the displayInfo() method to display information about the rectangle

Create a class named ShapeDemo with the main method:
- Create an array of Shape objects that includes both Circle and Rectangle objects.
- Demonstrate exception handling by using a try-catch block to handle potential exceptions when calculating the area.
- Demonstrate method overloading by creating multiple constructors in the Circle and Rectangle classes.

Sample usage in the main method:
- Create instances of Circle and Rectangle with different dimensions.
- Add these instances to the array of Shape objects.
- Iterate through the array, calling the displayInfo() method for each shape and handling exceptions appropriately.

Note: You can use Math.PI for the value of π.