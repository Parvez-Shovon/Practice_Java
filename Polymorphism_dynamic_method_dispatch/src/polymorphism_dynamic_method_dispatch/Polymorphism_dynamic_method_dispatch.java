package polymorphism_dynamic_method_dispatch;
class A{
    public void show(){
    System.out.println("in A show");
    }
}
class B extends A{
    
}
class C extends A{
    
}
public class Polymorphism_dynamic_method_dispatch {

    public static void main(String[] args) {
//        A obj = new B();
        A obj = new A();  
        obj.show();
        
        obj =new B();
        obj.show();
        
        obj = new C();
        obj.show();
        
        

    }
    
}
