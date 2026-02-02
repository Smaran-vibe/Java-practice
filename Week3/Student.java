package Week3;

class studentBlueprint  {
     String StudentName;
     int StudentAGE;
     String StudentGender;
     
  public studentBlueprint (String StudentName,int StudentAGE ,String StudentGender){
        this.StudentName  = StudentName;
        this.StudentAGE = StudentAGE;
        this.StudentGender = StudentGender;


  }     
  public void displayStudentInfo(){
    System.out.println("Student Name: "+ StudentName);
    System.out.println("Student Age: "+ StudentAGE);
    System.out.println("Student Gender: "+ StudentGender);
  }
}
public class Student {
    public static void main(String[] args) {
        studentBlueprint student1 = new studentBlueprint("Smaran Aryal",19,"Male");
       
        
        studentBlueprint student2 = new studentBlueprint("Srijan Halkure",20,"Null" );
        student2.displayStudentInfo();

        studentBlueprint student3 = new studentBlueprint("Sharada ",20,"male" );
        student3.displayStudentInfo();

        student1.StudentAGE = 18;
        System.out.println("Updated Age of Student 1: " + student1.StudentAGE);
        student1.displayStudentInfo();

        studentBlueprint student4 = new studentBlueprint(null, 0, null);
        student4.displayStudentInfo();
    }
}

