
import  java.util.Scanner;
public class Lab3b {
    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer();

        System.out.println("Capacity of String Buffer Object sb1 :" + sb1.capacity());

        StringBuffer sb2=new StringBuffer("Hello");

        System.out.println("Capacity of buffer object sb2"+sb2.capacity());

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter a String ");
        String inputString =scanner.nextLine();

        StringBuffer reversedBuffer=new StringBuffer(inputString);
        reversedBuffer.reverse();

        String reversedUpper=reversedBuffer.toString().toUpperCase();
        System.out.println("Reveresed String in uppercase"+reversedUpper);

        scanner.close();
    }
}





