package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketSlotSwitchEvent extends Event<PacketSlotSwitchEvent> {

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
    public long getSlot() {
        return 0;
    }

    /**
     *
     */
    public long getLastSlot() {
        return 0;
    }

}