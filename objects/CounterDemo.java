package objects;
class Counter {
    private int level = 0;
    void up(){
        level++;
    }
    void down(){
        if (level > 0)
            level--;
    }
    int getLevel(){
        return level;
    }
}
public class CounterDemo {
    public static void main(String[] args){
        Counter c = new Counter();
        c.up(); c.up(); c.up();
        c.down();
        System.out.println(c.getLevel());
        Counter fresh = new Counter();
        System.out.println(fresh.getLevel());
    }
}
