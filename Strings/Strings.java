public class Strings {
    public static void main(String[] args) {
        // String s = "Hello";
        // String s1 = "Hello";
        // String s2 = s;

        // hashcode() -> get you the hashcode of the reference memory
        // System.out.println(s.hashCode());
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());

        String s = "Nature";
        String s1 = "Nature";

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        s1 = "Mother Nature";

        System.out.println("\n" + s.hashCode());
        System.out.println(s1.hashCode());

        s1 = "Nature";

        System.out.println("\n" + s.hashCode());
        System.out.println(s1.hashCode());

        System.out.println("AB".hashCode());
    }
}
// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
