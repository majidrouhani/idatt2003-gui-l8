package edu.ntnu.idatt2003.mvc.students.controller;

import edu.ntnu.idatt2003.mvc.students.model.Student;
import edu.ntnu.idatt2003.mvc.students.model.StudentModel;
import edu.ntnu.idatt2003.mvc.students.view.StudentView;

public class StudentController {
  private StudentView studentView;
  private StudentModel studentModel;

  public StudentModel getStudentModel() {
    return studentModel;
  }

  public void setStudentModel(StudentModel studentModel) {
    this.studentModel = studentModel;
  }

  public StudentView getStudentView() {
    return studentView;
  }

  public void setStudentView(StudentView studentView) {
    this.studentView = studentView;
  }

  public void updateModel(Student student) {
    this.studentModel.addStudent(student);
  }

  public void updateView() {
    studentView.printStudentDetails(studentModel);
  }
}