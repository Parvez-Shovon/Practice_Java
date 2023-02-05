package pkgthis.pkgsuper;
class A extends Object{          /* Object write/ not write same*/

    public A() {
        System.out.println("in A");
    } 
    public A(int a) {
        super();                 /* basically call the constror of Object class*/
        System.out.println("in A int");
    } 
}

class B extends A{

    public B() {
        super(4);
        System.out.println("in B");
    }
    public B(int n) {
        this();                     /* this will call the constructor of own class */
        System.out.println("in B int");
    }   
}

public class ThisSuper {

    public static void main(String[] args) {
        B obj = new B(5);
    }
    
}
