//Custom Exception
class PriyaException extends Exception {
    public PriyaException(String str) {
        super(str);
    }
}

public class ExceptionHandling {
    public void excp_handle() {
        int i = 20;
        int j = 0;
        // int num[] = new int[5];
        try {
            j = 18 / i;
            if (j == 0)
                throw new PriyaException("Something Wrong. so thie default value is showing ");
            // System.out.println(num[5]);
        } catch (PriyaException e) {
            j = 18 / 1;
            System.out.println(e);
        }
        // catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Something Wrong.. " + e);
        // }
        catch (Exception e) {
            System.out.println("Unhandlinging Exception : " + e);
        }
    }

}
