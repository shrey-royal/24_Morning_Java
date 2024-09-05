import java.util.Iterator;
import java.util.Stack;

public class Stacc {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Biscuits");
        s.push("Chawanu");
        s.push("Khakhra");
        s.push("Papdi");
        s.push("Sev");

        System.out.println(s);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // s.clear();
        // System.out.println(s.empty());
        // System.out.println(s.search("Khakhra"));
        // System.out.println(s.size());

        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }



        System.out.println(s);
    }
}
/*
LIFO - Last In First Out

Methods of Stack:
1. push() - adds an element to the stack
2. pop() - removes an element from the stack
3. peek() - returns the top element of the stack
4. empty() - returns true if the stack is empty
5. search() - returns the position of the element from the top of the stack
6. size() - returns the size of the stack

*/