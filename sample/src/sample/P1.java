package sample;

import java.util.Arrays;

public class P1 {

    public static void main(String[] args) {
        String s1="java python";
        String sr[]=s1.split("");
        System.out.println(Arrays.toString(sr));

        String a="java";
        System.out.println(a.replace("java","C"));
        System.out.println(a.replaceAll("java","C"));

        String html="<p>hellow</p><p>world</p>";

        System.out.println(html.replace("<p>","").replace("</p>",""));


        //trim()

        String x="hello java";
        System.out.println(x.trim());

        //join()

        String ar[]={"java","python","c++"};
        System.out.println(String.join("-",ar));

        String email="v@gmail.com";
        System.out.println(email.replaceAll("v@gmail.com","vi@gmail.com"));

        //[A-Z] [a-z] [0-9]
        //.--->any single char
        //*---->zero or any no of char
        //\\d-->single digit
        //+--->any no of times
        //^--->beginning
        //$-->ending

        String p1="4tewgfdsgJvav";
        System.out.println(p1.matches(".^[A-Z].*"));
        System.out.println(p1.matches(".*[A-Z].*"));

        String p2="java2hjd";
        System.out.println(p2.matches("^[0-9].*"));
        System.out.println(p2.matches(".*[0-9].*"));

        String p3="@javass123";
        System.out.println(p3.matches(".^[^A-Z,a-z,0-9].*"));


        String p4="javas@123";
        System.out.println(p4.replaceAll("[^A-Z,a-z,0-9]",""));

        String p5="01235468";


        System.out.println(p5.matches("[0-9]+"));


         String pass="vinith@888";
        System.out.println(pass);
        System.out.println(pass.length()>=10);
        System.out.println(pass.matches(".*[A-Z].*"));
        System.out.println(pass.matches(".*[a-z].*"));
        System.out.println(pass.matches(".*[0-9].*"));
        System.out.println(pass.matches(".*[^A-Z,a-z,0-9].*"));

        String e="vinith@gmail.com";
        String e1[]=e.split("@");

        if(e1.length==2&&e1[1].split("\\.").length==2 && e1[0]!=null)
        {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

        String ph="1123456789";
        System.out.println(ph.matches("[7-9][0-9]{9}"));
        System.out.println(ph.matches("[0-9]{10}"));





    }
}
