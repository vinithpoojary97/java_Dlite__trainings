package exception_handling;

//custome exception class
class InvalidAgeExeception extends Exception
{
    InvalidAgeExeception(String msg)
    {
        super(msg);
    }
}

public class S1 {

    static void checkAge(int age) throws InvalidAgeExeception
    {
        if(age<18)
        {
            throw new InvalidAgeExeception("invalidage it has greater than 18");
        }
        else {
            System.out.println("valid age");

        }

    }

    public static void main(String[] args) {
        try{
            checkAge(10);
        }
        catch (InvalidAgeExeception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("end of program");
        }
    }
}
