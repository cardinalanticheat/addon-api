package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9996
 */
public abstract class PacketClientCommandEvent implements Event<PacketClientCommandEvent> {

    public abstract EnumClientCommand getClientCommand();

    public static enum EnumClientCommand {
        PERFORM_RESPAWN, REQUEST_STATS, OPEN_INVENTORY_ACHIEVEMENT, NULL;
    }
}
