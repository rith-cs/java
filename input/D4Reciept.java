package input;
import java.util.Scanner;
public class D4Reciept {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("item :");
        String item = sc.nextLine();
        System.out.print("price: ");
        float price = sc.nextFloat(); sc.nextLine();
        System.out.print("quantity :");
        int quantity = sc.nextInt(); sc.nextLine();
        
        float total = quantity * price ;
        System.out.printf("%d x %s = %.2f%n", quantity, item, total);
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}