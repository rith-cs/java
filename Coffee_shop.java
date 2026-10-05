import java.util.Scanner;
class item {
    private String name;
    private double price;
    item(String name , double price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return name + " ($" + price + ")";
    }
}
public class Coffee_shop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.println("\n1 Menu | 2 Order | 3 Show | 4 Checkout | 0 exit");
        System.out.print(">");
        choice= Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
            item[] menu = {
            new item("coffee",2.5),
            new item("tea", 1.75),
            new item("water",1.0),
            new item("cake", 3.25)
            };
            for (int i=0; i<menu.length; i++){
            System.out.println((i+1) + ". " + menu[i]);
            }break;
            case 0: System.out.println("Bye!");break;
            default:System.out.println("Invalid choice ");break;
            }
        }while (choice!=0);
    }
}