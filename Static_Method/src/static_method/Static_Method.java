package static_method;

class Mobile {
    String brand;
    int price;
    static String name;
    
    public void show(){
        System.out.println(brand + ": " + name + ": " + price);
    }
    
    public static void show1(Mobile ob){
        System.out.println(ob.brand + ": " + name + ": " + ob.price);
    }
    
    static {
         name = "Smart Phone";
    }
    
    public Mobile(){
        brand = "";
        price = 500;
    } }
public class Static_Method {

    public static void main(String[] args) {
        // TODO code application logic here
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        
        obj1.brand = "Apple";
        obj1.price = 700;
        obj2.brand = "Samsung";
        
        obj1.show();
        Mobile.show1(obj2);
    }
    
}
