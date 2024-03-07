public class Animal{

   

        {
            System.out.println("Instance block execution");
        }

        public Animal(){
            System.out.println("main constructor");
        }
        public static void main(String[] args) {
            Animal an = new Animal();
        }
    }

