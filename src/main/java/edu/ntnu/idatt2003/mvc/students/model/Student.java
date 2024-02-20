package edu.ntnu.idatt2003.mvc.students.model;

import java.time.LocalDate;
import java.time.Period;

/**
 * Student.java - "Programmering i Java", 4.utgave - 2009-07-01
 * Fra programliste 11.5 side 361.
 *
 * Komposisjon: Navneobjektet er gjemt inne i studentobjektet.
 * Klienten forholder seg ikke til klassen Navn i det hele tatt.
 */

public class Student {
  private final Name name;
  private final Address address;
  private final LocalDate birthday;
  private final String gender;

  /**
   * Constructor: Oppretter et studentobjekt.
   * 
   * @param firstname
   * @param lastname
   * @param birthday
   * @param gender
   * @param zipCode
   * @param city
   * @param state
   */
  public Student(String firstname, String lastname, LocalDate birthday, String gender, int zipCode, String city,
      String state) {
    this.name = new Name(firstname, lastname);
    this.birthday = birthday;
    this.gender = gender;
    this.address = new Address(zipCode, city, state);
  }

  /*
   * getAdress() returnerer en referanse til adressen til studenten.
   */
  public Address getAddress() {
    return address;
  }

  /*
   * getGender() returnerer en referanse til kjønnet til studenten.
   */
  public String getGender() {
    return gender;
  }

  /*
   * getBirthday() returnerer en referanse til fødselsdatoen til studenten.
   */
  public LocalDate getBirthday() {
    return birthday;
  }

  /**
   * getAge() returnerer alderen til studenten.
   * 
   * @return age
   */
  public int getAge() {
    LocalDate curDate = LocalDate.now();
    return Period.between(birthday, curDate).getYears();
  }

  /*
   * getLastName() returnerer en referanse til etternavnet til studenten.
   */
  public String getLastname() {
    return name.getLastname();
  }

  /**
   * getFirstName() returnerer en referanse til fornavnet til studenten.
   * 
   * @return firstname
   */
  public String getFirstname() {
    return name.getFirstname();
  }

  /**
   * getName() returnerer en referanse til navnet til studenten.
   * 
   * @return name
   */
  public String getName() {
    return name.getFullname();
  }

  /**
   * getUniqueIdasString() returnerer en unik id for studenten.
   * 
   * @return uniqueId
   */
  public String getUniqueIdasString() {
    return this.getBirthday().toString() + "-" + this.getLastname() + "-" + this.getFirstname() + "-"
        + this.getGender();
  }

  @Override
  public String toString() {
    return "Student [studentName=" + name + ", postalAddress=" + address + ", birthday=" + birthday
        + ", gender=" + gender + "]";
  }
}