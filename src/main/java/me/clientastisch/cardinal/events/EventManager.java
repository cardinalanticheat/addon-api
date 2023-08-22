package me.clientastisch.cardinal.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class EventManager {

    @Retention(RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(ElementType.METHOD)
    public static @interface Target {

        boolean printException() default false;

        boolean isSmart() default true;

        boolean isSync() default false;

        int timeout() default 0;

    }
}