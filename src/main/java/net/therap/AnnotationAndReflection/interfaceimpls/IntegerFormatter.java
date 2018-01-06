package net.therap.AnnotationAndReflection.interfaceimpls;

import net.therap.AnnotationAndReflection.interfaces.AttributeValue;

/**
 * @author anwar
 * @since 3/13/18
 */
public class IntegerFormatter implements AttributeValue {

    @Override
    public Integer getAttributeValue(Object object) {
        return (Integer) object;
    }
}