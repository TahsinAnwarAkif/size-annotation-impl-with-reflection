package net.therap.AnnotationAndReflection.domain;

import java.io.Serializable;

/**
 * @author anwar
 * @since 3/12/18
 */
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String postCode;

    private Details details;

    public Address(int id, String postCode, Details details) {
        this.id = id;
        this.postCode = postCode;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }
}