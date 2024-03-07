public class Main{
    public static void main(String[] args) {
        Animal cat = Animal.getInstance();
        Animal cat2 = Animal.getInstance();
        cat.getSound();
        cat2.getSound();
    }
}