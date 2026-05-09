package me.clientastisch.cardinal.events.event.impl.player.others;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketPayloadEvent extends Event<PacketPayloadEvent> {

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
    public String getChannel() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public String getMessage() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}