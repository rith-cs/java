public class StudentBridge{
    String name;
    int age;
    void show(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
    public static void main(String[] args){
        StudentBridge stu = new StudentBridge();
        stu.name ="dara";
        stu.age = 20;
        stu.show();
    }
}
