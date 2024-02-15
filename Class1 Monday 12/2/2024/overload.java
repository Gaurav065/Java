public class overload {
    public int area(int a){
        int area = a*a;
        return area;
    }

    public double area (double length, double breadth){
        double area = length*breadth;
        return area;
    }

    public String area(double radius){
        double area = 3.14*radius*radius;
        return Double.toString(area);
    }

    public static void main(String[] args) {
        overload od = new overload();
        int sqaure = 5;
        int len = 8;
        int bre = 9;
        double radius = 7.62;

        System.out.println("the area of the cirlce is "+od.area(radius));
        System.out.println(od.area(sqaure));
        System.out.println(od.area(len, bre));

    }


}
