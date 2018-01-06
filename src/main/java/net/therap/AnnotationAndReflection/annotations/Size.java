package net.therap.AnnotationAndReflection.annotations;

import net.therap.AnnotationAndReflection.interfaces.AttributeValue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static net.therap.AnnotationAndReflection.utils.Constants.*;

/**
 * @author anwar
 * @since 1/4/18
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Size {

    int min() default DEFAULT_MIN_VALUE;

    String msg() default DEFAULT_MSG_VALUE;

    int max() default DEFAULT_MAX_VALUE;

    Class<? extends AttributeValue> validateBy();
}