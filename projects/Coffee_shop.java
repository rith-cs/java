package projects;
import java.util.Scanner;
class item {
    private String name;
    private double price;
    item(String name , double price){
        this.name = name;
        this.price = price;
    }
    String getName(){
        return name;
    }
    double getPrice(){
        return price;
    }
    public String toString(){
        return name + " ($" + price + ")";
    }
}
class Order{
    private String name;
    private double price;
    private int qty;
    Order(String name, double price, int qty){
        this.name =name;
        this.price = price;
        this.qty = qty;
    }
    double lineTotal(){
        return price *qty;
    }
    String getName(){
        return name;
    }
    int getQty(){
        return qty;
    }
}
public class Coffee_shop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        item[] menu = {
            new item("coffee",2.5),
            new item("tea", 1.75),
            new item("water",1.0),
            new item("cake", 3.25)
        };
        Order[] orders = new Order[10];
        int count=0;
        int choice;
        do{
        System.out.println("\n1 Menu | 2 Order | 3 Show | 4 Checkout | 0 exit");
        System.out.print(">");
        choice= Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
            for (int i=0; i<menu.length; i++){
            System.out.println((i+1) + ". " + menu[i]);
            }break;
            case 2:
                if (count == orders.length){
                    System.out.print("FULL!");
                    break;
                }
                int no;
                do{
                    System.out.print("item number: ");
                    no = Integer.parseInt(sc.nextLine());
                    if (no <1 || no>menu.length)
                        System.out.println("Invalid item number");
                }while (no <1 || no> menu.length);
                int qty;
                do{
                    System.out.print("Qty: ");
                    qty =Integer.parseInt(sc.nextLine());
                    if (qty <1 || qty>10)
                        System.out.println("invalid qty");
                }while (qty <1 || qty > 10);
                item chosen =menu[no-1];
                orders[count++] = new Order(chosen.getName(),chosen.getPrice(),qty);
                System.out.println("Ordered: " +  qty + "x " + chosen.getName());
                break;
            case 3:
                if (count==0)
                    System.out.println("No orders yet");
                else{
                    for (int i=0; i<count;i++){
                        System.out.printf("%d x %s = %.2f%n",orders[i].getQty(), orders[i].getName(),orders[i].lineTotal());
                    }
                }
                break;
            case 4:
                if (count ==0){
                    System.out.println("No order yet");
                }
                else{ 
                    System.out.println("== Receipt ==");
                    double total =0;
                    for (int i=0; i<count;i++){
                        System.out.printf("%d x %s = %.2f%n", orders[i].getQty(), orders[i].getName(),orders[i].lineTotal());
                        total += orders[i].lineTotal();
                }
                        System.out.printf("Total : %.2f%n",total);
                        System.out.println("Thank you!");
                       
            }break;
            case 0: System.out.println("Bye!");break;
            default:System.out.println("Invalid choice ");break;
            }
        }while (choice!=0);
        sc.close();
    }
}