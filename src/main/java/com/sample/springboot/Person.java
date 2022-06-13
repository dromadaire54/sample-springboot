package com.sample.springboot;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
@Table(name="person")
public class Person {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="ID_PERSON")
  private Integer idPerson;

  @Column(name="USUAL_LAST_NAME")
  private String usualLastName;

  @Column(name="BIRTH_LAST_NAME")
  private String birthLastName;

  @Column(name="FIRST_NAME")
  private String firstName;

  public Integer getIdPerson() {
    return idPerson;
  }

  public void setIdPerson(Integer idPerson) {
    this.idPerson = idPerson;
  }

  public String getUsualLastName() {
    return usualLastName;
  }

  public void setUsualLastName(String usualLastName) {
    this.usualLastName = usualLastName;
  }

  public String getBirthLastName() {
    return birthLastName;
  }

  public void setBirthLastName(String birthLastName) {
    this.birthLastName = birthLastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}