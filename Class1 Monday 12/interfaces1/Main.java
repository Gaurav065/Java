interface A
{
    void show();
}
class B
{
   public void show1()
   {
       System.out.println("I am in show 1");
   }
}
class C extends B implements A
{
    public void show()
    {
        System.out.println("I am in show");
    }
   
}

public class Main {
    public static void main(String[] args) {
        C c1=new C();
        c1.show();
        c1.show1();
    }
}