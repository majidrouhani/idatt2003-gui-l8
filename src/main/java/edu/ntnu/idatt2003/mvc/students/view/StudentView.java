package edu.ntnu.idatt2003.mvc.students.view;

import edu.ntnu.idatt2003.mvc.students.model.Student;
import edu.ntnu.idatt2003.mvc.students.model.StudentModel;

public class StudentView {

  static public void main(String[] args) {
    StudentView studentView = new StudentView();
    StudentModel studentModel = new StudentModel();
    studentView.printStudentDetails(studentModel);
  
  }
  public void printStudentDetails(StudentModel studentModel) {

    for (Student student : studentModel.getStudents()) {
      System.out.println("Student: ");
      System.out.println("Name: " + student.getName());
      System.out.println("Age: " + student.getAge());
    }
  }
}