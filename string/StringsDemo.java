package string;
public class StringsDemo {
    public static void main(String[] args){
        String s = "Core Java";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s);
        String a = new String("java");
        String b = new String("java");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}