public interface Car {
    void type();
}
public interface Maruti {
    void color();
}
public class Test implements Car, Maruti{
    @Override
    public void type() {
        System.out.println("I am maruti");
    }

    @Override
    public void color() {
        System.out.println("my colour is red");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.type();
        t.color();
    }
}
