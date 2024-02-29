class animal{
    
    public void sound(){
        System.out.println("animal sound :");
    }
}
class cat extends animal{
    @Override
    public void sound(){
        System.out.println("cat sound");
        super.sound();
    }
}
class lion extends animal{
    @Override
    public void sound(){
        System.out.println("lion sound");
        super.sound();
    }
}
class Main{
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
        lion d = new lion();
        d.sound();
    }
}