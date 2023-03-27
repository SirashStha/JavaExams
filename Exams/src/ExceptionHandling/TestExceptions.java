package ExceptionHandling;

public class TestExceptions {
    static void myMethod(int testNum) throws Exception {
        System.out.println("start - myMethod");
        if (testNum == 12) {
            throw new Exception();
        }
        System.out.println("end - myMethod");
    }

    public static void main(String[] args) {
        int testNum = 12;
        try {
            System.out.println("try - first statement");
            myMethod(testNum);
            System.out.println("try - last statement");
        }
        catch (Exception e) {
            System.out.println("Exception Occurred");
        }
        finally {
            System.out.println("finally statement");
        }
        System.out.println("Out of try/catch/finally statements");
    }
}
