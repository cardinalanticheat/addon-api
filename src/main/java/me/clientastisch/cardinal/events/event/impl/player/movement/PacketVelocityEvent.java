package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketVelocityEvent extends Event<PacketVelocityEvent> {

    /**
     *
     */
    public Vector getVector() {
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
    public Cause getCause() {
        return null;
    }

    public enum Cause {

        VELOCITY,
        EXPLOSION;

    }

}