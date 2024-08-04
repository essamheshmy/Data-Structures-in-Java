package Data_Structures_Files;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void linkedlist() {

        //Here’s a simple example of how to use Linked List:
        List<String> linkedList = new LinkedList();
        //linkedList vs ArrayList
        //ArrayList  Very good at arranging items but very bad at deleting and adding
        //linkedLis Better in adding and deleting but expensive in terms of storage

        //Added items in linled list
        linkedList.add("linked heshmy 1");
        linkedList.add("linked heshmy 2");
        linkedList.add("linked heshmy 3");
        linkedList.add("linked heshmy 4");
        linkedList.add("linked heshmy 5");

        //fetch list items
        System.out.println (linkedList);
        //Bring a list item
        System.out.println (linkedList.get(1));
        //Verify that the list is empty.
        System.out.println (linkedList.isEmpty());
        //Get list size
        System.out.println (linkedList.size());
        //Add an item to a specific location
        linkedList.set(1,"66");
        //fetch list items
        System.out.println (linkedList);
        //Bring the number one item in the list.
        System.out.println (linkedList.get(1));

// Note: There is almost no difference
// between the functions of the dynamic list and the linked list.
// However, the fundamental difference between them is in how these
// functions are implemented in the background and in the space used.

    }
}
