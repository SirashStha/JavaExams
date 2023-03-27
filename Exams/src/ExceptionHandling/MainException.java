package ExceptionHandling;

public class MainException {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Message");
        }
        catch (CustomException e) {
            System.out.println(e);
        }
    }
}
