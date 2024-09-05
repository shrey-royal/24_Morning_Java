import java.util.Iterator;
import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
        Vector<Integer> l = new Vector<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        // Vector<Integer> l1 = (Vector<Integer>) l.clone();
        // Vector<Integer> l1 = l;

        // System.out.println(l1.hashCode());
        
        // System.out.println(l);

        Iterator<Integer> iter = l.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
/*
vector is a growable array of objects.

Methods of vector:

Same as ArrayList except that all the methods of vector are synchronized.

*/