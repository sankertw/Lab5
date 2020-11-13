import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    Student student2 = new Student();

    student2.setName("Tommy Sanker");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";

   // System.out.println("student1's name is " + student1.getName() + " and their GPA is " + student1.getGPA() + " and their major is " + student1.getMajor());
   
  student1.print();
  student2.print();

// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double sum = 0;

    for(int i = 0; i< gpas.size();i++){
      sum = sum + gpas.get(i);
    }
    System.out.println("The average GPA is " + sum / gpas.size());

  }
  


}


