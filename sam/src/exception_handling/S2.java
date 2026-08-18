package exception_handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//list(I)--->ArrayList,LinkedList,vector,stack
public class S2 {
    public static void main(String[] args) {
        //insertion order mainted,duplicate are allowed,null value allowed

        //ArrayList(C)
        ArrayList<String> a=new ArrayList<>();//default capacity==16
        System.out.println(a);
        a.add("swastik");
        a.add("bengalore");
        System.out.println(a);
        a.add(1,"hyd");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        System.out.println(a.lastIndexOf("swastik"));
        System.out.println(a.indexOf("bengalore"));
        System.out.println(a.size());//no of ele in list currebtly
        //capacity=is how many ele it hold
        //add(value);
        //add(index,value);
        //remove(index);
        //remove(value);
        //get(index);
        //set(index);
        //indexof(value)
        //Lastindexof(value);
        //sublist(fromIndex,toIndex);
        //isempty();
        //size();
        //contains(value);
        //clear();
        System.out.println("for loop");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("for each");
        for(String s:a)
        {
            System.out.println(s);
        }

        //iterator interface
        System.out.println("using iterator interface");
        Iterator<String> i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //listiterator interface ---(bidirectional)
        System.out.println("original order");
        ListIterator<String> x= a.listIterator();
        while (x.hasNext())
        {
            System.out.println(x.next());
        }

        //a.clear();
        //System.out.println(a);
    }
}
