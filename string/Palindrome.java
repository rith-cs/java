package string;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Word: ");
        String word = sc.nextLine();
        String rev = new StringBuilder(word).reverse().toString();
        if (word.equals(rev))
            System.out.println(word + "is a palindrome");
        else
            System.out.println(word + "is not a palindrome");
        sc.close();
    }
}