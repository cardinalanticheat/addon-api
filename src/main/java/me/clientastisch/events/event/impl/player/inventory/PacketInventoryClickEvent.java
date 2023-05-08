package me.clientastisch.events.event.impl.player.inventory;

import me.clientastisch.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 3.1.0
 */
public abstract class PacketInventoryClickEvent implements Event<PacketInventoryClickEvent> {

    public abstract int getSlot();

    public abstract int getButton();

    public abstract int getWindowId();

    public abstract int getAction();

    public abstract WindowClickType getClickType();

    public enum WindowClickType {
            PICKUP, QUICK_MOVE, SWAP, CLONE, THROW, QUICK_CRAFT, PICKUP_ALL, NULL;
    }
}
