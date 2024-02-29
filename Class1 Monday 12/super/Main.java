class Parent {
    String message = "Hello from Parent";
    
    public void displayMessage() {
        System.out.println(message);
    }
}
class Child extends Parent {
    String message = "Hello from Child";
    
    public void displayBothMessages() {
        System.out.println(super.message); 
        System.out.println(message);      
    }
}
public class Main {
    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.displayBothMessages();
    }
}