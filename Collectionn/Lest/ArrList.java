import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        // List list = new ArrayList();

        // list.add(1);
        // list.add('w');
        // list.add(2.3);
        // list.add("string");

        ArrayList<String> l = new ArrayList<>();
        l.add("Ram");
        l.add("Shiv");
        l.add("Hanuman");
        l.add("Narayan");
        l.add("Krishna");
        l.add("Swaminarayan");

        // ArrayList<String> l1 = new ArrayList<>();
        // l1.add("Parvati");
        // l1.add("Agni");
        // l1.add("Aditi");
        // l1.add("Durga");
        // l1.add("Kali");
        // l1.add("Lakshmi");

        // l.addAll(l1);

        // System.out.println(l.get(2));
        // for (String i : l) {
        //     System.out.println(i);
        // }

        // l.clear();

        // Iterator<String> iter = l.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }

        // l.set(2, "Bajrangbali");
        // l.remove(2);
        // l.remove("Narayan");

        // ArrayList<String> l1 = new ArrayList<>();
        // l1.add("Hanuman");
        // l1.add("Swaminarayan");
        // l.removeAll(l1);

        // System.out.println(l.size());

        // Object arr[] = l.toArray();
        // String a = Arrays.toString(arr);
        // System.out.println(a.charAt(4));

        // String s = Arrays.toString(l.toArray());
        // System.out.println(s.length());

        // System.out.println(l.contains("Narayan"));

        // System.out.println(l.containsAll(l1));


        System.out.println(l);
    }
}
/*
Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

Some of the commonly used methods of the Collection interface that's also available in the List interface are:

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element

*/
