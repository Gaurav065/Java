// package String buffer.introduction;
import java.util.*;

// import com.ibm.jsse2.util.f;

import java.io.*;
public class Main {
    // public static void main(String[] args) {
    //     StringBuffer sb = new StringBuffer("Hello");
        // sb.append(" ");
        // sb.append("World");

        // sb.insert(, "world");


        // System.out.println(sb);

        // sb.replace(5,6, " new ");
        // // sb.delete(5, 9);
        // sb.reverse(); 
        // sb.capacity();
        // System.out.println(sb.capacity());

        //append 
        // insert(int offset, String S) //
        //replace (start, end, String)
        // delete(start , end)
        // reverse()
        // capacity()
        // ensureCapacity(int min)

        public static void stringrev(String s) {
            StringBuffer f = new StringBuffer(s);
            f.reverse();
            System.out.println(f);
        }
    
        public static void main(String args[]) {
            stringrev("Sreelakshmi");
            // System.out.println(f);
    }
    


}
//