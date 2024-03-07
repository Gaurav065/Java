interface calculateArea{
    int area(int a,int b);
}
interface shape{
    double  area2(double  a);
}
public class Main {
    public static void main(String[] args) {
        calculateArea rectangle = (int a, int b) ->{return  a*b;};
        calculateArea triangle =  (int a,int b) -> (a*b)*2;
        shape circle = (double radius) ->  {return 3.14*radius;};
        System.out.println("rectangel:"+area(55,2,rectangle));
        System.out.println("triangle:"+area(2,3,triangle));
        System.out.println("circle:"+area2(6.0,circle));
    }
        private static int area(int a,int b,calculateArea area){
            return area.area(a,b);
        }
        private static double area2(double a,shape shape){
            return shape.area2(a);
        }
    }