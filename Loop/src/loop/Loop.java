package loop;

public class Loop {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        
////        while Loop
//        while (i<=4) {
//            System.out.println("Hi in whileLoop " + i);
//            i++;
//            
//        }
//
////      Do While Loop        
//         do {
//            System.out.println("Hi in do whileLoop " + i);
//            i++;           
//        }while (i<=4);
         
//         For Loop
        for(i =1; i<=5; i++){
            System.out.println("Day" + i);
            for(int j = 0; j<=9; j++){
                System.out.println("Hour " + (j+8)+ "-" + (j+9));
            }
        }

    }
    
}
