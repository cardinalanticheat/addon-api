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
        return null;
    }

    /**
     *
     */
    public Location getTo() {
        return null;
    }

    /**
     *
     */
    public Type getType() {
        return null;
    }

    /**
     *
     */
    public Player getPlayer() {
        return null;
    }

    /**
     *
     */
    public Object getPacket() {
        return null;
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