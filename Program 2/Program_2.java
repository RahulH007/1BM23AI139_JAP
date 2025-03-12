public class Program_2{

    public static void main(String[] args) {

        int a = 42;
        Integer b =a;
        int c = b;
        System.out.println("Primitive int: " + a);
        System.out.println("Boxed Integer : " + b);
        System.out.println("Unboxed value : " + c);

        float d=21;
        Float e=d;
        float f=e;
        System.out.println("Primitive float: " + d);
        System.out.println("Boxed Float : " + e);
        System.out.println("Unboxed  : " + f);

        char g='r';
        Character h=g;
        char i=h;
        System.out.println("Primitive char: " + d);
        System.out.println("Boxed Character : " + e);
        System.out.println("Unboxed : " + f);

        byte z=100;
        Byte x=z;
        byte q=x;
        System.out.println("Primitive byte: " + d);
        System.out.println("Boxed Byte : " + e);
        System.out.println("Unboxed : " + f);

        short s = 32000;
        Short t = s;  
        short u = t;  
        System.out.println("Primitive short: " + s);
        System.out.println("Boxed Short: " + t);
        System.out.println("Unboxed: " + u);

        long l = 9999999999L;
        Long m = l;  
        long n = m;  
        System.out.println("Primitive long: " + l);
        System.out.println("Boxed Long: " + m);
        System.out.println("Unboxed: " + n);

        double p = 99.99;
        Double r = p;  
        double s2 = r; 
        System.out.println("Primitive double: " + p);
        System.out.println("Boxed Double: " + r);
        System.out.println("Unboxed: " + s2);

        boolean bool = true;
        Boolean boolBoxed = bool;  
        boolean boolUnboxed = boolBoxed;  
        System.out.println("Primitive boolean: " + bool);
        System.out.println("Boxed Boolean: " + boolBoxed);
        System.out.println("Unboxed: " + boolUnboxed);
        


    }
}
