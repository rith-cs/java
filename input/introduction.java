package input;
import java.util.Scanner;
public class introduction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter birth year: ");
        int year = sc.nextInt();
        sc.nextLine();
        int age = 2026 - year;
        int month = (age * 12) ;
        System.out.println("Hello " + name + ", you are " + age + " and you live a total of " + month + " months");
        sc.close();
    }
}