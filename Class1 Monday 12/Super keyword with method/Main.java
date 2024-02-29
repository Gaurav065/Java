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