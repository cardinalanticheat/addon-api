package me.clientastisch.cardinal.events.event.impl.player.inventory;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 5.0.0
 */
public abstract class PacketInventoryOpenEvent implements Event<PacketInventoryOpenEvent> {

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
    public abstract Type getType();

    public enum Type {

        PLAYIN,
        PLAYOUT;

    }

}