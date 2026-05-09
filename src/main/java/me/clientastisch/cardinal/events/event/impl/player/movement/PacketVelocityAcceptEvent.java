package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketVelocityAcceptEvent extends Event<PacketVelocityAcceptEvent> {

    /**
     *
     */
    public Object getPacket() {
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
    public Vector getVector() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}