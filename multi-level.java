public class Car {
    public Car(){
        System.out.println("new car");
    }
    public void type(){
        System.out.println("I am Ford Figo");
    }
}
public class Figo extends Car {
    public Figo(){
        System.out.println("hai i am here");
    }
    public void color(){
        System.out.println("my color is red");
    }
}
public class Main extends Figo {
    public Main(){
        System.out.println("Figo Titanium");
    }
    public void price(){
        System.out.println("my price:6.64lakh");
    }

    @Override
    public void color() {
        System.out.println("my color is violet");
    }
    public static void main(String[] args){
        Main m= new Main();
        m.type();
        m.color();
        m.price();

    }
}

