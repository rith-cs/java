package Method;
public class timetable { 
    static void Timetable(int n){
        for (int i= 1;i<=5;i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args){
        Timetable(7);
    }
}