package net.therap.AnnotationAndReflection.domain;

import net.therap.AnnotationAndReflection.annotations.Size;
import net.therap.AnnotationAndReflection.interfaceimpls.CollectionFormatter;
import net.therap.AnnotationAndReflection.interfaceimpls.IntegerFormatter;
import net.therap.AnnotationAndReflection.interfaceimpls.StringOrSimilarTypeFormatter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anwar
 * @since 1/4/18
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(min = 18, max = 30, msg = "{var} should be {min}-{max}", validateBy = IntegerFormatter.class)
    private int age;

    @Size(min = 7, msg = "{var} cannot be less than {min}", validateBy = StringOrSimilarTypeFormatter.class)
    private String firstName;

    @Size(validateBy = StringOrSimilarTypeFormatter.class)
    private String lastName;

    private String details;

    private Address address;

    @Size(min = 7, msg = "{var} cannot be less than {min}", validateBy = CollectionFormatter.class)
    private List<String> roles;

    public Person() {
        this.roles = new ArrayList<>();
    }

    public Person(int age, String firstName, String lastName,
                  String details, Address address, List<String> roles) {

        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.details = details;
        this.address = address;
        this.roles = roles;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}