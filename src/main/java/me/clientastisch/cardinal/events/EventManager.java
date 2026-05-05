package me.clientastisch.cardinal.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public abstract class EventManager {

    @java.lang.annotation.Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Target {

        Priority priority() default Priority.MEDIUM;

        boolean doAnyways() default false;

        boolean isAsync() default false;

        long delay() default 0;

    }

}