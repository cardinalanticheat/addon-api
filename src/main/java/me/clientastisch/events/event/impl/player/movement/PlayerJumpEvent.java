package me.clientastisch.events.event.impl.player.movement;

import me.clientastisch.events.event.Event;
import org.bukkit.Location;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PlayerJumpEvent implements Event<PlayerJumpEvent> {

    public abstract Location getFrom();

    public abstract Location getTo();

    public abstract double getDeltaXYZ();

    public abstract double getDeltaXZ();

    public abstract double getDeltaX();

    public abstract double getDeltaY();

    public abstract double getDeltaZ();

    public abstract Type getType();

    public static enum Type {
        JUMP, JUMPREPEATED
    }
}
