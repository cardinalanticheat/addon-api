package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketSlotSwitchEvent implements Event<PacketSlotSwitchEvent> {

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
    public abstract long getSlot();

    /**
     *
     */
    public abstract long getLastSlot();

}