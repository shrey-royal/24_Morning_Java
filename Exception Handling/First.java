public class First {
    public static void main(String[] args) {
        System.out.println("Before Exception");

        try {
            System.out.println(2/0);    //throw arithmetic exception
            // String s = null;
            // System.out.println(s.length()); //nullpointer exception
        } catch (ArithmeticException e) {
            // System.out.println(e.getMessage());
            System.out.println("Infinity");
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        System.out.println("After Exception");
    }
}
