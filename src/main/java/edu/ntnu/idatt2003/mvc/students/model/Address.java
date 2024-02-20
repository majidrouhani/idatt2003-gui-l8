package edu.ntnu.idatt2003.mvc.students.model;

/**
 * Address.java - "Programmering i Java", 4.utgave - 2009-07-01
 *  
 */
public class Address {
  private final int zipCode;
  private final String city;
  private final String state;

  /*
   * Constructor: Oppretter et adressobjekt.
   * @param zipCode
   * @param city
   * @param state
   */
  public Address(int zipCode, String city, String state) {
    this.zipCode = zipCode;
    this.city = city;
    this.state = state;
  }

  /**
   * getZipCode() returnerer postnummeret til adressen.
   * @return zipCode
   */
  public int getZipCode() {
    return zipCode;
  }

  /**
   * getCity() returnerer poststedet til adressen.
   * @return  city
   */
  public String getCity() {
    return city;
  }

  /**
   * getState() returnerer fylket til adressen.
   * @return  state
   */
  public String getState() {
    return state;
  }

  @Override
  public String toString() {
    return "Address [zipCode=" + zipCode + ", city=" + city + ", state=" + state + "]";
  }
}