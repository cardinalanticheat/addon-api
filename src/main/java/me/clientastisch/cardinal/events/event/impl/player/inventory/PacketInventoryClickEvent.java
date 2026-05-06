package me.clientastisch.cardinal.events.event.impl.player.inventory;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketInventoryClickEvent extends Event<PacketInventoryClickEvent> {

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
    public WindowClickType getClickType() {
        return null;
    }

    /**
     *
     */
    public Object getCarriedItemStack() {
        return null;
    }

    /**
     *
     */
    public int getSlot() {
        return 0;
    }

    /**
     *
     */
    public int getButton() {
        return 0;
    }

    /**
     *
     */
    public int getWindowId() {
        return 0;
    }

    /**
     *
     */
    public int getAction() {
        return 0;
    }

    public enum WindowClickType {

        PICKUP,
        QUICK_MOVE,
        SWAP,
        CLONE,
        THROW,
        QUICK_CRAFT,
        PICKUP_ALL,
        NULL;

    }

}