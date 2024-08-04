package Data_Structures_Files;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


// ArrayList is one of the most commonly used data structures in Java.
// It’s a dynamic array that can grow and shrink in size automatically.
// It allows you to store any number of elements and can contain duplicates.
public class Arraylist {
    public static void arraylist(){

        //Here’s a simple example of how to use ArrayList:
        List<String> list = new ArrayList<>();

        //Added items in list
        list.add("heshmy 1");
        list.add("heshmy 2");
        list.add("heshmy 3");
        list.add("heshmy 4");
        list.add("heshmy 5");

        //fetch list items
        System.out.println (list);
        //Bring a list item
        System.out.println (list.get(1));
        //Verify that the list is empty.
        System.out.println (list.isEmpty());
        //Get list size
        System.out.println (list.size());
        //Add an item to a specific location
        list.set(1,"66");
        //fetch list items
        System.out.println (list);
        //Bring the number one item in the list.
        System.out.println (list.get(1));


    }
}
