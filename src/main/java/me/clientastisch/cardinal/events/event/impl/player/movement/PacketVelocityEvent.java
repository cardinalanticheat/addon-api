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
    public Cause getCause() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    public enum Cause {

        VELOCITY,
        EXPLOSION;

    }

}