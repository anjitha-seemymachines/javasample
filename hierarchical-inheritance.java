class University {
    public void type(){
        System.out.println("Kerala Technological university");
    }
}
class Branch1 extends University{
    public void stream(){
        System.out.println("Computer Science and Engineering");
    }
}
class Branch2 extends University{
    public void stream1(){
        System.out.println("electronics and Communication Engineering");
    }
}
public class Main {
    public static void main(String[] args){
        Branch1 b1 = new Branch1();
        Branch2 b2 = new Branch2();
        b1.type();
        b1.stream();
        b2.type();
        b2.stream1();
    }
}
