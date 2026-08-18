package exception_handling;

import java.util.ArrayList;
import java.util.Vector;

public class S3 {
    public static void main(String[] args) {
        Vector<String> a=new Vector<>();
        a.addElement("a");
        a.addElement("b");
        a.addElement("c");
        System.out.println(a);
        a.insertElementAt("d",3);
        System.out.println(a);
        a.removeElement("a");
        System.out.println(a);
        System.out.println(a.firstElement());
   a.removeElementAt(2);
        System.out.println(a);
        a.removeAllElements();
        System.out.println(a);
    }

}
