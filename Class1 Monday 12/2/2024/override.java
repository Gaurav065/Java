class Felis {
    public void sound(){
        System.out.println("Cat meow");
    }
}

class lion extends Felis{
    @Override
    public void sound(){
        System.out.println("Lion Rawwrr");
    }
}

public class override {
public static void main(String[] args) {
    Felis cat = new Felis();
    Felis Lion = new lion();
    cat.sound();
    Lion.sound();
}
    
}