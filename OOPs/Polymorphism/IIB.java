class Sup {
    Sup() {
        System.out.println("SUP Constructor Called!");
    }
}

@SuppressWarnings("unused")
public class IIB extends Sup {

    static {
        //static block
        System.out.println("Static block Called!");
    }

    {
        //iib - used to initalize the instance members
        System.out.println("Instance Initializer Block");
    }


    public IIB() {
        super();
        System.out.println("Constructor called!");
    }
    
    public static void main(String[] args) {
        //static, constructor, super(if any), iib
        IIB obj = new IIB();
    }
}
