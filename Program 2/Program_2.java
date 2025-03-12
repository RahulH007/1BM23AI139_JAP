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


    }
}
