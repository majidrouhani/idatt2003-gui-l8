package edu.ntnu.idatt2003.mvc.students.view;

import edu.ntnu.idatt2003.mvc.students.model.Student;
import edu.ntnu.idatt2003.mvc.students.model.StudentModel;

public class StudentView {
  public void printStudentDetails(StudentModel studentModel) {

    for (Student student : studentModel.getStudents()) {
      System.out.println("Student: ");
      System.out.println("Name: " + student.getName());
      System.out.println("Age: " + student.getAge());
    }
  }
}