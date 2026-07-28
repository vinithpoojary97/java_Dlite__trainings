package Str;

public class Demo {

    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b.accno);
        System.out.println(b.balance);
        //System.out.println(b.pin);
        b.setData(1111);
        System.out.println(b.getData());
        b.deposite(1110,50000);
        b.deposite(1111,50000);
        b.checkbalance(1111);
        b.withdrawal(1111,600);


    }
}
