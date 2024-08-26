import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //1st way
        // Pattern p = Pattern.compile(".a");  //. represents a single character
        // Matcher m = p.matcher("ha");
        // boolean result = m.matches();
        // System.out.println(result);

        // 2nd way
        // boolean result = Pattern.compile(".i").matcher("Hi").matches();
        // System.out.println(result);

        // 3rd way
        // boolean result = Pattern.matches(".i", "hi");
        // System.out.println(result);

        // System.out.println(Pattern.matches("..i...", "Hii---"));
        // System.out.println(Pattern.matches("[a-z]*", "asdhgfvhjsdv"));
        // System.out.println(Pattern.matches("[^aj]*", "d_r_i"));
        // System.out.println(Pattern.matches("\\w*", "1234214234uiasgdfi_567"));
        // System.out.println(Pattern.matches("\\d{0,4}", "9978"));
        System.out.println(Pattern.matches("['+']{1}[91]{2}[6-9]{1}[0-9]{9}", "+919173223246"));
        System.out.println(Pattern.matches("['+']{1}[9]{1}[1]{1}[6-9]{1}[0-9]{9}", "+199173223246"));
    }
}