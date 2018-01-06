package net.therap.AnnotationAndReflection.interfaceimpls;

import net.therap.AnnotationAndReflection.interfaces.AttributeValue;

/**
 * @author anwar
 * @since 3/15/18
 */
public class StringOrSimilarTypeFormatter implements AttributeValue {

    @Override
    public Integer getAttributeValue(Object object) {
        return object.toString().length();
    }
}