package Str;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {

        StringBuffer s1=new StringBuffer("BATCHB2");
        System.out.println(s1);
        StringBuilder s2=new StringBuilder("BATCHB3");
        System.out.println(s2);
        s2.append("BCA");
        System.out.println(s2);
        s2.insert(2,"AA");
        System.out.println(s2);
        s2.replace(3,6,"XYZ");
        System.out.println(s2);
        s2.delete(2,6);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);

        String x="java";
        String y="java";
        System.out.println(x==y);

        String p=new String("java");
        String q=new String("java");
        System.out.println(p==q);

        String z="RAJARAMRAGAVENDRA";
        System.out.println(z.charAt(5));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf("V"));
        System.out.println(z.lastIndexOf("A"));
        String a="abc";
        String b="abc";
        System.out.println(a.equalsIgnoreCase(b));
        char ar[]=z.toCharArray();
        System.out.println(Arrays.toString(ar));






    }
}
