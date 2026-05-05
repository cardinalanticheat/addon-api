package me.clientastisch.cardinal.events;

import lombok.Getter;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public enum Priority {

    LOWEST(0),
            LOW(0),
            MEDIUM(0),
            HIGH(0),
            HIGHEST(0);

    private final int index;

    Priority(int index) {
        this.index = index;
    }

}