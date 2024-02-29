
class Calculator {
    public void add() {
        System.out.println();
    }
    public int sub(int a) {
        return -a;
    }
}
class Numbers2 extends Calculator {
    int a;
    int b;
    Numbers2(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void add() {
        System.out.println(a+b);
    }
    public double add(double a, double b) {
        return a + b;
    }
    
    public double sub(double a, double b){
        return Math.abs(a-b);
    }
}
class Number3 extends Calculator{
    int a;
    int b;
    int c;
    Number3(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void add(){
        System.out.println(a+b+c);
    }
    public double add(double a,double b,double c){
        return a+b+c;
    }
    public double sub(double a,double b,double c){
        return Math.abs(a-b-c);
    }
}
class Number4 extends Calculator{
    int a; 
    int b;
    int c;
    int d;
    Number4(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public void add(){
        System.out.println(a+b+c+d);
    }
    public double add(double a,double b,double c,double d){
        return a+b+c+d;
    }
    
    public double sub(double a, double b,double c,double d){
        return Math.abs(a-b-c-d);
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator cal = new Numbers2(8,1);
        cal.add();
        System.out.println(((Numbers2)cal).add(9.3,2.1));

        Calculator call = new Number3(1,2,3);
        call.add();
        System.out.println(((Number3)call).add(3,4,6));
        System.out.println();
        Calculator cal4 = new Number4(1,2,3,4);
        cal4.add();
        System.out.println(((Number4)cal4).add(3.4,5.5,1.1,2));
    }
}