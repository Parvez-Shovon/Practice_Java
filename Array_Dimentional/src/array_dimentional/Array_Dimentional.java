package array_dimentional;
class Student{
    int rollNo;
    String name;
    int marks;

}
public class Array_Dimentional {

    public static void main(String[] args) {
       
        
        int nums[][] = {{3,434,43},{54,345,76},{5435,56,23}, {2,534,4352}};
//        int  nums[][] = new int[4][3];
//          int nums[2][1]= 5;
//        for(int i = 0; i<4; i++){
//            for(int j =0; j<3; j++){
//                nums[i][j] = (int) (Math.random() *10);
//            }
//        }
//        for(int i = 0; i<nums.length; i++){
//            for(int j =0; j<3; j++){
//                System.out.println(nums[i][j] + " ");
//            }     
//        }
        
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name ="Shovon";
        s1.marks = 90;
        
        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name ="Sotej";
        s2.marks = 76;
        
        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name ="Rana";
        s3.marks = 70;
       
        Student students[] = new Student[3]; 
        students[0] = s1;
        students [1] = s2;
        students [2] = s3;
        
//        for (int i = 0; i<students.length; i++){
//        System.out.println(students[i].name + ": " + students[i].marks);
//        }
//        
        for (Student stud : students){
            System.out.println(stud.name + ": " + stud.marks);           
        }
        
    }
    
}
