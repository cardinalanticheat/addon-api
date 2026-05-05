package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PlayerJumpEvent implements Event<PlayerJumpEvent> {

    /**
     *
     */
    public abstract Location getFrom();

    /**
     *
     */
    public abstract Location getTo();

    /**
     *
     */
    public abstract Type getType();

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

    /**
     *
     */
    public abstract double getCurrentRange();

    /**
     *
     */
    public abstract double getDeltaXZ();

    /**
     *
     */
    public abstract double getDeltaY();

    /**
     *
     */
    public abstract double getDeltaXYZ();

    /**
     *
     */
    public abstract double getDeltaX();

    /**
     *
     */
    public abstract double getDeltaZ();

    public enum Type {

        JUMP,
        JUMPREPEATED;

    }

}