package com.orangehrm.poc.utils.entities;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class EmployeeEntity {
    private String firstName;
    private String middleName;
    private String lastName;
    private String employeeId;

    public EmployeeEntity() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return String.format("%s %s %s",getFirstName(),getMiddleName(),getLastName());
    }
}
