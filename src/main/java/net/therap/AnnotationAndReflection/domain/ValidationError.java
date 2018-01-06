package net.therap.AnnotationAndReflection.domain;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author anwar
 * @since 1/4/18
 */
public class ValidationError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Field field;

    private String message;

    public ValidationError(Field field, String message) {
        this.field = field;
        this.message = message;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error found on field: " + field + ". Message: " + message;
    }
}