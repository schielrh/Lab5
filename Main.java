import java.util.*;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    // or can do this with the dot operator    
    //student1.name = "Arnold Spielberg";    
    //student1.gpa = 4.0;    
    //student1.major = "Electrical Engineering";       
    student1.print();

    //student2 is created and filled here
    Student student2 = new Student();
      student2.setName("Ryan Schiell");
      student2.setGPA(4.3);
      student2.setMajor("Information Systems");
    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
       gpas.add(student1.gpa);
       gpas.add(student2.gpa);

       double sum = 0;

       for(int i = 0; i < gpas.size(); i++){
          sum += gpas.get(i);
       }

       double average = sum / gpas.size();
       System.out.println("The average GPA is " + average);
  }
}

class Student {  
  String name;  
  double gpa;  
  String major; 

  String getName() {
    return name;  
  }  
  
  double getGPA() {
    return gpa;  
  }  
        
  String getMajor() {
    return major;  
  }  
              
  void setName(String theName) {
    name = theName;  
  }  
                    
  void setGPA(double theGPA) {
    gpa = theGPA;  
  }  
                          
  void setMajor(String theMajor) {
    major = theMajor;  
  }

  void print() {
    //System.out.println("student1's name is " + student1.getName() + " and their GPA is " + student1.getGPA() + " and their major is " + student1.getMajor());
    System.out.println("The student's name is " + name);
    System.out.println("The student's GPA is " + gpa);
    System.out.println("The student's major is " + major);
  }
}