package input;
import java.util.Scanner;
public class Ask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = sc.nextLine();
        System.out.print("Your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Your hobby: ");
        String hobby = sc.nextLine();
        System.out.print("Your major: ");
        String Major = sc.nextLine();
        System.out.println(name +"("+age+") like "+ hobby +" and studies " + Major);
        sc.close();
    }
}