import java.util.Scanner;
public class Program_1a{

    public static double  calculatefee(int duration){
        return duration * 50.0;
    }
    public static void display(String name ,int age,Boolean isActive ,int duration,double fee){
        System.out.println("Details:");
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Duration " + duration);
        System.out.println("Fee " + fee);
    }
    public static void main(String[] args){
        String name;
        int age;
        double fee;
        int duration;
        boolean isActive;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Flexit Gym ");
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Enter the age");
        age = scanner.nextInt();
        System.out.println("Active member? type (true/false)");
        isActive = scanner.nextBoolean();
        System.out.println("Enter the duration in Months");
        duration = scanner.nextInt();
        scanner.close();
        fee=calculatefee(duration);
        display(name,age,isActive,duration,fee );

    }
}