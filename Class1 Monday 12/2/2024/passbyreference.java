class Name{
    String name;
    String person;
    Name(String name, String b){
        this.name = name;
        this.person = b;
    }
}
public class passbyreference {

    public static void change_name(Name a){
        a.name = "Jhon";
        a.person ="Soap";
        System.out.println(a.name+" "+a.person);
    }
    public static void main(String[] args) {
        Name n = new Name("Price","Mactavish");
        System.out.println(n.name+" "+n.person);

        change_name(n);

        System.out.println(n.name+" "+n.person);
    }
}