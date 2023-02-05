package cbstract_class;

abstract class Car{
    public abstract void drive();
//    public abstract void fly();  /* must define in extends class Audi or will be error*/
    public void playMusic(){
        System.out.println("Music Play");
    }    
}

class Audi extends Car{
    public void drive(){
        System.out.println("Driving..");
    }
}
public class Cbstract_class {

    public static void main(String[] args) {
        Car obj = new Audi();
        obj.playMusic();
        obj.drive();
        
    }
    
}
