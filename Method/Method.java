package Method;
public class Method {
    static int add(int a, int b){
        return a + b;
    }
    static double add(double a , double b){
        return a + b;
    }
    static long fact(int n){
        return n<= 1 ? 1:n*fact(n-1);
    }
    public static void main(String[] args){
        System.out.println(add(2,3));
        System.out.println(add(2.5,3.5));
        System.out.println(fact(5));
    }
}