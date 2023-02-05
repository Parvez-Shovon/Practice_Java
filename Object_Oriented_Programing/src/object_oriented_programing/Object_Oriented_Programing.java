package object_oriented_programing;
                      /* Encapsulation*/
class Human{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }
       
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name; 
    }
    
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;    
    }
}

public class Object_Oriented_Programing {
       
    public static void main(String[] args) {
        
        Human per = new Human();
        
        per.setName("Shovon");
        per.setAge(29);
        System.out.println(per.getName() + ": " + per.getAge());               
                      
    }

}
