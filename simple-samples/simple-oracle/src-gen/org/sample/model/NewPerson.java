package org.sample.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class NewPerson implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private BigDecimal newid;
  
  public BigDecimal getNewid() {
    return this.newid;
  }
  
  public void setNewid(final BigDecimal newid) {
    this.newid = newid;
  }
  
  public NewPerson withNewid(final BigDecimal newid) {
    this.newid = newid;
    return this;
  }
  
  private LocalDateTime dateOfBirth;
  
  public LocalDateTime getDateOfBirth() {
    return this.dateOfBirth;
  }
  
  public void setDateOfBirth(final LocalDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public NewPerson withDateOfBirth(final LocalDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  
  private String ssn;
  
  public String getSsn() {
    return this.ssn;
  }
  
  public void setSsn(final String ssn) {
    this.ssn = ssn;
  }
  
  public NewPerson withSsn(final String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  private String firstName;
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
  
  public NewPerson withFirstName(final String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  private String lastName;
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public NewPerson withLastName(final String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  private String gender;
  
  public String getGender() {
    return this.gender;
  }
  
  public void setGender(final String gender) {
    this.gender = gender;
  }
  
  public NewPerson withGender(final String gender) {
    this.gender = gender;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPerson [newid=" + newid + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
  
  public String toStringFull() {
    return "NewPerson [newid=" + newid + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
}
