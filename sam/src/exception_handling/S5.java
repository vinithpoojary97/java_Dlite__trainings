package exception_handling;

import java.util.HashSet;

public class S5 {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(10);
        s.add(40);
        s.add(50);
        System.out.println(s);

        HashSet<Integer> s2=new HashSet<>();
        s2.add(100);
        s2.add(200);
        s2.add(300);
        System.out.println(s2);
        s.addAll(s2);
        System.out.println(s);
        s.removeAll(s2);
        System.out.println(s);
        System.out.println(s.containsAll(s2));
        System.out.println(s.equals(s2));
        //default capacity =16


    }
}
