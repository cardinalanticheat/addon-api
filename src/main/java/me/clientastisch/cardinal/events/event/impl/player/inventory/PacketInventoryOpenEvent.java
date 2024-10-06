package me.clientastisch.cardinal.events.event.impl.player.inventory;

import me.clientastisch.cardinal.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 5.0.0
 */
public abstract class PacketInventoryOpenEvent implements Event<PacketInventoryOpenEvent> {

    public abstract Type getType();

    public static enum Type {
        PLAYIN, PLAYOUT
    }
}
