package exception_handling;

import java.util.Stack;
import java.util.Vector;

public class S4 {
    public static void main(String[] args) {
        Stack<Integer> a=new Stack<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        System.out.println(a);
        System.out.println(a.pop());
        System.out.println(a);
        System.out.println(a.peek());
        System.out.println(a.empty());
        System.out.println(a);
        System.out.println(a.search(40));
        System.out.println(a.get(2));

    }
}
