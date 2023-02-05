package method_overriding;

class Calc {
    
    int add(int num1, int num2){
        return num1 + num2;
    }
}
    
class AdvCalc extends Calc {
    @Override
    int add(int num1, int num2){
        return num1 + num2 +1;
    }    
}

public class Method_overriding {

    public static void main(String[] args) {
        
        AdvCalc obj = new AdvCalc();
        Calc obj1 =new Calc();
        
        int r1 = obj.add(2, 5);
        System.out.println(r1);
        
    }
        
}

