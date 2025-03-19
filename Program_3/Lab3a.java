public class Lab3a
{
    public static String concatenate(String s1,String s2){
        return s1+s2;
    }
    public static boolean isequals(String s1, String s2){
        return s1.equals(s2);
    }
    public static String copy(String s1){
        return new String(s1);
    }

    public static void main(String args[])
    {
        String s1="Hello";
        String s2="World";

        System.out.println("String Comparison");
        System.out.println(("are the strings equal "+isequals(s1,s2)));
        System.out.println("Concatenating the Strings "+ concatenate(s1,s2));
        String copied =copy(s1);
        System.out.println("Copied String is "+ copied);
    }
}
