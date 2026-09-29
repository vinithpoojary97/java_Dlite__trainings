package sample;

public class Stack
{
     int stack[]=new int[5];
    static  int top=1;


    void push(int value)
    {
        if(top==stack.length-1)
        {
            System.out.println("stack overflow");
        }
        top--;
        stack[top]=value;
    }
    int pop()
    {
       if(top==-1)
       {
           System.out.println("stack is empty");
           return -1;
       }
       int value=stack[top];
       top--;
       return value;
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int value;
        top++;
        stack[top];
        return

    }
    void display()
    {

    }

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);



    }
}
