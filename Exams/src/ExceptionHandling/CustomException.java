package ExceptionHandling;

public class CustomException extends Exception{
    String msg;
    CustomException(String str) {
        msg = str;
    }
    public String toString() {
        return ("Custom Exception Occurred: "+msg);
    }
}
