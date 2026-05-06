package me.clientastisch.cardinal.events;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class EventManager {

    @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Target {

        Priority priority() default Priority.MEDIUM;

        boolean doAnyways() default false;

        boolean isAsync() default false;

        long delay() default 0;

    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Important {

    }

}