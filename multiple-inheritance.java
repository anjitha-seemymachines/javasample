public class Car{
public void type(){
System.out.println("I am maruti");
}
}
public class Maruti{
public void color(){
System.out.println("my colour is red");
}
}
public class Test extends Car,Maruti{
Test t= new test();
t.color();
t.types();
}
