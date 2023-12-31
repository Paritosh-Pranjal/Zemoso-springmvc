package com.zemoso.springdemo.mvc;


import com.zemoso.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message="is required")
    @Size(min=1,message="is required")
    private String lastName;
    @NotNull(message="is required")
    @Min(value=0,message="must be greator than zero")
    @Max(value=10,message="must be less than 10")
    private Integer freePasses;
    @NotNull(message="is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}" , message = "only 5 chars/digits")
    private String postalCode;
    @NotNull(message="is required")
    @CourseCode(value = "TOPS" , message =  "must start with TOPS")
    private String courseCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
