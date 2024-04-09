class thread_1 extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
}

// class thread_2 implements Runnable{
//     public void run(){
//         System.out.println("thread 2 is running iterface type thread");
//     }
// }


public class thread {
    public static void main(String[] args) {
        System.out.println("threading");
        thread_1 th = new thread_1();
        th.start();

        Thread th2 = new Thread(new thread_2());
        th2.start();
    }
}
