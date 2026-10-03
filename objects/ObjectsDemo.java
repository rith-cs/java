package objects;
class Student {
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    void setAge(int age){
        if (age >= 0)
            this.age = age;
    }
    int getAge(){
        return age;
    }
    public String toString(){
        return name + "( " + age  + ") " ;
    }
}
public class ObjectsDemo {
    public static void main(String[] args){
        Student st = new Student("Dara",20);
        System.out.println(st);
        st.setAge(-5);
        System.out.println(st.getAge());
    }
}