package type_casting;

class A{
    public void show1(){
    System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
    System.out.println("in B show");
    }
}

public class Type_casting {

    public static void main(String[] args) {
       A obj = new B();         /* Up casting*/
       obj.show1();
       
       B obj1 = (B)obj;         /* Down casting*/
       obj1.show2();          
       
    }

}

