package net.therap.AnnotationAndReflection.interfaceimpls;

import net.therap.AnnotationAndReflection.interfaces.AttributeValue;

import java.util.Collection;

/**
 * @author anwar
 * @since 3/15/18
 */
public class CollectionFormatter implements AttributeValue {

    @Override
    public Integer getAttributeValue(Object object) {
        return ((Collection) object).size();
    }
}