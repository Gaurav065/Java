import java.io.File;
import java.io.IOException;
class UserDefinedException extends Exception{
    public UserDefinedException(String message){
        super(message);
    }
}
public class Main {
    // public static int mathematicalfunc(int a, int b) throws ArithmeticException{
    //     return a/b;


    

    public static void main(String[] args) {
        // int a =4;
        // int b = 0;
        // int res = Main.mathematicalfunc(a, b);
        // System.out.println(res);
        // File creation 


        try {
            File file = new File("sample.txt");
            if(file.exists()){
            System.out.println("File exists creation halted");
            }else{
                if(file.createNewFile()){
                    System.out.println("File has been created: "+ file.getName());
                }
                else{
                    System.out.println("File creation failed");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred "+ e.getMessage());
        } finally{
            System.out.println(" Done");
        }






        try{
            throw new UserDefinedException("Custom message exception for smooth error handling");
        }
        catch(UserDefinedException u){
            System.out.println("Exception caught at: "+ u.getMessage());
        }






        try{
            double threshold = -0.5;
            if (threshold<0){
                throw new IllegalArgumentException("threshold cnnot be negative");
            }
            System.out.println("threshold"+ threshold);
        }
        catch(IllegalArgumentException e){
            System.out.println("Encountered: "+e.getMessage());
        }
    }
}
//Arthmatic exception, arrayindexoutofbound, IOexception, runtimeexception, NullpointerException, IllegalArgumentException