package me.clientastisch.cardinal.events.event.impl.player.inventory;

import me.clientastisch.cardinal.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketOpenInvEvent implements Event<PacketOpenInvEvent> {

    public abstract Type getType();

    public static enum Type {
        PLAYIN, PLAYOUT
    }
}
