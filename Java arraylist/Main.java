import java.util.*;
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(19);
        // int temp = al.get(0);

        // al.remove(0);
        int size = al.size();
        // int temp = al.get(0);

        boolean check = al.isEmpty();
        System.out.println(check);
        

        for (int index = 0; index < al.size(); index++) {
            System.out.println(al.get(index));
        }

        int index = al.indexOf(14);
        System.out.println(index);
    }
}



/*ArrayList Sum and Average:
Write a Java program that takes an ArrayList of integers as input and calculates the sum and average of all the elements in the list.

ArrayList Reverse:
Implement a Java program that reverses the elements of an ArrayList without using any built-in methods like Collections.reverse().

ArrayList Intersection:
Write a Java function that takes two ArrayLists of integers as input and returns a new ArrayList containing the intersection of the elements from both lists.

ArrayList Palindrome:
Create a Java program that checks if an ArrayList of strings is a palindrome, i.e., it reads the same forwards and backwards.

ArrayList Merge:
Implement a Java function that merges two sorted ArrayLists of integers into a single sorted ArrayList without using any built-in methods like addAll().

ArrayList Remove Duplicates:
Write a Java program that removes duplicate elements from an ArrayList while preserving the original order.

ArrayList Sorting:
Create a Java program that sorts an ArrayList of strings in alphabetical order without using any built-in sorting methods like Collections.sort().*/ 