/**
 * Question 6: try, multi-catch and finally blocks
 */

public class TryCatchBlocks {
    int raiseException;
    
    void setRaiseException(int s) {
        raiseException = s;
    }
    
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6};
        String myString = null;
        TryCatchBlocks blocks = new TryCatchBlocks();
        blocks.setRaiseException(3);
        int a;
        try {
            if (blocks.raiseException == 1)
                a = 5 / 0;
            if (blocks.raiseException == 2)
                myString.toLowerCase();
            if (blocks.raiseException == 3)
                System.out.println(myArray[10]);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught: " + ae);
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException caught: " + npe);
        } catch (ArrayIndexOutOfBoundsException aioob) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + aioob);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("I'm in finally block");
        }
    }
}
