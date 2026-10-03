package swich;
import java.util.Scanner;

public class part6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Score: ");
        int score = sc.nextInt();

        if (score >= 85)      
            System.out.println("A");
        else if (score >= 70) 
            System.out.println("B");
        else if (score >= 55) 
            System.out.println("C");
        else if (score >= 40) 
            System.out.println("D");
        else                  
            System.out.println("F");

        System.out.println(score >= 50 ? "PASS" : "FAIL");

        System.out.print("Day (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Mon"); break;
            case 2: System.out.println("Tue"); break;
            case 3: System.out.println("Wed"); break;
            case 4: System.out.println("Thu"); break;
            case 5: System.out.println("Fri"); break;
            case 6: System.out.println("Sat"); System.out.println("Weekend!"); break;
            case 7: System.out.println("Sun"); System.out.println("Weekend!"); break;
            default: System.out.println("Not a day");
        }
        sc.close();
    }
}