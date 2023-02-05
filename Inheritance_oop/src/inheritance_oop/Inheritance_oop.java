package inheritance_oop;
class Calc {

    public Calc() {
    }
    
    int add(int num1, int num2){
        return num1 + num2;
    }
    int sub(int num1, int num2){
        return num1 - num2;
    }
}

class AdvCalc extends Calc {
    int mul(int num1, int num2){
        return num1 * num2;
    }
    int div(int num1, int num2){
        return num1 / num2;
    }
    
}

public class Inheritance_oop {

    public static void main(String[] args) {
        
        Calc obj = new Calc();
        AdvCalc ac = new AdvCalc();
        
        int r2= ac.sub(46,5);
        int r1 = obj.add(2, 5);
        System.out.println(r2);

    }
    
}
