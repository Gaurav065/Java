interface Display{
    public boolean result();
    interface show{
        public void dispaly();
    }
}
class test implements Display.show, Display{
    public boolean result(){
        return true;
    }
    public void dispaly(){
        System.out.println("a sample snipit to show the working of the interface in nested format");
    }
}
public class main {
    public static void main(String[] args) {
        
        test t = new test();
        t.dispaly();
        System.out.println(t.result());
    }
}
