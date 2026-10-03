package objects;
class Book {
    private String title ;
    private double price ;
    Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    void show(){
        System.out.println(title + "( " +"$" + price +") ");
    }
}
public class BookDemo{
    public static void main(String[] args){
        Book b1 = new Book("Herry potter",10);
        Book b2 = new Book("Herry potter two",20);
        b1.show();
        b2.show();
    }
}