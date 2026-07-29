public class TryCatchFinallyExample {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;      // Causes an exception
            System.out.println(result);
        }

        catch (ArithmeticException e) {
            System.out.println("\nDivision by zero is not allowed.");
        }

        finally {
            System.out.println("\nFinally block always executes.");
        }

        System.out.println("\nProgram continues successfully.");
    }
}
