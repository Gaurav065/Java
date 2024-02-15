public class passbyvalue {
    public void change_value(int a){
        a = 20;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int n = 10;
        passbyvalue c4 = new passbyvalue();
        c4.change_value(n);
        System.out.println(n);
    }
}
