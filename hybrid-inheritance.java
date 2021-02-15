public class University {
    public void type(){
        System.out.println("Kerala Technological University");
    }
}
public class College extends University {
    public void name(){
        System.out.println("College of Engineering,Cherthala");
    }
}
public class Branch extends University{
    public void stream(){
        System.out.println("Computer Science and Engineering");
    }
}
public class Student extends College,Branch{
    public void studentName(){
        System.out.println("my name is bob");
    }
    public static void main(String[] args){
        Student st = new Student();
        st.type();
        st.name();
        st.studentName();
        st.stream();
    }
}
