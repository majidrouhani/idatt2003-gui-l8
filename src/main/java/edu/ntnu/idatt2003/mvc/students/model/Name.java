package edu.ntnu.idatt2003.mvc.students.model;

/**
 * Name.java - "Programmering i Java", 4.utgave - 2009-07-01
 */
public class Name {
  private static final String WHITESPACE = " ";
  private final String firstname;
  private final String lastname;
  private final String fullname;

  /**
   * Constructor: Oppretter et navnobjekt.
   * @param firstname
   * @param lastname
   */
  public Name(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.fullname = firstname.concat(WHITESPACE).concat(lastname);
  }

  /**
   * getFirstname() returnerer fornavnet.
   * @return firstname
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * getLastname() returnerer etternavnet.
  * @return  lastname
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * getFullname() returnerer fullt navn.
   * @return  fullname
   */
  public String getFullname() {
    return fullname;
  }

  @Override
  public String toString() {
    return "Name [firstname=" + firstname + ", lastname=" + lastname + ", name=" + fullname + "]";
  }
}