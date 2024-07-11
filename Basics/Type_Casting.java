public class Type_Casting {
    public static void main(String[] args) {
        int _int = 123;
        double _double = _int;
        float _float = (float)_double;

        System.out.println(((Object)_double).getClass().getSimpleName());
        System.out.println(_double);

		_float = 12657423;
        System.out.println(_float);
        System.out.println(String.format("%.2f", _float));
        System.out.printf("%.2f\n", _float);
		
		byte[] arr = new byte[10];
		String str = "Learning Java is fun!";
		System.out.println(arr.getClass().getSimpleName());
		char[] chars = str.toCharArray();
		System.out.println(arr.toString().getClass().getSimpleName());


        //Using Wrapper Classes
        // String a = "123";
        // int i = Integer.parseInt(a);
        // System.out.println(((Object)i).getClass().getSimpleName());
		/*
        String s = "J&'t344rVAc(9ryO";
        int caps = 0, digits = 0, specials = 0;
        boolean flag = false;
        for(int i=0 ; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                flag = true;
                break;
            } else if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                caps++;
            } else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digits++;
            } else {
                specials++;
            }
        }

        if(flag) System.out.println("Passwords can not have spaces"); 
        else if(caps > 0 && digits > 0 && specials > 0 && s.length() >= 8) System.out.println("Password is valid!");
        else System.out.println("Invalid Password!");
		*/
    }
}


/*
Java Type Casting: Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening/Implicit Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing/Explicit Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

Data Type	Size	    Description
byte	    1 byte	    Stores whole numbers from -128 to 127
short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	    1 bit	    Stores true or false values
char	    2 bytes	    Stores a single character/letter or ASCII values

*/