package net.therap.AnnotationAndReflection.service;

import net.therap.AnnotationAndReflection.annotations.Size;
import net.therap.AnnotationAndReflection.domain.ValidationError;
import net.therap.AnnotationAndReflection.interfaces.AttributeValue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static net.therap.AnnotationAndReflection.utils.Constants.*;

/**
 * @author anwar
 * @since 1/4/18
 */
public class AnnotatedValidator {

    public static <E> List<ValidationError> validate(E entity) {

        Field[] fields = entity.getClass().getDeclaredFields();

        List<ValidationError> errors = new ArrayList<>();

        for (Field field : fields) {

            field.setAccessible(true);

            populateValidationErrorList(entity, field, errors);
        }

        return errors;
    }

    public static void print(List<ValidationError> validationErrors) {

        for (ValidationError error : validationErrors) {

            System.out.println(error.getMessage());
        }
    }

    private static <E> void populateValidationErrorList(E entity,
                                                        Field field,
                                                        List<ValidationError> errors) {

        Size size = field.getAnnotation(Size.class);

        if (size == null) {
            return;
        }

        AttributeValue attributeValue;
        Integer fieldValue = null;

        try {

            attributeValue = size.validateBy().getConstructor().newInstance();

            fieldValue = attributeValue.getAttributeValue(field.get(entity));

        } catch (Exception e) {

            System.out.println(e instanceof NoSuchMethodException
                    ? NO_ACCESSIBLE_NO_ARG_CONS_FOUND_EROR
                    .replace(TO_BE_REPLACED_WITH_VAR_NAME, size.validateBy().getSimpleName())
                    : VALUE_INVALID_EROR
                    .replace(TO_BE_REPLACED_WITH_VAR_NAME, field.getName()));
        }

        String errorMessage = constructErrorMessage(field, size);

        if (fieldValue != null
                && (fieldValue > size.max()
                || fieldValue < size.min())) {

            errors.add(new ValidationError(field, errorMessage));
        }
    }

    private static String constructErrorMessage(Field field,
                                                Size size) {

        return (field.getName() + OPEN_PARANTHESES + field.getType()
                + CLOSE_PARANTHESES
                + size.msg()).replace(TO_BE_REPLACED_WITH_VAR_NAME, field.getName())
                .replace(TO_BE_REPLACED_WITH_MIN_VALUE, Integer.toString(size.min()))
                .replace(TO_BE_REPLACED_WITH_MAX_VALUE, Integer.toString(size.max()));
    }
}