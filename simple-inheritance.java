class Show {
        public void colour() {
            System.out.println("my colour is white");
        }
}
class Car extends Show {
    public void colour(){
        System.out.println("my colour is white");
    }
        public void start(){
            System.out.println("its me car1 start");
        }
        public void stop(){
            System.out.println("its me car1 stop");
        }
 }
class New  {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.colour();
    }
}
