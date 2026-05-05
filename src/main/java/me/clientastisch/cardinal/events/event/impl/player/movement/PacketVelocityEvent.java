package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketVelocityEvent implements Event<PacketVelocityEvent> {

    /**
     *
     */
    public abstract Vector getVector();

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
    public abstract Cause getCause();

    public enum Cause {

        VELOCITY,
        EXPLOSION;

    }

}