package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketClientCommandEvent extends Event<PacketClientCommandEvent> {

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
    public EnumClientCommand getClientCommand() {
        return null;
    }

    public enum EnumClientCommand {

        PERFORM_RESPAWN,
        REQUEST_STATS,
        OPEN_INVENTORY_ACHIEVEMENT,
        NULL;

    }

}