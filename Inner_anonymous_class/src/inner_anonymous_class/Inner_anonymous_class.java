package inner_anonymous_class;
class A{
    public void show(){
        System.out.println("in A show");
    }
}
public class Inner_anonymous_class {

    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("in new inner show");
            }
        };
        obj.show();
        
    }
    
}
