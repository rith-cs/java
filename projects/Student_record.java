package projects;
import java.util.Scanner;
class Student {
    private String name;
    private int score;
    Student(String name,int score){
    this.name = name;
    this.score = score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    @Override 
    public String toString(){
        return name + " (" + score + ")";
    }
}
public class Student_record {
    static double average(Student[] s, int count){
    int sum = 0;
    for(int i = 0; i < count; i++){
        sum += s[i].getScore();
        }
        return (double) sum / count;
    }
    static int topIndex(Student[] s, int count){
    int best = 0;
    for(int i = 1; i < count;i++){
        if(s[i].getScore()>s[best].getScore()) best=i;
        }
        return best;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int Max = 3;
        Student[] s= new Student[Max];
        int count =0;
        int choice ;
        do{
            System.out.println("\n1 Add | 2 Show | 3 Avg | 4 Top | 5 Search | 0 Exit");
            System.out.print("> ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1: 
                if (count == Max){
                    System.out.println("Full!");break;
                }
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    int Score;
                    do{
                        System.out.print("Score: ");
                        Score = Integer.parseInt(sc.nextLine());
                        if (Score <0 || Score>100)
                            System.out.println("Score must be 0-100");
                    }while (Score <0 || Score > 100);
                    s[count++] = new Student(name,Score);
                    System.out.print("Added. ");
                break;
                case 2: 
                if(count==0){
                    System.out.println("No students yet ");
                }
                else {
                    for (int i = 0; i < count ; i++)
                        System.out.println(s[i]);
                }break;
                case 3: 
                if (count == 0)
                    System.out.printf("No students yet");
                else
                    System.out.printf("Average: %.2f%n",average(s,count));
                break;
                case 4:
                if (count == 0)
                    System.out.println("No Students yet");
                else
                    System.out.println("Top: " + s[topIndex(s, count)].getName());
                break;
                case 5:
                    System.out.print("Search: ");
                    String key = sc.nextLine();
                    boolean found = false;
                    for (int i=0; i<count;i++){
                        if (s[i].getName().equalsIgnoreCase(key)){
                            System.out.println(s[i]);
                            found = true;
                        }
                    }if(!found)
                            System.out.println("Not found");
                    break;
                case 0: System.out.println("Bye! ");break;
                default: System.out.println("Invalid choice");
            }
        }while (choice!=0);
        sc.close();
    }
}