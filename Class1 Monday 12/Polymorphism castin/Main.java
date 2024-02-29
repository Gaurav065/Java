//Abstraction, inheritance
class Animal {
    public void eat(){
        System.out.println("Nothing");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("pedigree");
    }

    public void eat(String breed){
        System.out.println(breed + " Eats eggs too, cauliflour too, and chicken pieces");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Milk");
    }
    public void eat(String breed){
        System.out.println(breed +" likes to eat dry fish, munches on cucumber and water melon");
    }
    }


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        ((Dog)dog).eat("German Shepeard");
        ((Cat)cat).eat("Dianbo");
    }
}