package edu.ntnu.idatt2003.mvc.students;

import edu.ntnu.idatt2003.mvc.students.model.StudentModel;
import edu.ntnu.idatt2003.mvc.students.view.StudentView;

public class StudentApp {

  static public void main(String[] args) {
    StudentView studentView = new StudentView();
    StudentModel studentModel = new StudentModel();
    studentView.printStudentDetails(studentModel);
  }
}