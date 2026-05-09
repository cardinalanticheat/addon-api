package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PlayerJumpEvent extends Event<PlayerJumpEvent> {

    /**
     *
     */
    public Location getFrom() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Location getTo() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Type getType() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Player getPlayer() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Object getPacket() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public double getCurrentRange() {
        return 0D;
    }

    /**
     *
     */
    public double getDeltaXZ() {
        return 0D;
    }

    /**
     *
     */
    public double getDeltaY() {
        return 0D;
    }

    /**
     *
     */
    public double getDeltaXYZ() {
        return 0D;
    }

    /**
     *
     */
    public double getDeltaX() {
        return 0D;
    }

    /**
     *
     */
    public double getDeltaZ() {
        return 0D;
    }

    public enum Type {

        JUMP,
        JUMPREPEATED;

    }

}