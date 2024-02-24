public class student{
    private String name;
    private int age;
    public student(String n, int a){
        this.name = n;
        this.age = a;
    }
    public static void main(String[] args) {
        student s = new student("Silver", 19);
    }
}

/**
class access
 */
class access {
    public static void main(String[] args) {
        student st = new student("silver", 0);
        System.out.println(st.name);
    }

    
}