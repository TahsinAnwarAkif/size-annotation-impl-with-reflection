package net.therap.AnnotationAndReflection.app;

import net.therap.AnnotationAndReflection.domain.Address;
import net.therap.AnnotationAndReflection.domain.Details;
import net.therap.AnnotationAndReflection.domain.Person;
import net.therap.AnnotationAndReflection.domain.ValidationError;
import net.therap.AnnotationAndReflection.service.AnnotatedValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anwar
 * @since 1/4/18
 */
public class Main {

    public static void main(String[] args) {

        List<String> routes = new ArrayList<>();

        routes.add("Go To Left, Go To Right!");
        routes.add("Go To Right, Go To Left!");

        List<String> roles = new ArrayList<>();

        roles.add("Create!");
        roles.add("Update!");
        roles.add("Delete!");

        Address address = new Address(1, "120", new Details(1, "51", routes));

        Person person = new Person(13, "Tahsin", null, "Software Engineer", address, roles);

        List<ValidationError> validationErrors = AnnotatedValidator.validate(person);

        AnnotatedValidator.print(validationErrors);
    }
}