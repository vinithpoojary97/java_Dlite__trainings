package Str;

public class Bank {

    private int pin;
    String accno="SBI2525";
    double balance=50000;

    //setter()
    public void setData(int u_pin)
    {
        pin = u_pin;
    }
        //getter()
    public int getData()
        {
            return pin;
        }

        void deposite(int pin,double amount)
    {
        if(this.pin==pin) {
            balance += amount;
            System.out.println("amount added successfully");
        }
            else
        {
            System.out.println("invalid pin");

    }
    }

    void withdrawal(int pin,double amount)
    {
        if(this.pin==pin)
        {
            if (amount>balance)
            {
                System.out.println("insufficent balance");
            }
            else
            {
                balance-=amount;
                System.out.println("amount withdrwan successfuly");
            }
        }
        else {
            System.out.println("invalid pin");
        }
    }
    void checkbalance(int pin)
    {
        if(this.pin==pin) {
            System.out.println("current balance" + balance);
        }
        else
        {
            System.out.println("invalid pin");
        }

    }
}


