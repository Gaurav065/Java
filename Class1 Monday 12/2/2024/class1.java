/**
 * class1
 */
public class class1 {
    
    public  int add(int a, int b){
        return a+b;
    }
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The numbers in the array"+" "+arr[i]);
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("heloow world");
        int a = 3;
        int b = 5;

        class1 c1 = new class1();
        int arr[] = new int[10];
        System.out.println(c1.add(a, b));
        
    }
}