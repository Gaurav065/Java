



class thread_1 extends Thread{
    public void execute(){
        System.out.println("thread is running");
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println("threading");
        thread_1 th = new thread_1();
        th.start();
    }
}
