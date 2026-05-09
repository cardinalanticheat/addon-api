package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketSneakEvent extends Event<PacketSneakEvent> {

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
    public boolean isSneaking() {
        return false;
    }

}